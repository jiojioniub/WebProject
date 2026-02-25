package com.work.controller;

import com.work.main.User;
import com.work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@Controller
@RestController
@RequestMapping("/users")//模块的公共映射
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result addUser(@RequestBody User user) {
        boolean flag = userService.addUser(user);
        return new Result(flag,flag?Code.ADD_OK:Code.ADD_ERR);
    }
    @PutMapping
    public Result changeUser(@RequestBody User user) {
        //获取文件的类型，创建文件存储路径
//        String type = user.getUser_headPortrait().split("/")[1].split(";")[0];
        String filePath ="F:\\JavaSelfProject\\SchoolFriend\\src\\main\\webapp\\pic\\upload\\"+user.getUser_id()+".txt";
        //将base64转码数据存到文件里
        String s = base64ToImage(user.getUser_headPortrait(), filePath);
        System.out.println(s);
        System.out.println(filePath);
        //将存储文件的地址存放到数据库里
        String path = "F:/JavaSelfProject//SchoolFriend/src/main/webapp/pic/upload/"+user.getUser_id()+".txt";
        user.setUser_headPortrait(path);

        boolean flag = userService.changeUser(user);
        return new Result(flag,flag?Code.UPDATE_OK:Code.UPDATE_ERR);
    }

    @DeleteMapping("/{user_code}")//映射路径可能不同所以要添加详细
    public Result deleteUser(@PathVariable Integer user_code) {
        boolean flag = userService.deleteUser(user_code);
        return new Result(flag,flag?Code.DELETE_OK:Code.DELETE_ERR);
    }
//    @RequestMapping(value="/select",params= {"user_code"})
    @GetMapping("/{user_code}")
    public Result getByCode(@PathVariable("user_code") Integer user_code) throws FileNotFoundException {
        User user = userService.getByCode(user_code);
        String picBase64 = getPicBase64(user.getUser_headPortrait());
        user.setUser_headPortrait(picBase64);
        Integer code = user != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = user != null ? "yeah": "查询失败，请重试！";
        System.out.println("?????");
        return new Result(user,code,mess);
    }
    @GetMapping
    public Result getAll() {
        List<User> all = userService.getAll();
        Integer code = all != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = all != null ? "yeah": "查询失败，请重试！";
        return new Result(all,code,mess);
    }

    /**
     * 将base64转码数据存到文件里
     * @param imgBase64
     * @param filePath
     * @return
     */
    public String base64ToImage(String imgBase64,String filePath){
        //Base64解码
        try {
            byte[] bytes = imgBase64.getBytes();
            File file = new File(filePath);
            OutputStream out = new FileOutputStream(file);
            out.write(bytes);
            out.flush();
            out.close();
            return  "true";//成功
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "false";//失败
    }

    /**
     *
     * @param filePath 传进来的路径
     * @return
     */
    public String getPicBase64(String filePath) throws FileNotFoundException {
        //读取路径下文件的文件

        FileInputStream fileInputStream = new FileInputStream(filePath);
        String s = null;
        try {
            int by ;
            while ((by = fileInputStream.read()) != -1) {
                s+=(char)by;
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        String s1 = StringStartTrim(s, "null");
        return s1;
    }
    /**
     *去掉指定字符串的开头的指定字符
     *@paramstream原始字符串
     *@paramtrim要删除的字符串
     *@return
     */
    public String StringStartTrim(String stream,String trim){
//null或者空字符串的时候不处理
        if(stream==null||stream.length()==0||trim==null||trim.length()==0){
            return stream;
        }
//要删除的字符串结束位置
        int end;
//正规表达式
        String regPattern="["+trim+"]*+";
        Pattern pattern=Pattern.compile(regPattern,Pattern.CASE_INSENSITIVE);
//去掉原始字符串开头位置的指定字符
        Matcher matcher=pattern.matcher(stream);
        if(matcher.lookingAt()){
            end=matcher.end();
            stream=stream.substring(end);
        }
//返回处理后的字符串
        return stream;
    }

}

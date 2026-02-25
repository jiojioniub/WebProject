package com.work.dao;

import com.work.main.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
//    新建用户,以下方式中#后写对象的属性，如果在表名后面加(id,name)这样的要写表中的字段名
    @Insert("insert into tb_user value " +
            "(null,#{user_code},#{user_username},#{user_password}," +
            "#{user_headPortrait},#{user_status},#{user_identity})")
    public void addUser(User user);

//    更改用户状态
    @Update("update tb_user set user_headPortrait=#{user_headPortrait},user_username=#{user_username},user_password=#{user_password} where user_code=#{user_code}")
    public void changeUser(User user);

//    保存用户信息
//    @Insert("insert into tb_user value " +
//            "(null,#{userCode},#{user_username},#{user_password}," +
//            "#{user_headPortrait},#{user_status},#{user_identity})")
//    public void changeUserInformation(User user);
//    删除用户
    @Delete("delete from tb_user where user_code=#{user_code}")
    public void deleteUser(Integer user_code);

//    获取id
    @Select("select * from tb_user where user_code=#{user_code}")
    public User getByCode(Integer user_code);
//    查询全部
    @Select("select * from tb_user ")
    public List<User> getAll();
}

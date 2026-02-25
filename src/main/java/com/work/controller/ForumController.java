package com.work.controller;

import com.work.main.Forum;
import com.work.main.User;
import com.work.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forums")//模块的公共映射
public class ForumController {

    @Autowired
    private ForumService forumService;

    @PostMapping
    public Result addForum(@RequestBody Forum forum){
        boolean flag = forumService.addForum(forum);
        return new Result(flag,flag?Code.ADD_OK:Code.ADD_ERR);
    }
    @PutMapping
    public Result updateForum(@RequestBody Forum forum){
        boolean flag = forumService.updateForum(forum);
        return new Result(flag,flag?Code.UPDATE_OK:Code.UPDATE_ERR);
    }
    @DeleteMapping
    public Result delForum(@PathVariable Integer forum_id){
        boolean flag = forumService.delForum(forum_id);
        return new Result(flag,flag?Code.DELETE_OK:Code.DELETE_ERR);
    }
    @GetMapping("/{forum_title}")
    public Result getForum(@PathVariable("forum_title") String forum_title){
        List<Forum> forum = forumService.getForum(forum_title);
        Integer code = forum != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = forum != null ? "yeah": "查询失败，请重试！";
        return new Result(forum,code,mess);
    }
    @GetMapping("/id/{forum_id}")
    public Result getForumId(@PathVariable("forum_id") Integer forum_id){
        Forum forumId = forumService.getForumId(forum_id);
        Integer code = forumId != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = forumId != null ? "yeah": "查询失败，请重试！";
        return new Result(forumId,code,mess);
    }
    @GetMapping
    public Result getAllForum(){
        List<Forum> forumList = forumService.getAllForum();
        Integer code = forumList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = forumList != null ? "yeah": "查询失败，请重试！";
        return new Result(forumList,code,mess);
    }

}

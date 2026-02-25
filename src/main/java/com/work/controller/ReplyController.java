package com.work.controller;

import com.work.main.Reply;
import com.work.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replys")//模块的公共映射
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @PostMapping
    public Result addReply(@RequestBody Reply reply) {
        boolean flag = replyService.addReply(reply);
        return new Result(flag,flag?Code.ADD_OK:Code.ADD_ERR);
    }

    @DeleteMapping
    public Result delReply(@PathVariable Integer reply_id) {
        boolean flag = replyService.delReply(reply_id);
        return new Result(flag,flag?Code.UPDATE_OK:Code.UPDATE_ERR);
    }

    @GetMapping
    public Result getAllReply() {
        List<Reply> allReply = replyService.getAllReply();
        Integer code = allReply != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = allReply != null ? "yeah": "查询失败，请重试！";
        return new Result(allReply,code,mess);
    }

    @GetMapping("/{reply_id}")
    public Result getReplyCount(Integer reply_id){
        Integer replyCount = replyService.getReplyCount(reply_id);
        Integer code = replyCount != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = replyCount != null ? "yeah": "查询失败，请重试！";
        return new Result(replyCount,code,mess);
    }
}

package com.work.dao;

import com.work.main.Reply;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReplyDao {
//    增加，删除回复
    @Insert("insert into tb_reply(user_code,reply_uplevel,reply_meaning,reply_other) value (#{user_code},#{reply_uplevel},#{reply_meaning},#{reply_other})")
    public void addReply(Reply reply);

    @Delete("delete from tb_reply where reply_id=#{reply_id}")
    public void delReply(Integer reply_id);

    @Select("select * from tb_reply")
    public List<Reply> getAllReply();

    @Select("select count(*) from tb_reply where reply_uplevel=#{reply_id}")
    public Integer getReplyCount(Integer reply_id);



}

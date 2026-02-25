package com.work.dao;

import com.work.main.Forum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ForumDao {

//    添加帖子，删除帖子，修改帖子内容，
    @Insert("insert into tb_forum value " +
            "(#{forum_id},#{user_code},#{forum_title}," +
            "#{forum_meaning},0,NOW())")
    public void addForum(Forum forum);

    @Update("update tb_forum set forum_title=#{forum_title}," +
            "forum_meaning=#{forum_meaning},forum_time=#{forum_time} " +
            "where forum_id=#{forum_id} ")
    public void updateForum(Forum forum);

    @Delete("delete from tb_forum where forum_id=#{forum_id}")
    public void delForum(Integer forum_id);

    @Select("select * from tb_forum where forum_title LIKE concat('%',#{forum_title},'%')")
//    @Select("select * from tb_forum where forum_title LIKE '%'+#{forum_title}+'%'")
    public List<Forum> getForum(String forum_title);

    @Select("select * from tb_forum where forum_id=#{forum_id}")
    public Forum getForumId(Integer forum_id);

    @Select("select * from tb_forum")
    public List<Forum> getAllForum();
}

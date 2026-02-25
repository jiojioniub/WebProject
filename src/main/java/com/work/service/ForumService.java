package com.work.service;

import com.work.main.Forum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ForumService {

    /**
     * 添加帖子
     * @param forum
     */
    public boolean addForum(Forum forum);
    /**
     *修改帖子
     * @param forum
     */
    public boolean updateForum(Forum forum);
    /**
     *删除帖子
     * @param forum_id
     */
    public boolean delForum(Integer forum_id);
    /**
     *根据题目查询
     * @param forum_title
     */
    public List<Forum> getForum(String forum_title);

    /**
     * 根据id查找帖子
     * @param forum_id
     * @return
     */
    public Forum getForumId(Integer forum_id);
    /**
     *查询所有
     * @param
     */
    public List<Forum> getAllForum();
}

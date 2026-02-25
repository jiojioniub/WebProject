package com.work.main;

import java.sql.Date;

public class Forum {

    private Integer forum_id;
    private Integer user_code;
    private String forum_title;
    private String forum_meaning;
    private Integer forum_count;
    private Date forum_time;

    public Forum() {
    }

    public Forum(Integer forum_id, Integer user_code, String forum_title, String forum_meaning, Integer forum_count, Date forum_time) {
        this.forum_id = forum_id;
        this.user_code = user_code;
        this.forum_title = forum_title;
        this.forum_meaning = forum_meaning;
        this.forum_count = forum_count;
        this.forum_time = forum_time;
    }

    public Integer getForum_id() {
        return forum_id;
    }

    public void setForum_id(Integer forum_id) {
        this.forum_id = forum_id;
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public String getForum_title() {
        return forum_title;
    }

    public void setForum_title(String forum_title) {
        this.forum_title = forum_title;
    }

    public String getForum_meaning() {
        return forum_meaning;
    }

    public void setForum_meaning(String forum_meaning) {
        this.forum_meaning = forum_meaning;
    }

    public Integer getForum_count() {
        return forum_count;
    }

    public void setForum_count(Integer forum_count) {
        this.forum_count = forum_count;
    }

    public Date getForum_time() {
        return forum_time;
    }

    public void setForum_time(Date forum_time) {
        this.forum_time = forum_time;
    }

    @Override
    public String toString() {
        return "Forum{" +
                "forum_id=" + forum_id +
                ", user_code=" + user_code +
                ", forum_title='" + forum_title + '\'' +
                ", forum_meaning='" + forum_meaning + '\'' +
                ", forum_count=" + forum_count +
                ", forum_time=" + forum_time +
                '}';
    }
}

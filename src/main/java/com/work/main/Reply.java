package com.work.main;

import java.util.Date;

public class Reply {

    private Integer reply_id;
    private Integer user_code;
    private Integer reply_uplevel;
    private String reply_meaning;
    private Integer reply_count;
    private String reply_other;
    private Date reply_time;

    public Reply() {
    }

    public Reply(Integer reply_id, Integer user_code, Integer reply_uplevel, String reply_meaning, Integer reply_count, String reply_other, Date reply_time) {
        this.reply_id = reply_id;
        this.user_code = user_code;
        this.reply_uplevel = reply_uplevel;
        this.reply_meaning = reply_meaning;
        this.reply_count = reply_count;
        this.reply_other = reply_other;
        this.reply_time = reply_time;
    }

    public Integer getReply_id() {
        return reply_id;
    }

    public void setReply_id(Integer reply_id) {
        this.reply_id = reply_id;
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public Integer getReply_uplevel() {
        return reply_uplevel;
    }

    public void setReply_uplevel(Integer reply_uplevel) {
        this.reply_uplevel = reply_uplevel;
    }

    public String getReply_meaning() {
        return reply_meaning;
    }

    public void setReply_meaning(String reply_meaning) {
        this.reply_meaning = reply_meaning;
    }

    public Integer getReply_count() {
        return reply_count;
    }

    public void setReply_count(Integer reply_count) {
        this.reply_count = reply_count;
    }

    public String getReply_other() {
        return reply_other;
    }

    public void setReply_other(String reply_other) {
        this.reply_other = reply_other;
    }

    public Date getReply_time() {
        return reply_time;
    }

    public void setReply_time(Date reply_time) {
        this.reply_time = reply_time;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "reply_id=" + reply_id +
                ", user_code=" + user_code +
                ", reply_uplevel=" + reply_uplevel +
                ", reply_meaning='" + reply_meaning + '\'' +
                ", reply_count=" + reply_count +
                ", reply_other='" + reply_other + '\'' +
                ", reply_time=" + reply_time +
                '}';
    }
}

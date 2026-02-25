package com.work.main;


import java.sql.Date;

public class Event {

    private Integer event_id;
    private Integer user_code;
    private String event_name;
    private String event_meaning;
    private Date event_date;
    private String event_place;

    public Event() {
    }

    public Event(Integer event_id, Integer user_code, String event_name, String event_meaning, Date event_date, String event_place) {
        this.event_id = event_id;
        this.user_code = user_code;
        this.event_name = event_name;
        this.event_meaning = event_meaning;
        this.event_date = event_date;
        this.event_place = event_place;
    }

    public Integer getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Integer event_id) {
        this.event_id = event_id;
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_meaning() {
        return event_meaning;
    }

    public void setEvent_meaning(String event_meaning) {
        this.event_meaning = event_meaning;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public String getEvent_place() {
        return event_place;
    }

    public void setEvent_place(String event_place) {
        this.event_place = event_place;
    }

    @Override
    public String toString() {
        return "Event{" +
                "event_id=" + event_id +
                ", user_code=" + user_code +
                ", event_name='" + event_name + '\'' +
                ", event_meaning='" + event_meaning + '\'' +
                ", event_date=" + event_date +
                ", event_place='" + event_place + '\'' +
                '}';
    }
}

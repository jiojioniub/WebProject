package com.work.main;

import java.sql.Date;

public class Activity {

    private Integer activity_id;
    private String activity_initiator;
    private Integer user_code;
    private String activity_parties;
    private String activity_name;
    private String activity_meaning;
    private Date activity_date;
    private String activity_place;

    public Activity() {
    }

    public Activity(Integer activity_id, String activity_initiator, Integer user_code, String activity_parties, String activity_name, String activity_meaning, Date activity_date, String activity_place) {
        this.activity_id = activity_id;
        this.activity_initiator = activity_initiator;
        this.user_code = user_code;
        this.activity_parties = activity_parties;
        this.activity_name = activity_name;
        this.activity_meaning = activity_meaning;
        this.activity_date = activity_date;
        this.activity_place = activity_place;
    }

    public Integer getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    public String getActivity_initiator() {
        return activity_initiator;
    }

    public void setActivity_initiator(String activity_initiator) {
        this.activity_initiator = activity_initiator;
    }

    public Integer getUser_code() {
        return user_code;
    }

    public void setUser_code(Integer user_code) {
        this.user_code = user_code;
    }

    public String getActivity_parties() {
        return activity_parties;
    }

    public void setActivity_parties(String activity_parties) {
        this.activity_parties = activity_parties;
    }

    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }

    public String getActivity_meaning() {
        return activity_meaning;
    }

    public void setActivity_meaning(String activity_meaning) {
        this.activity_meaning = activity_meaning;
    }

    public Date getActivity_date() {
        return activity_date;
    }

    public void setActivity_date(Date activity_date) {
        this.activity_date = activity_date;
    }

    public String getActivity_place() {
        return activity_place;
    }

    public void setActivity_place(String activity_place) {
        this.activity_place = activity_place;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activity_id=" + activity_id +
                ", activity_initiator='" + activity_initiator + '\'' +
                ", user_code=" + user_code +
                ", activity_parties='" + activity_parties + '\'' +
                ", activity_name='" + activity_name + '\'' +
                ", activity_meaning='" + activity_meaning + '\'' +
                ", activity_date=" + activity_date +
                ", activity_place='" + activity_place + '\'' +
                '}';
    }
}

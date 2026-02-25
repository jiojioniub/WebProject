package com.work.main;

import java.sql.Date;

public class Album {
    private Integer album_id;
    private String album_type;
    private String album_name;
    private String album_meaning;
    private Date album_date;
    private String album_place;//图片位置

    public Album() {
    }

    public Album(Integer album_id, String album_type, String album_name, String album_meaning, Date album_date, String album_place) {
        this.album_id = album_id;
        this.album_type = album_type;
        this.album_name = album_name;
        this.album_meaning = album_meaning;
        this.album_date = album_date;
        this.album_place = album_place;
    }

    public Integer getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(Integer album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String getAlbum_meaning() {
        return album_meaning;
    }

    public void setAlbum_meaning(String album_meaning) {
        this.album_meaning = album_meaning;
    }

    public Date getAlbum_date() {
        return album_date;
    }

    public void setAlbum_date(Date album_date) {
        this.album_date = album_date;
    }

    public String getAlbum_place() {
        return album_place;
    }

    public void setAlbum_place(String album_place) {
        this.album_place = album_place;
    }

    @Override
    public String toString() {
        return "Album{" +
                "album_id=" + album_id +
                ", album_type=" + album_type +
                ", album_name='" + album_name + '\'' +
                ", album_meaning='" + album_meaning + '\'' +
                ", album_date=" + album_date +
                ", album_place='" + album_place + '\'' +
                '}';
    }
}

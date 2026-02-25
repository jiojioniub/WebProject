package com.work.dao;

import com.work.main.Album;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AlbumDao {

//    状态相关对应——0开头是学校整体的校友会活动照片，1开头是年级（如2019级），然后加年级和专业班级，就是学号前9位，如201912083
    @Insert("insert into tb_album values (null,#{album_type},#{album_name},#{album_meaning},NOW(),#{album_place})")
    public void addAlbum(Album album);

    @Select("SELECT * from tb_album where album_type=#{album_type}")
    public List<Album> getAlbumType(String album_type);

//    public void getAlbumTime(Date album_date);

    @Select("SELECT * from tb_album")
    public List<Album> getAllAlbum();

}

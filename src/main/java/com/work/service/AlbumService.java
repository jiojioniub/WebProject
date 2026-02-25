package com.work.service;

import com.work.main.Album;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AlbumService {

    public boolean addAlbum(Album album);

    public List<Album> getAlbumType(String album_type);

//    public void getAlbumTime(Date album_date);

    public List<Album> getAllAlbum();
}

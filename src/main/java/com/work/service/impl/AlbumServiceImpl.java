package com.work.service.impl;

import com.work.dao.AlbumDao;
import com.work.main.Album;
import com.work.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    public boolean addAlbum(Album album) {
        albumDao.addAlbum(album);
        return true;
    }

    public List<Album> getAlbumType(String album_type) {

        return albumDao.getAlbumType(album_type);
    }

    public List<Album> getAllAlbum() {
        return albumDao.getAllAlbum();
    }
}

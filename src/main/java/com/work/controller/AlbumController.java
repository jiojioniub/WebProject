package com.work.controller;

import com.work.main.Album;
import com.work.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Result addAlbum(@RequestBody Album album) {
        boolean addAlbum = albumService.addAlbum(album);
        return new Result(addAlbum,addAlbum?Code.UPDATE_OK:Code.UPDATE_ERR);
    }

    @GetMapping("/{album_type}")
    public Result getAlbumType(@PathVariable String album_type) {
        List<Album> albumType = albumService.getAlbumType(album_type);
        Integer code = albumType != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = albumType != null ? "yeah": "查询失败，请重试！";
        return new Result(albumType,code,mess);
    }

    @GetMapping
    public Result getAllAlbum() {
        List<Album> allAlbum = albumService.getAllAlbum();
        Integer code = allAlbum != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = allAlbum != null ? "yeah": "查询失败，请重试！";
        return new Result(allAlbum,code,mess);
    }

}

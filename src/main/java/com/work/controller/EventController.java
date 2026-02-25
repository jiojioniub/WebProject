package com.work.controller;

import com.work.main.Event;
import com.work.service.EventService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public Result addEvent(Event event){
        Boolean flag = eventService.addEvent(event);
        return new Result(flag,flag?Code.UPDATE_OK:Code.UPDATE_ERR);
    }
    @GetMapping("/{event_name}")
    public Result getEventName(String event_name) {
        List<Event> eventName = eventService.getEventName(event_name);
        Integer code = eventName != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = eventName != null ? "yeah": "查询失败，请重试！";
        return new Result(eventName,code,mess);
    }
    @GetMapping("/desc")
    public Result getEvent() {
        List<Event> event = eventService.getEvent();
        Integer code = event != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = event != null ? "yeah": "查询失败，请重试！";
        return new Result(event,code,mess);
    }
    @GetMapping
    public Result getAllEvent() {
        List<Event> allEvent = eventService.getAllEvent();
        Integer code = allEvent != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = allEvent != null ? "yeah": "查询失败，请重试！";
        return new Result(allEvent,code,mess);
    }
}

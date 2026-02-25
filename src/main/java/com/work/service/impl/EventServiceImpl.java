package com.work.service.impl;

import com.work.dao.EventDao;
import com.work.main.Event;
import com.work.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventDao eventDao;

    public Boolean addEvent(Event event) {
        eventDao.addEvent(event);
        return true;
    }

    public List<Event> getEventName(String event_name) {
        return eventDao.getEventName(event_name);
    }

    public List<Event> getEvent() {
        return eventDao.getEvent();
    }

    public List<Event> getAllEvent() {
        return eventDao.getAllEvent();
    }
}

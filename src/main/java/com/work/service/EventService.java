package com.work.service;

import com.work.main.Activity;
import com.work.main.Event;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EventService {
    /**
     *
     * @param event
     */
    public Boolean addEvent(Event event);

    /**
     *
     * @param event_name
     * @return
     */
    public List<Event> getEventName(String event_name);

    /**
     *
     * @return
     */
    public List<Event> getEvent();

    /**
     *
     * @return
     */
    public List<Event> getAllEvent();
}

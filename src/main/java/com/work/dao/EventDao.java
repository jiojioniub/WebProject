package com.work.dao;

import com.work.main.Event;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EventDao {

    @Insert("insert into tb_event value " +
            "(null,#{user_code},#{event_name}," +
            "#{event_meaning},NOW(),#{event_place})")
    public void addEvent(Event event);

    @Select("select * from tb_event where event_name like concat('%',#{event_name},'%')")
    public List<Event> getEventName(String event_name);

    @Select("select * from tb_event ORDER BY event_date DESC LIMIT 3")
    public List<Event> getEvent();

    @Select("select * from tb_event")
    public List<Event> getAllEvent();
}

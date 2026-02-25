package com.work.dao;

import com.work.main.Activity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ActivityDao {

    @Insert("insert into tb_activity value " +
            "(null,#{activity_initiator},#{user_code},#{activity_parties},#{activity_name}," +
            "#{activity_meaning},NOW(),#{activity_place})")
    public void addActivity(Activity activity);

    @Update("update tb_activity set activity_parties=#{activity_parties} WHERE activity_id = #{activity_id}")
    public  void updateActivity(Activity activity);

    @Select("select * from tb_activity where activity_name like concat('%',#{activity_name},'%')")
    public List<Activity> getActivityName(String activity_name);

    @Select("select * from tb_activity where activity_id = #{activity_id}")
    public Activity getActivityId(Integer activity_id);

    @Select("select * from tb_activity ORDER BY activity_date DESC LIMIT 3")
    public List<Activity> getActivity();

    @Select("select * from tb_activity")
    public List<Activity> getAllActivity();
}

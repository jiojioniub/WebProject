package com.work.service;

import com.work.main.Activity;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ActivityService {

    /**
     * 添加活动
     * @param activity
     */
    public boolean addActivity(Activity activity);

    /**
     * 更新参与人数
     * @param activity
     * @return
     */
    public boolean updateActivity( Activity activity);

    /**
     * 根据名字搜索
     * @param activity_name
     */
    public List<Activity> getActivityName(String activity_name);

    /**
     * 获取活动id为多少多少的数据
     * @param activity_id
     */
    public Activity getActivityId(Integer activity_id);

    /**
     * 获取前三活动信息
     * @param
     */
    public List<Activity> getActivity();

    /**
     * 获取所有活动信息
     * @param
     */
    public List<Activity> getAllActivity();

}

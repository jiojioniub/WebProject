package com.work.service.impl;

import com.work.controller.Result;
import com.work.dao.ActivityDao;
import com.work.main.Activity;
import com.work.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public class ActivityServiceImpl  implements ActivityService {

    @Autowired
    private ActivityDao activityDao;

    public boolean addActivity(Activity activity) {
        activityDao.addActivity(activity);
        return true;
    }

    public boolean updateActivity( Activity activity){
        activityDao.updateActivity(activity);
        return true;
    }

    public  List<Activity> getActivityName(String activity_name) {
        try {
//          转码："如何"=>å¦ä½是由UTF-8转码为iso-8859-1，所以现在要把iso-8859-1转回utf-8，如下：
            String s1=new String(activity_name.getBytes("iso-8859-1"),"UTF-8");
            System.out.println("测试1"+s1);
            activity_name=s1;

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return activityDao.getActivityName(activity_name);
    }

    public Activity getActivityId(Integer activity_id) {
        return activityDao.getActivityId(activity_id);
    }

    public List<Activity> getActivity() {
        return activityDao.getActivity();
    }

    public List<Activity> getAllActivity() {
        return activityDao.getAllActivity();
    }
}

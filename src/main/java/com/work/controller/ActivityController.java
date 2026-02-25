package com.work.controller;

import com.work.main.Activity;
import com.work.main.User;
import com.work.service.ActivityService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    public Result addActivity(@RequestBody Activity activity){
        boolean addActivity = activityService.addActivity(activity);
        return new Result(addActivity,addActivity?Code.UPDATE_OK:Code.UPDATE_ERR);
    }
    @PutMapping
    public  Result updateActivity(@RequestBody Activity activity){
        boolean addActivity = activityService.updateActivity(activity);
        return new Result(addActivity,addActivity?Code.UPDATE_OK:Code.UPDATE_ERR);
    }
    @GetMapping("/{activity_name}")
    public Result getActivityName(@PathVariable String activity_name){
        List<Activity> activityList = activityService.getActivityName(activity_name);
        Integer code = activityList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = activityList != null ? "yeah": "查询失败，请重试！";
        return new Result(activityList,code,mess);
    }
    @GetMapping("/id/{activity_id}")
    public Result getActivityId(@PathVariable("activity_id") Integer activity_id){
        Activity activity = activityService.getActivityId(activity_id);
        Integer code = activity != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = activity != null ? "yeah": "查询失败，请重试！";
        return new Result(activity,code,mess);
    }
    @GetMapping("/desc")
    public Result getActivity(){
        List<Activity> activityList = activityService.getActivity();
        Integer code = activityList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = activityList != null ? "yeah": "查询失败，请重试！";
        return new Result(activityList,code,mess);
    }
    @GetMapping
    public Result getAllActivity(){
        List<Activity> activityList = activityService.getAllActivity();
        Integer code = activityList != null ? Code.SELECT_OK : Code.SELECT_ERR;
        String mess = activityList != null ? "yeah": "查询失败，请重试！";
        return new Result(activityList,code,mess);
    }
}

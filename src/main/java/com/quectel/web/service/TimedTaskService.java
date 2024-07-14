package com.quectel.web.service;

/**
 * 定时任务接口
 * @Author abner.guo
 * @Date 2024/7/14 11:07
 */
public interface TimedTaskService {

    /**
     * 创建几分钟之后的定时任务
     */
    void createTimedTask(Long gap);


    /**
     * 删除定时任务
     */
    void deleteTimedTask(Long taskId);
}

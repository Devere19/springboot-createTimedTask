package com.quectel.web.service.impl;

import com.quectel.web.service.TimedTaskService;
import com.xxl.job.core.biz.JobBiz;
import com.xxl.job.core.biz.model.JobParam;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.executor.XxlJobExecutor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author abner.guo
 * @Date 2024/7/14 11:07
 */
@Service
public class TimedTaskServiceImpl implements TimedTaskService {

    @Override
    public void createTimedTask(Long gap) {
        JobParam jobParam = new JobParam();
        jobParam.setGlueType("BEAN");
        jobParam.setExecutorBlockStrategy("SERIAL_EXECUTION");
        jobParam.setExecutorTimeout(0);
        jobParam.setExecutorFailRetryCount(1);
        jobParam.setAuthor("abner");
        //路由执行策略
        jobParam.setExecutorRouteStrategy("FIRST");
        jobParam.setJobGroup(136);
        jobParam.setJobCron("00 30 18 14 07 ? 2024");
        jobParam.setExecutorParam("执行参数");
        jobParam.setExecutorHandler("abner定时任务测试");
        jobParam.setJobDesc("abner任务描述");

        List<JobBiz> jobBizList = XxlJobExecutor.getJobBizList();
        JobBiz jobBiz = jobBizList.get(0);
        ReturnT<String> result = jobBiz.addJob(jobParam);
        int taskId = Integer.parseInt(result.getContent());
        System.out.println(taskId);
        ReturnT<String> stringReturnT = jobBiz.startJob(taskId);

    }

    @Override
    public void deleteTimedTask(Long taskId) {
        List<JobBiz> jobBizList = XxlJobExecutor.getJobBizList();
        JobBiz jobBiz = jobBizList.get(0);
        ReturnT<String> stringReturnT = jobBiz.delJob(Math.toIntExact(taskId));
    }


}

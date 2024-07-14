package com.quectel.web.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @Author abner.guo
 * @Date 2024/6/29 17:24
 */
@Component
public class MyJobHandler {
    @XxlJob("myJobHandler")
    public void myJobHandler() {
        // 任务逻辑代码

    }
}

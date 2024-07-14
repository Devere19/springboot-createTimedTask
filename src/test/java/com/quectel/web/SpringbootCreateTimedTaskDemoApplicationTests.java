package com.quectel.web;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.quectel.web.service.TimedTaskService;
import io.micrometer.core.instrument.util.JsonUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootCreateTimedTaskDemoApplicationTests {

    @Resource
    private TimedTaskService timedTaskService;
    @Test
    void contextLoads() {
        timedTaskService.createTimedTask(0L);
    }

    @Test
    void deleteTimedTask(){
        timedTaskService.deleteTimedTask(151921L);
    }

}

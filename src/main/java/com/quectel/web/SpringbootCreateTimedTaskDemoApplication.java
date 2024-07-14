package com.quectel.web;

import com.quectel.web.cloud.common.oauth.feign.EnableOAuth2ClientFeign;
import com.quectel.web.cloud.common.security.access.EnableSecurityAccess;
import com.quectel.web.cloud.common.xxljob.EnableXxlJob;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableOAuth2Client
@EnableOAuth2ClientFeign
@EnableResourceServer
@EnableSecurityAccess
@EnableFeignClients(basePackages = {"com.quectel.web","com.quectel.starter"})
@ComponentScan({"com.quectel.web", "com.quectel.starter"})
@EnableAsync
@EnableXxlJob
public class SpringbootCreateTimedTaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCreateTimedTaskDemoApplication.class, args);
    }

}

package com.zslin;

import org.quartz.core.QuartzScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kgzt.JobDemo;

/**
 * Created by 钟述林 393156105@qq.com on 2016/10/18 8:58.
 */
@SpringBootApplication
public class RootApplication {

    public static void main(String [] args) {
        SpringApplication.run(RootApplication.class, args);
        new JobDemo().run();
    }
}

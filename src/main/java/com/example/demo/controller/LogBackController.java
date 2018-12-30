package com.example.demo.controller;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author charleslai@139.com
 * @Title: LogBackController
 * @ProjectName demo_logback
 * @Description: TODO
 * @date 2018-12-2917:08
 */
@RestController
public class LogBackController {

    private static Logger logger = (Logger) LoggerFactory.getLogger(LogBackController.class);


    @GetMapping("/getBackLog")
    public String index() {

        for (int i = 0; i < 100; i++) {

            logger.info("index------------------------->"+i);
        }

        return "index";
    }
}

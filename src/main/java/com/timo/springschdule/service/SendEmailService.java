package com.timo.springschdule.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {
    //每隔1秒执行任务
    @Scheduled(cron = "0/1 * * * * ?")
    public void test(){
        System.out.println("******1********");
    }
}

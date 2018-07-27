package com.timo.springschdule.controller;

import com.timo.springschdule.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class SendEmailController {
    @Autowired
    SendEmailService sendEmailService;
    @RequestMapping("/send")
    public String  test(){
        sendEmailService.test();
        return "hello world";
    }

    @Scheduled(cron = "0/3 * * * * ?")
    public void schedule(){
        System.out.println("*****xyz*****");
    }
}

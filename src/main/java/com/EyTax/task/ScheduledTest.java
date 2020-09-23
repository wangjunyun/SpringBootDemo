package com.EyTax.task;


import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTest {

    @Scheduled(cron = "*/5 * * * * *")
    public void test() {
        System.out.println("4444444444444444");
    }
}

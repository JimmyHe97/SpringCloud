package pers.jimmy.feign.Service.impl;

import org.springframework.stereotype.Component;
import pers.jimmy.feign.Service.ScheduleServiceHi;

@Component
public class ScheduleServiceHiHystric implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

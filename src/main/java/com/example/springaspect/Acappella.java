package com.example.springaspect;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Acappella implements Performance {

    private static final String WHO = "Actor: ";

    private String name = "";

    @Override
    public void perform(boolean rst) {
        boolean result = rst;
        if (result) {
            log.info(WHO + " " + name + " Building a chord");
        } else {
            log.info(WHO + " " + name + " Making some strange things on scene");
            throw new IllegalArgumentException(WHO + " "+ name+" Actor falsified");
        }
    }

    public void setName(String performer) {
        name = performer;
    }

}

package com.example.springaspect;

import java.util.Random;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Acappella implements Performance {

    private static final String WHO = "Actor: ";

    @Override
    public void perform() {
        int result = new Random().nextInt(5);
        if (result > 2) {

        log.info(WHO + "Making some strange things on scene");
            throw new IllegalArgumentException(WHO + "Actor falsified");
        }
        else{
            log.info(WHO + "Building a chord");
        }
    }

}

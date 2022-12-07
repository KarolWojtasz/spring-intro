package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class RandomTextMessageService implements MessageService{

    public String[] randomMessages = {"jeden","dwa","trzy","cztery","piec","szesc","siedem","osiem","dziewiec","dycha"};
    @Override
    public String getMessage() {
        return randomMessages[(int) (Math.random() * (9))];
    }
}

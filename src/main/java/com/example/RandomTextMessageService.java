package com.example;

import org.springframework.stereotype.Component;

@Component("RandomTextMessageService")
public class RandomTextMessageService implements MessageService{
    public String[] randomMessages = {"jeden","dwa","trzy","cztery","piec","szesc","siedem","osiem","dziewiec","dycha"};

    @Override
    public String getMessage() {
        return randomMessages[(int) (Math.random() * (9))];
    }
}

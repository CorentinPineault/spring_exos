package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kungfu")
public class KungFu {

    @Value("Buddhist Palm")
    private String name;

    public KungFu(String name) {
        this.name = name;
    }

    public KungFu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KungFu{" +
                "name='" + name + '\'' +
                '}';
    }
}

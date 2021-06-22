package com.example.demo.models;

import org.springframework.stereotype.Component;

@Component("panda")
public class Panda {
    private KungFu kungfu;

    public Panda(KungFu kungfu) {
        this.kungfu = kungfu;
    }

    public Panda() {
    }

    public KungFu getKungfu() {
        return kungfu;
    }

    public void setKungfu(KungFu kungfu) {
        this.kungfu = kungfu;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "kungfu=" + kungfu +
                '}';
    }
}

package com.study_day01.extend.d4_extend_override;

import com.study_day01.extend.d4_extend_override.Person;

public class Npc extends Person {
    @Override
    public void eat() {
        System.out.println("Npc会吃更多的饭");
    }
}

package com.study_Basics.extend.extend_override;

public class Npc extends Person{
    @Override
    public void eat() {
        System.out.println("Npc会吃更多的饭");
    }
}

package com.example.intent_java_vazifa4.user;

import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

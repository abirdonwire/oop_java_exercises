package com.techreturners.cats;

public abstract class Cat implements Animal {
    private boolean isAsleepNow = false;
    private String food;
    private String setting;
    private int averageHeight;

    public Cat() {}

    public Cat(String food, String setting, int averageHeight) {
        this.food = food;
        this.setting = setting;
        this.averageHeight = averageHeight;
    }


    
}
package com.techreturners.cats;

public interface Cat {
String eat();
String getSetting();
int getAverageHeight();
boolean goToSleep();
boolean wakeUp();
boolean isAsleep();
}



public abstract class Cat implements Animal {
    private boolean isSleeping = false;
    private String food;
    private String setting;
    private int averageHeight;
} 

public Cat() {}

public Cat(String food, String setting, int averageHeight) {
    this.food = food;
    this.setting = setting;
    this.averageHeight = averageHeight;
}

public String eat() {
    return this.food;
}

public String getSetting() {
    return this.setting; 
}

public int getAverageHeight() {
    return this.averageHeight;
}

public boolean goToSleep() {
    return this.isSleeping = true; 
}

public boolean wakeUp() {
    return this.isSleeping = false;
}

public boolean isSleeping() {
    return this.isSleeping;
}
}
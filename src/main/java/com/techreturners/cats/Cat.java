package com.techreturners.cats;

public abstract class Cat implements makeAnimal {
    private boolean isSleeping = false;
    private String food;
    private String setting;
    private int averageHeight;
} /* The abstract class Cat is showing only the essential details, the related classes (Lion, Cheetah, Domestic Cat)
will all share these lines of code, and this abstract class will be extended by the related classes. The methods allow us to access
and modify the state of the Object to which they belong. */

public Cat() {

}

public Cat(String food, String setting, int averageHeight) {
    this.food = food;
    this.setting = setting;
    this.averageHeight = averageHeight;
}

public String eat() {
    return this.food;
}

public String getSetting() {
    return this.setting; /* Each get method returns the private variables, this is encapsulating all the state data of the Cat object */
}

public int getAverageHeight() {
    return this.averageHeight;
}

public boolean goToSleep() {
    return this.isSleeping = true; /* Each set method is setting the value of the private variables*/
}

public boolean wakeUp() {
    return this.isSleeping = false;
}

public boolean isSleeping() {
    return this.isSleeping;
}
}
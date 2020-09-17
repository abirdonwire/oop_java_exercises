package com.techreturners.cats;

public interface makeAnimal {
    String eat();
    String getSetting();
    int getAverageHeight();
    boolean goToSleep();
    boolean wakeUp();
    boolean isAsleep();
}

/*The makeAnimal interface specifies the methods (behaviour) of all animals, including cats. 
It is specifying, but not defining or implementing. All animals must implement this behaviour, but it could be any animal.*/
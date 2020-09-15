package com.techreturners.cats;

public class CheetahCat extends Cat {
    public CheetahCat() {
        super("Zzzzzzz", "wild", 90);
    }
}/* Cheetah inherits the behaviour of the Cat class and uses Polymorphism to update the state and behaviour of eating, setting and averageHeight
because all cats eat and sleep, but they aren't all asleep at the same time and they don't eat the same way. And they are all different sizes.*/
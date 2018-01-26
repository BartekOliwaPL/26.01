package com.infoshare;

public class Dog extends Animal {

    @Override
    public void eat(){
        super.eat();
        System.out.println("dog overriden");
    }

}

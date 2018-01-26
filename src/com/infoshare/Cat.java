package com.infoshare;

public class Cat extends Animal {

    @Override
    public void eat(){
        super.eat();
        System.out.println("cat overriden");
    }

    public int iii(int s){
        for (int i = 0; i < s; i++){
            System.out.println(i);
        }
        return s;
    }

    }

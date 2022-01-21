package com.company;

public class Amphibia {

    public void eat(){
        System.out.println("Я їм");
    }
    public void sleep(){
        System.out.println("Я сплю");
    }
    public void swim(){
        System.out.println("Я плаваю");
    }
    public void walk(){
        System.out.println("Я гуляю");
    }

    public void all(){
        eat();
        sleep();
        swim();
        walk();
    }
}

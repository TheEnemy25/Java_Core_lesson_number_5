package com.company;

public class Main {

    public static void main(String[] args) {
//    	 Завдання 1
	Pet dog = new Dog();
	dog.voice();
	Pet cat = new Cat();
	cat.voice();
	Pet cow = new Cow();
	cow.voice();
//    	 Завдання 2
	Car car= new Car();
	System.out.println(car.Speed);
//    	 Завдання 3
	Amphibia frog = new Frog();
	frog.all();
    }
}

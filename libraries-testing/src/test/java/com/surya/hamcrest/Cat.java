package com.surya.hamcrest;

public class Cat extends Animal {

	public Cat() {
		super("cat", false, "meow");
	}

	public String makeSound() {
		return getSound();
	}

}

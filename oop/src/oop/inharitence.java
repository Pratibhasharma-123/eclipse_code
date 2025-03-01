package oop;
class Animal {
    // Fields
    String name;
    int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    // Additional field for the Dog class
    String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        // Call the constructor of the parent class
        super(name, age);
        this.breed = breed;
    }

    // Method specific to Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class inharitence {

	public static void main(String[] args) {
		
    Dog myDog =new Dog("Buddy", 3, "Golden Retriever");
    myDog.eat();
    myDog.sleep();
    myDog.bark();
	}

}






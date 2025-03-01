package oop;

class  Animal{
	public void sound() {
		System.out.println("animal makes a sound");
	}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("dog barks");
	}
}

class Cat extends Animal{
	public  void sound() {
		System.out.println("cat meows");
	}
}
class  Ex extends Animal{
	public void sound() {
		System.out.println("my ex is dog he always barks");
	}
}


public class poly {

	public static void main(String[] args) {
	Animal myAnimal = new Animal();
	Animal myDog =new Dog();
	Animal myCat = new Cat();
    Animal past =new Ex();
    
    
    myAnimal.sound();
    myDog.sound();
    myCat.sound();
    past.sound();
	}

}



//public class Main {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal(); // Animal reference and object
//        Animal myDog = new Dog(); // Animal reference but Dog object
//        Animal myCat = new Cat(); // Animal reference but Cat object
//
//        myAnimal.sound(); // Calls the Animal class method
//        myDog.sound(); // Calls the Dog class method
//        myCat.sound(); // Calls the Cat class method
//    }
//}


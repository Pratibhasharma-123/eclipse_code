package oop;
class Student{
	String name;
	int age;
	public void getData() {
		System.out.println("The name of this student is "+this.name);
		System.out.println("The age of this student is "+this.age);
	}
	Student(){
		System.out.println("Consturtor called");

	}
}
class Pen{
	String color;
	public void printColor() {
		System.out.println("the color of this pen is "+ this.color);
	}
}

public class oops {
	

	public static void main(String[] args) {
		
      Student s1=new Student();
      s1.name="pratibha";
      s1.age = 24;
//      s1.getData();
//      
      Student s2=new Student();
      s2.name =s1.name;
      s2.age=21;
      
//      s2.getData();
      
      Pen p1 =new Pen();
      p1.color = "black";
      p1.printColor();
      
      
      Pen p2 =new Pen();
      p2.color = "red";
      p2.printColor();
      
      Pen p3 =new Pen();
      p3.color = "blue";
      p3.printColor();
      
      

      
      
	}

}
;
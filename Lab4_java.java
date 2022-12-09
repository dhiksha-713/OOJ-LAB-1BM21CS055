/*Develop a Java program to create an abstract class named Shape
that contains two integers and an empty method named printArea( ). Provide
three classes named Rectangle, Triangle and Circle such that each one of the
classes extends the class Shape. Each one of the classes contain only the
method printArea( ) that prints the area of the given shape.*/


import java.util.*;
import java. lang. Math. *;
abstract class Shape 
{
	int length, breadth;
	Scanner scan=new Scanner(System.in);
	abstract void printArea();
}
class Rectangle extends Shape
{
	void printArea()
	{
		System.out.println("Enter length and breadth: ");
		length=scan.nextInt();
		breadth=scan.nextInt();
		int area= length*breadth;
		System.out.println("The area of rectangle is:\n"+area);
	}
}
class Triangle extends Shape
{
	void printArea()
	{
		System.out.println("Enter Base length and Height: ");
		length=scan.nextInt();
		breadth=scan.nextInt();
		int area= (length*breadth)/2;
		System.out.println("The area of triangle is:\n"+area);
	}
}
class Circle extends Shape
{
	void printArea()
	{
		System.out.println("Enter radius of circle: ");
		length=scan.nextInt();
		double area= Math.PI*(length*length);
		System.out.println("The area of circle is:\n"+area);

	}
}
class s_main
{
   public static void main(String args[])
   {
		int ch;
		Scanner ss=new Scanner(System.in);
		while(true)
		{
		System.out.println("MENU\nSelect Shape\n1.Rectangle\n2.Triangle\n3.Circle");
		ch=ss.nextInt();
		switch(ch)
		{
			case 1: Rectangle r1= new Rectangle(); r1.printArea(); break;
			case 2: Triangle t1=new Triangle(); t1.printArea(); break;
			case 3: Circle c1= new Circle(); c1.printArea(); break;
			default: System.out.println("Invalid Input, Try Again!");
		}
            }
   }
}
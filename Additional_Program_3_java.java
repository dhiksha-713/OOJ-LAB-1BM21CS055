/*Create an abstract class Calculate which has three double members -say x,
y and result. Include a method calc. Derive three classes
from Calculate which performs any three arithmetic operations on the two
variables x and y and assign the result to the variable result.
Make appropriate declarations and definitions.*/

import java.util.Scanner;

abstract class Calculate
{
 	double x,y,result;
	void input()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
  		x=ss.nextDouble();
 		y=ss.nextDouble();
	}
 	abstract void calc();
}
class Add extends Calculate
{
 	void calc()
	{
		System.out.println("\nAddition");
  		input();
  		result = x+y;
  		System.out.println(x+" + "+y+" = "+result);
 	}
}
class Subtract extends Calculate
{
 	void calc()
	{
		System.out.println("\nSubtraction");
            input();
  		result = x-y;
  		System.out.println(x+" - "+y+" = "+result);
 	}
}
class Multiply extends Calculate
{
 	void calc()
	{
		System.out.println("\nMultiplication");
  		input();
  		result = x*y;
  		System.out.println(x+" X "+y+" = "+result);
 	}
}
class A_main
{
   public static void main(String args[])
   {
  		Add a = new Add();
  		Subtract s = new Subtract();
  		Multiply m = new Multiply();
		System.out.println("\nArithmetic Operations are:");
  		a.calc();
  		s.calc();
  		m.calc();
   }
}
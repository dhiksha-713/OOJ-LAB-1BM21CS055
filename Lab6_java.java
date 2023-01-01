/*Write a program that demonstrates handling of exceptions in inheritance tree. Create
a base class called “Father” and derived class called “Son” which extends the
base class. In Father class, implement a constructor which takes the age and
throws the exception WrongAge( ) when the input age<0. In Son class, implement
a constructor that cases both father and son’s age and throws an exception if
son’s age is >=father’s age.*/

import java.util.Scanner;
class WrongAge extends Exception
{
	WrongAge(){}
	String msg=new String();
	WrongAge(String s)
	{  msg=s; }
	public String toString()
	{  return msg; }
}
class ErrorAge extends WrongAge
{
	String msg1=new String();
	ErrorAge(String ss)
	{  msg1=ss; }
	public String toString()
	{  return msg1; }
}
class Father{
    	int age;
    	Scanner in=new Scanner(System.in);
    	Father()
	{
        System.out.println("Enter the father's age: ");
        age=in.nextInt();
      }
    	void ex1() throws WrongAge
    	{
         if(age<=0)
         throw new WrongAge("Invalid input. Father's age can not be lesser than 0");
    	}
}
class Son extends Father
{
    	int age;
  	Son()
	{
    	   System.out.println("Enter the age of son: ");  
    	   age=in.nextInt();
  	}
  	void ex2() throws ErrorAge
	{
      	if(age<=0||age>super.age)
         		throw new ErrorAge("Son's age cannot be greater than that of Father");
		else
 		{
		System.out.println("FATHER'S AGE:"+super.age+"\nSON'S AGE:"+age);
  		}

  	}		
}
class A_main
{
    public static void main(String[] args)
    {
        Son s=new Son();
        try
	  {
            s.ex1();
        }
        catch(WrongAge e)
	  {
            System.out.println(e);
        }
        try
        {
            s.ex2();
        }
        catch(ErrorAge e)
	  {
            System.out.println(e);
        }

    }
}

/* Develop a Java program to create a class Student with members usn, name,
an array credits and an array marks. Include methods to accept and display
details and a method to calculate SGPA of a student. */

import java.util.Scanner;
class Student
{
   String name,usn;
   int marks[]=new int[5];
   int credits[]=new int[5];

   void input()
   {
	 Scanner ss=new Scanner(System.in);
	 System.out.println("Enter your name:");
	 name=ss.nextLine();
	 System.out.println("Enter your USN:");
	 usn=ss.next();
	 System.out.println("Enter the marks of each subject:");
       for(int i=0;i<5;i++)
       {
   		marks[i]=ss.nextInt();
       }
	 System.out.println("Enter the number of credits of each subject:");
	 for(int i=0;i<5;i++)
	 {
   		credits[i]=ss.nextInt();
	 }
   }
   void display()
   {
       System.out.println("NAME:"+" "+name);
	 System.out.println("USN:"+" "+usn);
	 for(int i=0;i<5;i++)
	 {
   		System.out.println("Marks of subject "+(i+1)+"=  "+marks[i]);
   		System.out.println("Number of credits for subject "+(i+1)+"=  "+credits[i]);
	 }
   }
   void calc()
   {
	 int gr_point[]=new int[5];
	 int sgpa=0; 
	 int sum=0;
	 float res;
	 for(int i=0;i<5;i++)
	 {
   		if(marks[i]>=90)
			gr_point[i]=10;
   		else if(marks[i]>=80)
			gr_point[i]=9;
   		else if(marks[i]>=70)
			gr_point[i]=8;
   		else if(marks[i]>=60)
			gr_point[i]=7;
   		else if(marks[i]>=50)
			gr_point[i]=6;
   		else if(marks[i]>=40)
			gr_point[i]=5;
   		else if(marks[i]>=35)
			gr_point[i]=4;
   		else if(marks[i]<35 && marks[i]>0)
			gr_point[i]=0;
   		else
      		System.out.println("Invalid marks for subject "+(i+1)+" entered. Try again!");
   		sgpa+=(gr_point[i]*credits[i]);
   		sum+=credits[i];
	 }
	 res=(float)sgpa/sum;
	 System.out.println("SGPA= "+res);
    }
}
class sgpa
{
   public static void main(String xx[])
   {
	 Student s1=new Student();
	 s1.input();
	 s1.display();
	 s1.calc();
   }
}

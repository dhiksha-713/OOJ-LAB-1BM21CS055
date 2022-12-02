/*Create a class Book which contains four members: name, author, price,
num_pages. Include a constructor to set the values for the members. Include
methods to set and get the details of the objects. Include a toString( ) method
that could display the complete details of the book. Develop a Java program
to create n book objects.*/

import java.util.Scanner;
class Book
{
  String name, author;
  double price;
  int num_pages;
  
  Book()
  {
	name="";
	author="";
	price=0.0;
	num_pages=0;
  }
  void input() 
  {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the name of the book:");
	name=ss.nextLine();
	System.out.println("Enter the author of the book:");
	author=ss.nextLine();
	System.out.println("Enter the price of the book:");
	price=ss.nextDouble();
	System.out.println("Enter the number of pages of the book:");
	num_pages=ss.nextInt();
  }
  public String toString()
  {
	return ("NAME: "+name+"\nAUTHOR: "+author+"\nPRICE: "+price+"/-"+"\nNUMBER OF PAGES: "+num_pages+"\n");
  }
}
class book_main
{
  public static void main(String xx[])
  {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the number of books:");
	int n=ss.nextInt();
	Book books[] = new Book[n];
	for(int i=0;i<n;i++)
	{
		books[i]=new Book();
		books[i].input();
		System.out.println("\nBOOK DETAILS:");
		System.out.println(books[i]);
	}
  }
}
	
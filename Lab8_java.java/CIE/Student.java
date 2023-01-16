package CIE;

import java.util.*;

public class Student
{
    public String usn, name; 
    public int sem;
    public void getd()
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter USN, NAME & SEM");
        usn=ss.next(); name=ss.next();
        sem= ss.nextInt();
    }
    public void disp()
    {
        System.out.println("\nStudent Details:\nUSN:"+usn+"\nNAME:"+name
        +"\nSEM:"+sem);
    }
}
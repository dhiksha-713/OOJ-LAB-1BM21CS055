package CIE;
import java.util.*;
public class Internals 
{
    public int Imarks[]= new int[5];
    public void getmi()
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter marks scored in internals of 5 courses:");
        for(int i=0; i<=4; i++)
        {  Imarks[i]=ss.nextInt(); }
    }
    public void dispmi()
    {
        System.out.println("INTERNAL MARKS");
        for(int j=0; j<=4; j++)
        {  System.out.println("Subject"+j+"="+Imarks[j]); }
    }
}
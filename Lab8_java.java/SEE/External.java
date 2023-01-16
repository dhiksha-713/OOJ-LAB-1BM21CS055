package SEE;

import java.util.Scanner;
import CIE.*;
public class External extends CIE.Internals
{
    int Smarks[]= new int[5];
    public void getm()
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter external marks scored in 5 courses:");
        for(int i=0; i<=4; i++)
        {  Smarks[i]=ss.nextInt(); }
    }
    public void dispm()
    {
        System.out.println("EXTERNAL MARKS");
        for(int i=0; i<=4; i++)
        {  System.out.println("Subject"+i+"="+Smarks[i]); }
    }
    public void finalcal()
    {
	int Final[]=new int[5];
        for(int j=0; j<=4; j++)
        {  Final[j]=Imarks[j]+(Smarks[j]/2); }
        System.out.println("FINAL MARKS");
	for(int i=0; i<=4; i++)
	{  System.out.println("Subject"+(i+1)+"="+Final[i]); }
  }
}
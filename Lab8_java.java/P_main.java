import CIE.*;
import SEE.*;
import java.util.*;

class P_main
{ public static void main(String arg[])
  {
	Scanner ss=new Scanner(System.in);
	System.out.println("Enter the number of students:");
	int n=ss.nextInt();
	Student s[] = new Student[n];
	for(int i=0;i<n;i++)
	{
		s[i]= new Student();
 		s[i].getd();s[i].disp();
		External e1=new External(); 
        	e1.getmi(); e1.dispmi();
		e1.getm(); e1.dispm();
		e1.finalcal();
	}
	
  }
}
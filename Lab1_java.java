import java.math.*;
import java.util.*;
class Quadratic
{
    public static void main(String xx[])
    {
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        double a= ss.nextDouble();
        System.out.print("Enter the value of b:");
        double b= ss.nextDouble();
        System.out.print("Enter the value of c:");
        double c= ss.nextDouble();
        double d=((b*b)-(4*a*c));
        if(a!=0)
        {
          if(d>0)
          {
             double d1=((-b+Math.pow(d, 0.5))/(2.0*a));
             double d2=((-b-Math.pow(d, 0.5))/(2.0*a));
             System.out.println("The Roots are real and distinct\n");
             System.out.println("The Roots are:"+d1+"\t"+d2);
          }
          else if(d==0.0)
          {
             double rr=((-b+Math.pow(d, 0.5))/(2.0*a)); //real root
             System.out.println("The Roots are real and equal\n");
             System.out.println("The Root is:"+rr);
          }
          else if(d<0)
          {
             double ir=((-b/(2.0*a))); //imaginary root
             double img=(Math.pow(Math.abs(d),0.5)/(2.0*a));
             System.out.println("The Roots are imaginary\n");
             System.out.println("Roots are:"+ir+"+i"+img+ " and"+ir+"-i"+img);
          }
          else
             System.out.println("INVALID INPUTS. TRY AGAIN!");
       }
       else
             System.out.println("INVALID INPUTS. TRY AGAIN!");
    }
}

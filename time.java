import java.util.Scanner;
class Time
{
	int hour, min, sec;
	void input_time()
	{
	  Scanner ss=new Scanner(System.in);
	  System.out.println("Enter a time in hour, minutes and seconds:");
	  hour=ss.nextInt();
	  min=ss.nsdaextInt();
	  sec=ss.nextInt();
	}
	void Time(int a, int b, int c)
	{ hour=a;min=b;sec=c;}
	Time add_time(Time t)
	{ 
	  //int hour1=0, min1=0;
	  Time t1=new Time();
	  t1.sec=t.sec+this.sec;
	  if(t1.sec>=60)
	  {
		t1.min=(t1.sec/60);
		t1.sec=(t1.sec%60);   
        }
	  t1.min=t1.min+t.min+this.min;
	  if(t1.min>=60)
	  {
		t1.hour=(t1.min/60);
		t1.min=(t1.min%60);   
        }
	  t1.hour=t1.hour+t.hour+this.hour;
	  return t1;
	}
	void Display()
	{ System.out.println("Normalized time is:" +this.hour+" hours"+this.min+" minutes"+this.sec+" seconds");}
	Time()
	{ hour=0;min=0; sec=0;}

}

class t_main
{
   public static void main(String xx[])
   {
	Time t4=new Time();
	Time t5=new Time();
	t4.input_time();
	t5.input_time();
	Time t6= new Time();
	t6= t4.add_time(t5);
	t6.Display();
   }
}

/* Write a program which creates two threads, one thread displaying “BMS College of
Engineering” once every ten seconds and another displaying “CSE” once every two
seconds.*/

class ThreadDemo implements Runnable
{
String a;
int time;
Thread t1;
Call(String tn,int ti)
{
a=tn; time=ti;
t1=new Thread(this,a);
t1.start();
}
public void run()
{
try{
for(int i=0;i<10 ;i++)
{
System.out.println(a);
Thread.sleep(time);
}
   }
catch(InterruptedException ie)
{
System.out.println(name+"Inturrupted ");
}
}
}

class T_main
{
public static void main(String xx[])
{
new Call("BMS College of Enginnering",10000);
new Call("CSE",2000);
}
}
/*Develop a Java program to create a classPatient with data members pt_id, pt_name, pt_age, doc.
  The program should include the following functionalities:
  Accept n patient details.
  Accept a patient id and display his/her details.
  Accept the name of the doctor and display the names of all the patients treated  by him/her.*/

import java.util.Scanner;
class Patient
{
	int pt_id, pt_age; 
	String pt_name, doc;
	void accept()
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Patient ID, Patient Name, Patient's age and Patient's Doctor:");
		pt_id=s.nextInt();
		pt_name=s.next();
		pt_age=s.nextInt();
		doc=s.next();
	}
	void display_id(int id)
	{
		if(id==pt_id)
		{ 	
			System.out.println("\nPATIENT DETAILS:");
			System.out.println("\nPATIENT ID:"+pt_id+"\nPATIENT'S NAME:"+pt_name+"\nPATIENT'S AGE: "+pt_age+"\nPATIENT'S DOCTOR:"+doc);
		}
	}
	void display_doc(String doctor)
	{
		if(doctor.equals(doc))
		{
			System.out.println("\nName of the Patient:");
			System.out.println(pt_name);
		}
	}
}

class P_main
{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of Patients");
		int n=ss.nextInt();
		Patient p1[]=new Patient[n];
		for(int i=0;i<n;i++)
		{
			p1[i]=new Patient();
			System.out.println("\nEnter Patient "+(i+1)+" details");
			p1[i].accept();
		}
		System.out.println("\nEnter the Patient ID whose details you want to display");
		int pt_id=ss.nextInt();
		for(int i=0;i<n;i++)
		{
			p1[i].display_id(pt_id);
		}
		System.out.println("\nEnter the Doctor's name whose Patients you want to display");
		String doc=ss.next();
		for(int i=0;i<n;i++)
		{
			p1[i].display_doc(doc);
		}
	}
}



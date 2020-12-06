package StudentDiary;

import java.io.Serializable;
import java.util.Scanner;

import StudentDiary.InvalidPhoneNumberException;

public class Faculty implements Serializable{
	
	String name;
	String idno;
	String dept;
	String position;
	double phoneNo;
	int age;
	String gender;
	
	public Faculty(){
		name=null;
		idno=null;
		dept=null;
		position=null;
		phoneNo=0;
		age=0;
		gender="";
	}
	public void getf()
	{	try {
		double ph;
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Faculty name:");
		this.name=s.next();
		System.out.println("Enter Faculty id no:");
		this.idno=s.next();
		System.out.println("Enter Faculty department:");
		this.dept=s.next();
		System.out.println("Enter Faculty position:");
		this.position=s.next();
		System.out.println("Enter Faculty phone no:");
		ph=s.nextDouble();
		if(ph<10) 
			throw new InvalidPhoneNumberException();
		else 
			this.phoneNo=ph;
		System.out.println("Enter Faculty age:");
		a=s.nextInt();
	    	 this.age=a;
		System.out.println("Enter Faculty gender:");
		this.gender=s.next();
	}
	catch(InvalidPhoneNumberException e) {
		System.out.println(e);
		System.exit(0);
	}
	}
	

	public void displayf()
	{
		System.out.println(name+"details");
		System.out.println(idno);
		System.out.println(dept);
		System.out.println(position);
		System.out.println(phoneNo);
		System.out.println(age);
		System.out.println(gender);
	} 

}
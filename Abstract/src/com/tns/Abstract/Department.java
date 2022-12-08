package com.tns.Abstract;

import java.util.Scanner;

abstract class Pondicherry_University
{
	abstract void Dep_Available();
	abstract void Fees();
	abstract void Location();
	abstract void FeedBack();
}
class SKCET extends Pondicherry_University
{
	void Dep_Available()
	{
		System.out.println("Shri Krishnaa College Of Engineering And Technology");
		System.out.println("CSE");
		System.out.println("IT");
		System.out.println("EEE");
		System.out.println("ECE");
		System.out.println("MECH");
	}
	void Fees()
	{
		System.out.println("Rs:50,000/- per Annual");
	}
	void Location()
	{
		System.out.println("Address:");
		System.out.println("Mannadipet");
		System.out.println("Thirukkanur Post");
		System.out.println("Pin Code:605 501");
	}
	void FeedBack()
	{
		System.out.println("FeedBack");
		System.out.println("Nice Environment and few staffs only available");
		System.out.println("Trusted Based :) ");
	}
}
class SMVCET extends Pondicherry_University
{
	void Dep_Available()
	{
		System.out.println("Shri Manakula Vinayagar College Of Engineering And Technology");
		System.out.println("CSE");
		System.out.println("IT");
		System.out.println("EEE");
		System.out.println("ECE");
		System.out.println("MECH");
		System.out.println("CIVIL");
		System.out.println("MEDICAL");
	}
	void Fees()
	{
		System.out.println("Rs:1,20,000/- per Annual");
	}
	void Location()
	{
		System.out.println("Address:");
		System.out.println("Mannadipet");
		System.out.println("Villiyanur Post");
		System.out.println("Pin Code:605 507");
	}
	void FeedBack()
	{
		System.out.println("FeedBack");
		System.out.println("Nice Environment and Prefarable staffs available");
		System.out.println("Worthy to Join :) ");
	}
}

class RGCET extends Pondicherry_University
{
	void Dep_Available()
	{
		System.out.println("Rajiv Ganthi College Of Engineering And Technology");
		System.out.println("CSE");
		System.out.println("IT");
		System.out.println("EEE");
		System.out.println("ECE");
		System.out.println("MECH");
		System.out.println("CIVIL");
	}
	void Fees()
	{
		System.out.println("Rs:75000/- per Annual");
	}
	void Location()
	{
		System.out.println("Address:");
		System.out.println("Kirumambakkam");
		System.out.println("bahour Post");
		System.out.println("Pin Code:607 402");
	}
	void FeedBack()
	{
		System.out.println("FeedBack");
		System.out.println("Nice Environment and few staffs only available");
		System.out.println("Truely Trusted Based :) ");
	}
}

class RCET extends Pondicherry_University
{
	void Dep_Available()
	{
		System.out.println("Rock College Of Engineering And Technology");
		System.out.println("CSE");
		System.out.println("IT");
		System.out.println("EEE");
		System.out.println("ECE");
		System.out.println("MECH");
	}
	void Fees()
	{
		System.out.println("Rs:60000/- per Annual");
	}
	void Location()
	{
		System.out.println("Address:");
		System.out.println("Villiyanur");
		System.out.println("Villiyanur Post");
		System.out.println("Pin Code:604 403");
	}
	void FeedBack()
	{
		System.out.println("FeedBack");
		System.out.println("Nice Environment and few staffs only available");
		System.out.println("Not Recommented ");
	}
}
public class Department {

	public static void main(String[] args) {
		System.out.println("WELCOME TO PONDICHERRY UNIVERSITY BOARD");
		System.out.println("Select Anyone in below section");
		System.out.println("\t1.SKCET");
		System.out.println("\t2.SMVCET");
		System.out.println("\t3.RGCET");
		System.out.println("\t4.RCET");
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		Pondicherry_University obj1=new SKCET();
		Pondicherry_University obj2=new SMVCET();
		Pondicherry_University obj3=new RGCET();
		Pondicherry_University obj4=new RCET();
		switch(n)
		{
		case 1: 
			obj1.Dep_Available();
			obj1.Fees();
			obj1.Location();
			obj1.FeedBack();
			break;
		case 2: 
			obj2.Dep_Available();
			obj2.Fees();
			obj2.Location();
			obj2.FeedBack();
			break;
		case 3: 
			obj3.Dep_Available();
			obj3.Fees();
			obj3.Location();
			obj3.FeedBack();
			break;
		case 4: 
			obj4.Dep_Available();
			obj4.Fees();
			obj4.Location();
			obj4.FeedBack();
			break;
		default:
			System.out.println("Wrongly Selected Try Again");
		}
Sc.close();
	}

}

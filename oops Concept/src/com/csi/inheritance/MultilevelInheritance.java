package com.csi.inheritance;
class College {
	void get(int clgId,String clgName){
		System.out.println("\n COLLEGE ID :"+clgId+"\n COLLEGE NAME :"+clgName);
	}
}
class Staff extends College
{
	void set(int stfNo,String stfName)
	{
		System.out.println("\n STAFF BRANCH NUMBER :"+stfNo+"\n STAFF BRANCH NAME :"+stfName);
	}
}
class Student extends Staff
{
	void net(int stdId,String stdName)
	{
		System.out.println("\n STUDENT ID :"+stdId+"\n STUDENT NAME :"+stdName); 

	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.get(121, "HRM");
		s1.set(134, "Niru");
		s1.net(190, "Adesh");
		College c1=new Staff();
		// Staff s1=new College(); // cast exception
		
	}
}

package com.csi.polymorphism;
class Employee
{
	void get(int empId,String empName){
		System.out.println("\n EMPLOYEE ID :"+empId+"\n EMPLOYEE NAME :"+empName);
	}
	void get(String empName,int empId ){
		System.out.println("\n EMPLOYEE NAME :"+empName+"\n EMPLOYEE ID :"+empId);
	}
}

public class OverloadPolymorphismConcept {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.get(12, "ADESH");
		e1.get("ADESH", 56);
	}
}

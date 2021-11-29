package com.csi.inheritance;
class Department
{
	void set(int deptId){
		System.out.println("DEPARTMENT ID :"+deptId);
	}
}
class Employee extends Department
{
	void get(String empName){
		System.out.println("EMPLOYEE ID :"+empName);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.set(121);
		e1.get("ADESH");
		// Employee e1=new Department(); // cast class exception
	}
}

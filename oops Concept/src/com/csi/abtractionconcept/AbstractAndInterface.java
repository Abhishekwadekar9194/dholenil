package com.csi.abtractionconcept;
interface Department
{
	 void kk(int dptId,String dptName);// abstract method
	static void set(){
		System.out.println("I AM FROM SET");
	}
	default void net(){
		System.out.println("I AM FROM NET");
	}
}
interface Employee
{
	void showEmployee(int empId,String empName);
}
abstract class Product
{
	abstract void showProduct(String prdName);
	void displayproduct(double prdPrice)
	{
		System.out.println("\n PRODUCT PRICE :"+prdPrice);
	}
}
class Company extends Product implements Department,Employee
{

	@Override
	public void showEmployee(int empId, String empName) {
		// TODO Auto-generated method stub
		System.out.println("\n EMPLOYEE ID :"+empId+"\n EMPLOYEE NAME :"+empName);

	}

	@Override
	public void kk(int dptId, String dptName) {
		// TODO Auto-generated method stub
		System.out.println("\n DEPARTMENT ID :"+dptId+"\n DEPARTMENT NAME :"+dptName);

	}

	@Override
	void showProduct(String prdName) {
		// TODO Auto-generated method stub
		System.out.println("\n PRODUCT NAME :"+prdName);

	}

	public void set() {
		// TODO Auto-generated method stub
		System.out.println("I AM FROM SET");

	}

}

public class AbstractAndInterface {
	public static void main(String[] args) {
		Company c1=new Company();
		c1.kk(123, "HR");
		c1.net();
		c1.set();
		c1.showEmployee(1234, "ADESH");
		c1.showProduct("LAPTOP");
		c1.displayproduct(97678.98);
	}

}

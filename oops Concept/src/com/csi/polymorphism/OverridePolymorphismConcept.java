package com.csi.polymorphism;
class college
{
	void god(int clgId,String clgName)
	{

		System.out.println("\n COLLEGE ID :"+clgId+"\n COLLEGE NAME :"+clgName);
	}
}
class School extends college
{
	void god(int clgId,String clgName)
	{
		super.god(123, "ADESH");

		System.out.println("\n COLLEGE ID : "+clgId+"\n COLLEGE NAME :"+clgName);
	}

}
public class OverridePolymorphismConcept {
	public static void main(String[] args) {
		School s1=new School();
		s1.god(111, "AMOL");

	}
}

package com.csi.inheritance;
class Abc
{
	void net(int aId,String aName){
		System.out.println("\n ID :"+aId+"\n NAME :"+aName);
	}
}
class School extends Abc
{
	void god(int sclId,double sclResult)
	{
		System.out.println("\n SCHOOL ID :"+sclId+"\n SCHOOL RESULT :"+sclResult);
	}
}
class Xyz extends Abc
{
	void set(int xyId,String xyName)
	{
		System.out.println("\n XYZ ID :"+xyId+"\n XYZ NAME :"+xyName);
	}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	School s1=new School();
	s1.net(12, "ADESH");
	s1.god(908, 99.90);
	
	
	Xyz a1=new Xyz();
	a1.net(12, "ADESH");
	a1.set(26, "ENGLISH");
}
}

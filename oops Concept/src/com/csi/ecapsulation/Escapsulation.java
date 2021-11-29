package com.csi.ecapsulation;
class College
{
	private int clgId;
	private String clgName;
	private double clgResult;
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public double getClgResult() {
		return clgResult;
	}
	public void setClgResult(double clgResult) {
		this.clgResult = clgResult;
	}

}

public class Escapsulation {
	public static void main(String[] args) {
		College c1=new College();
		c1.setClgId(121);
		c1.setClgName("adesh");
		c1.setClgResult(98.90);
		System.out.println("\n COLLEGE ID :"+c1.getClgId()+"\n COLLEGE NAME :"+c1.getClgName()+"\n COLLEGE RESULT :"+c1.getClgResult());
	}
}

package com.xworkz.student.dto;
public class StudentDTO {
	private String name;
	private String branch;
	private long phoneNumber;
	private double percentage;
	
	public StudentDTO() {
		
	}

	public StudentDTO (String name,String branch,long phoneNumber, double percentage) {
		super();
		this.name = name;
		this.branch = branch;
		this.phoneNumber = phoneNumber;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", branch=" + branch + ", phoneNumber=" + phoneNumber + ", percentage="
				+ percentage + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


}
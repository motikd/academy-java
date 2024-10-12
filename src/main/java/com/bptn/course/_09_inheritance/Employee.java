package com.bptn.course._09_inheritance;

class Employee {
	
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("Employee name: "+name+", Salary: "+salary);
	}
	
	public double calculateBonus() {
		return salary*0.10;
	}
}

class Manager extends Employee {
	
	double bonusPercentage;
	
	public Manager(String name, double salary, double bonusPercentage) {
		super(name, salary);
		this.bonusPercentage = bonusPercentage;
	}
	
	//	Polymorphism
	@Override
	public double calculateBonus() {
		return salary * (bonusPercentage/100);
	}
	
	public void displayManagerDetails() {
		super.displayDetails();
		System.out.println("Manager Bonus: "+calculateBonus());
	}
	
}






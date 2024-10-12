package com.bptn.course._09_inheritance;

// super class, parent class, base class
class Vehicle {
	
	int speed;
	
	public Vehicle(int speed) {
		this.speed = speed;
	}
	
	public void displaySpeed() {
		System.out.println("The vehicle speed is: "+speed+" km/h.");
	}

}


// child class, sub class or derived class
class Car extends Vehicle{
	
	String model;
	
	public Car(int speed, String model) {
		super(speed);
		this.model = model;
	}
	
	public void displayCarSpeed() {
		System.out.println("The model of the car is: "+model);
		super.displaySpeed();
	}
}

class ElectricCar extends Car{
	
	double batteryPercentage;
	
	public ElectricCar(int speed, String model, double batteryPercentage) {
		super(speed, model);
		this.batteryPercentage = batteryPercentage;
	}
	
	public void displayElectricBattery() {
		System.out.println("The battery percentage is: "+batteryPercentage);
		super.displayCarSpeed();
	}
}






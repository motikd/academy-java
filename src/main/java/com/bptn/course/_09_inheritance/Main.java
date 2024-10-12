package com.bptn.course._09_inheritance;

public class Main{
	public static void main(String[] args) {
//		Car car = new Car(150, "Kia");
//		car.displayCarSpeed();
		
//		ElectricCar myCar = new ElectricCar(100, "BMW", 78.00);
//		myCar.displayElectricBattery();
		
//		Employee emp1 = new Employee("John", 20000.00);
//		emp1.displayDetails();
//		
//		
//		Manager man1 = new Manager("Charles", 50000.00, 15);
//		man1.displayManagerDetails();
//		
//		Employee emp2 = new Employee("Test", 1000.00);
//		emp2.displayDetails();
		
//		System.out.println("The value of pi is: "+MathUtil.valueOfPi);
//		int sum = MathUtil.add(5, 10);
//		System.out.println("The sum is: "+sum);
		
		System.out.println("The number of visitors is: "+MathUtil.count);
		
		MathUtil myObj = new MathUtil();
		myObj.displayData();
		
		System.out.println("The number of visitors is: "+MathUtil.count);
		
		MathUtil myObj2 = new MathUtil();
		MathUtil myObj3 = new MathUtil();
		MathUtil myObj4 = new MathUtil();
		
		System.out.println("The number of visitors is: "+MathUtil.count);
		
	}
}






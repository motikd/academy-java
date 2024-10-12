package com.bptn.course._09_inheritance;

public class MathUtil {
	
	public MathUtil() {
		addCount();
	}
	
// Create a counter which will keep a track of
//	the number of visits	
	static int count;
	
	static void addCount() {
		count++;
	}
	
//	static dataType propertyName;
	static double valueOfPi = 3.14;
	
//	static returnType methodName;
	static int add(int a, int b) {
		return a + b;
	}
	
	public void displayData() {
		System.out.println("Object created!");
	}
	
}
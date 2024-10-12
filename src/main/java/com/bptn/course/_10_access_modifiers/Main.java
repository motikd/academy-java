package com.bptn.course._10_access_modifiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicDemo myDemo = new PublicDemo("test");
		myDemo.displayName();
		
		myDemo.setName("");
		myDemo.displayName();
			
	}

}
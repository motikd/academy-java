package com.bptn.course._10_access_modifiers;

class PublicDemo {
	
	String name;
	
	public PublicDemo(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		if(name=="") {
			throw new IllegalArgumentException("Name cannot be null");
		} else {
			this.name = name;
		}
	}
	
	public void displayName() {
		System.out.println("Name is: "+name);
	}

}
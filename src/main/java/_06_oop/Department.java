package _06_oop;

class Department {
	private String departmentName;
	private int numberOfEmployees;
	
	public Department(String departmentName, int numberOfEmployees) {
		this.departmentName = departmentName;
		this.numberOfEmployees = numberOfEmployees;
	}
		public void displaydepartmenttInfo() {
			System.out.println(departmentName);
			System.out.println(numberOfEmployees);
		
	}

}

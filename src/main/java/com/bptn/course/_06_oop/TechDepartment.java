package _06_oop;

class TechDepartment extends Department {
	
	
	private double totalTechAmount;
	
	public TechDepartment(String departmentName, int numberOfEmployees, double totalTechAmount) {
		super(departmentName, numberOfEmployees );
		this.totalTechAmount = totalTechAmount ;
		
		
		
	}
}




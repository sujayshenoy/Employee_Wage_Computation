package main_package;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		//Company A employees;
		Company A = new Company("A", 20, 100);
		System.out.println("Company "+A.getCompanyName());

		//Employee id is passed into constructor
		A.createEmployee(1);
		A.createEmployee(2); 
		
		A.showAttendance();
		
		//Total wages of all employees
		for(Employee employee : A.getAllEmployees()){
			System.out.println("Total wage of EMP: "+employee.empId+" is "+String.format("%.2f", A.calculateWage(employee)));
		}

		System.out.println("Total Wage of Company: "+A.getCompanyName()+" is "+String.format("%.2f", A.getTotalEmpWage()));
		System.out.println("");

		//Company B employees
		Company B = new Company("B", 25, 150);
		System.out.println("Company "+B.getCompanyName());

		//Employee id is passed into constructor
		B.createEmployee(1);
		B.createEmployee(2); 
		
		B.showAttendance();
		
		//Total wages of all employees
		for(Employee employee : B.getAllEmployees()){
			System.out.println("Total wage of EMP: "+employee.empId+" is "+String.format("%.2f", B.calculateWage(employee)));
		}
		
		System.out.println("Total Wage of Company: "+B.getCompanyName()+" is "+String.format("%.2f", B.getTotalEmpWage()));
		System.out.println("");
	}	
}

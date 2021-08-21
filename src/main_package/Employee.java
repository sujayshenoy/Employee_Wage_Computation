package main_package;

public class Employee {
	
	//constants
	final double regular_employee_working_hour = 8;
	
	//class variables
	double wagePerHour;
	
	Employee(double wagePerHour){
		this.wagePerHour = wagePerHour;
	}
	
	public boolean isPresent() {
		int attendance = (int)(Math.floor(Math.random()*10))%2;
		return attendance==1?true:false;
	}
	
	public double calculateRegularWage() {
		return regular_employee_working_hour*wagePerHour;
	}
}

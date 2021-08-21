package main_package;

public class Employee {
	
	//constants
	final double regular_employee_working_hour = 8;
	final double parttime_employee_working_hour = 8;
	final double working_days_in_a_month = 20;
	
	//class variables
	double wagePerHour;
	int employeeType; //1 for regular, 2 for part time
	double wage;
	
	Employee(double wagePerHour, int employeeType){
		this.wagePerHour = wagePerHour;
		this.employeeType = employeeType;
	}
	
	public boolean isPresent() {
		int attendance = (int)(Math.floor(Math.random()*10))%2;
		return attendance==1?true:false;
	}
	
	public double calculateDailyWage() {
		if(this.employeeType == 1) {
			return regular_employee_working_hour*wagePerHour;
		}
		else {
			return parttime_employee_working_hour*wagePerHour;
		}
	}
	
	public double calculateMonthlyWage() {
		return calculateDailyWage()*working_days_in_a_month;
	}
	
	public double calculateWageHour(int hours) {
		return wagePerHour*hours;
	}
	
}

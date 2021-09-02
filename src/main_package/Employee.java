package main_package;

public class Employee{
	
	//constants
	// final double regularEmployeeWorkingHour = 8;
	// final double parttime_employee_working_hour = 8;
	// final double workingDaysMonth = 20;
	final static int REGULAR_EMP = 1;
	final static int PART_TIME_EMP =2;
	
	//class variables
	int empId;
	double wagePerHour;
	int employeeType; 
	double wage;
	
	Employee(int empId,double wagePerHour, int employeeType){
		this.empId = empId;
		this.wagePerHour = wagePerHour;
		this.employeeType = employeeType;
	}
	
	public boolean isPresent() {
		int attendance = (int)(Math.floor(Math.random()*10))%2;
		return attendance==1?true:false;
	}
	
	public double calculateDailyWage(double workingHours){
		double total_wage = 0;
		total_wage = workingHours*wagePerHour;
		return total_wage;
	}
	
	public double calculateMonthlyWage(double workingHours,int workingDaysMonth) {
		return calculateDailyWage(workingHours)*workingDaysMonth;
	}
	
	public double calculateWageHour(int hours) {
		return wagePerHour*hours;
	}
	
}

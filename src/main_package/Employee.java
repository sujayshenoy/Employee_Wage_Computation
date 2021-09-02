package main_package;

public class Employee{
	
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
	
	public double calculateDailyWage(){
		double total_wage = 0;
		switch (this.employeeType) {
		case 1 :  total_wage = regular_employee_working_hour*wagePerHour;
					break;
		case 2 :  total_wage = parttime_employee_working_hour*wagePerHour;
					break;
		}
		
		return total_wage;
	}
	
	public double calculateMonthlyWage() {
		return calculateDailyWage()*working_days_in_a_month;
	}
	
	public double calculateWageHour(int hours) {
		return wagePerHour*hours;
	}
	
}

package main_package;

public class Employee{
	final static int REGULAR_EMP = 1;
	final static int PART_TIME_EMP = 2;
	
	int empId;
	double wagePerHour;
	int employeeType; 
	double wage;
	double dailyWage;
	
	Employee(int empId,double wagePerHour, int employeeType){
		this.empId = empId;
		this.wagePerHour = wagePerHour;
		this.employeeType = employeeType;
	}
	
	public boolean isPresent() {
		int attendance = (int)(Math.floor(Math.random()*10))%2;
		return attendance==1?true:false;
	}
	
	public double calculateWage(int workingDays,int workingHours) {
		int total_worked_hours = 0;
		int total_worked_days = 0;
				
		while (total_worked_hours < workingHours && total_worked_days < workingDays) {
			//calculate total hours worked today
			int rng = (int)Math.floor(Math.random()*((8-4)+1)+4);
			// used formula (max-min+1)+ min to generate a random working hour between 4 and 8
			total_worked_hours += rng;
			total_worked_days++;

			//holds todays wage cost to company
			dailyWage = rng * wagePerHour;
		}

		return wagePerHour*total_worked_hours;
	}
	
}

package main_package;

public class Main {

	public static void main(String[] args) {
		final int REGULAR_EMP = 1;
		final int PART_TIME_EMP =2;
		
		System.out.println("Welcome to Employee Wage Computation");
		
		//Adding employee with wage 20 
		Employee e1 = new Employee(20, REGULAR_EMP); 
		if(e1.isPresent()) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}	
		
		double wage = e1.calculateDailyWage();
		System.out.println("Regular Employee e1 Wage for a day = "+wage);
		
		//Adding Part-time Employee with wage 15
		Employee e2 = new Employee(15,PART_TIME_EMP);
		
		double part_wage = e2.calculateDailyWage();
		System.out.println("Part Time Employee Wage e2 for a day = "+part_wage);
		
		//Monthly wage for employee e1
		System.out.println("Monthly Wage for Employee e1 = "+e1.calculateMonthlyWage());
		
		//Monthly wage for employee e2
		System.out.println("Monthly Wage for Employee e2 = "+e2.calculateMonthlyWage());
		
		int total_worked_hours = 0;
		int total_worked_days = 0;
		
		
		while(total_worked_hours < 100 && total_worked_days <20 ) {
			int rng = (int)Math.floor(Math.random()*((8-4)+1)+4);
			// used formula (max-min+1)+ min to generate a random working hour between 4 and 8
			System.out.println("Hours worked today = "+rng);
			total_worked_hours += rng;
			total_worked_days ++;
		}
		
		System.out.println("Total Worked Hours = "+total_worked_hours+"\nTotal Worked days = "+total_worked_days);
		System.out.println("Total Wage = "+e1.calculateWageHour(total_worked_hours));
		
	}	
}

package main_package;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to Employee Wage Computation");
		
		//Company A employees;
		System.out.println("Company A");

		Company A = new Company(8, 10, 20);

		//Employee id is passed into constructor
		A.createEmployee(1);
		A.createEmployee(2); 
		
		A.showAttendance();
		
		//Daily wages of all employees

		for(Employee employee : A.getAllEmployees()){
			System.out.println("Daily wage of "+employee.empId+" is "+String.format("%.2f", A.calculateDailyWage(employee)));
		}
		
		//Monthly wages of all employees

		for(Employee employee : A.getAllEmployees()){
			System.out.println("Monthly wage of "+employee.empId+" is "+String.format("%.2f", A.calculateMonthlyWage(employee)));
		}

		System.out.println("");

		//Company B employees
		System.out.println("Company B");
		Company B = new Company(4, 8, 25);

		//Employee id is passed into constructor
		B.createEmployee(1);
		B.createEmployee(2); 
		
		B.showAttendance();
		
		//Daily wages of all employees

		for(Employee employee : B.getAllEmployees()){
			System.out.println("Daily wage of "+employee.empId+" is "+String.format("%.2f", B.calculateDailyWage(employee)));
		}
		
		//Monthly wages of all employees

		for(Employee employee : B.getAllEmployees()){
			System.out.println("Monthly wage of "+employee.empId+" is "+String.format("%.2f", B.calculateMonthlyWage(employee)));
		}
		
		System.out.println("");

		//Conditional calculation of wage use case 6
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
		Employee e1 = A.getEmployee(1);
		System.out.println("Total Wage = "+e1.calculateWageHour(total_worked_hours));
		
	}	
}

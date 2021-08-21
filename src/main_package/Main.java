package main_package;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		//Adding employee with wage 20 , 1 as the regular employee type
		Employee e1 = new Employee(20, 1); 
		if(e1.isPresent()) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}	
		
		double wage = e1.calculateDailyWage();
		System.out.println("Regular Employee e1 Wage for a day = "+wage);
		
		//Adding Part-time Employee with wage 15 (2 because part-time employee type)
		Employee e2 = new Employee(15,2);
		
		double part_wage = e2.calculateDailyWage();
		System.out.println("Part Time Employee Wage e2 for a day = "+part_wage);
		
		//Monthly wage for employee e1
		System.out.println("Monthly Wage for Employee e1 = "+e1.calculateMonthlyWage());
		
		//Monthly wage for employee e2
		System.out.println("Monthly Wage for Employee e2 = "+e2.calculateMonthlyWage());
	}	
}

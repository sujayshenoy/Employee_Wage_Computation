package main_package;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		Employee e1 = new Employee(20); //20 because wage for that particular employee is 20 per hour
		if(e1.isPresent()) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}	
		
		double wage = e1.calculateRegularWage();
		System.out.println("Regular Employee Wage = "+wage);
		
		//Adding Part-time Employee with wage 15
		Employee e2 = new Employee(15);
		
		double part_wage = e2.calculatePartTimeWage();
		System.out.println("Part Time Employee Wage = "+part_wage);
		
	}	
}

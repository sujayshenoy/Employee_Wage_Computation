package main_package;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		
		Employee e = new Employee(20); //20 because wage for that particular employee is 20 per hour
		if(e.isPresent()) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}	
		
		double wage = e.calculateRegularWage();
		System.out.println("Regular Employee Wage = "+wage);
	}	
}

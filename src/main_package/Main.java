package main_package;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Company> companies = new ArrayList<Company>();

		System.out.println("Welcome to Employee Wage Computation");
		
		companies.add(new Company("Jio", 20, 100));
		companies.add(new Company("Dmart", 25, 150));

		for (Company company : companies) {
			System.out.println("Company " + company.getCompanyName());
			company.createEmployee(1);
			company.createEmployee(2);
			company.showAttendance();

			for (Employee employee : company.getAllEmployees()) {
				System.out.println("Total wage of EMP: " + employee.empId + " is "
						+ String.format("%.2f", company.calculateWage(employee)));
			}
			
			System.out.println("Total Wage of Company: "+company.getCompanyName()+" is "+String.format("%.2f", company.getTotalEmpWage()));
			System.out.println("");
		}
	}	
}

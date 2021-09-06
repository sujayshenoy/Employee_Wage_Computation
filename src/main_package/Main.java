package main_package;

import java.util.Map;
import java.util.HashMap;

public class Main {
	static Map<String, Company> companies = new HashMap<String, Company>();
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		companies.put("Jio", new Company("Jio", 20, 100));
		companies.put("Dmart", new Company("Dmart", 25, 150));

		for (Company company : companies.values()) {
			System.out.println("Company " + company.getCompanyName());
			company.createEmployee(1);
			company.createEmployee(2);
			company.showAttendance();

			for (Employee employee : company.getAllEmployees()) {
				System.out.println("Total wage of EMP: " + employee.empId + " is "
						+ String.format("%.2f", company.calculateWage(employee)));
			}

			System.out.println("Daily Wage Cost to Company: " + String.format("%.2f", company.getDailyWage()));
			System.out.println("Total Wage of Company: " + company.getCompanyName() + " is "
					+ String.format("%.2f", company.getTotalEmpWage()));
			System.out.println("");
		}

		//Print Total wage of Jio
		System.out.println("Total Wage for Jio: "+String.format("%.2f",getTotalWageByCompany("Jio")));
	}
	
	private static double getTotalWageByCompany(String companyName){
		Company company = companies.get(companyName);
		return company.getTotalEmpWage();
	}
}

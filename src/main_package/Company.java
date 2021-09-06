package main_package;

import java.util.*;

public class Company implements ComputeEmployeeWage {
    private List<Employee> employees = new ArrayList<Employee>();
    private int workingDaysAMonth;
    private int workingHoursAMonth;
    private String companyName;
    private double totalEmpWage = 0;
    private double dailyWage = 0;

    Company(String name, int workingDaysAMonth, int workingHoursAMonth) {
        this.companyName = name;
        this.workingDaysAMonth = workingDaysAMonth;
        this.workingHoursAMonth = workingHoursAMonth;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void createEmployee(int empId){
        Employee e = new Employee(empId,generateWage(), generateEmployeeType());
        employees.add(e);
    }

    private double generateWage(){
        return Math.random()*1000+100;
    }

    private int generateEmployeeType(){
        double prob = Math.random();

        if(prob > 0.5){
            return Employee.REGULAR_EMP;
        }
        else{
            return Employee.PART_TIME_EMP;
        }
    }
    
    @Override
    public double calculateWage(Employee e) {
        double res = e.calculateWage(workingDaysAMonth, workingHoursAMonth);
        dailyWage += e.dailyWage;
        totalEmpWage += res;
        return res;
    }   

    public Employee getEmployee(int empId){
        for(Employee employee : employees){
            if(employee.empId == empId){
                return employee;
            }
        }
        return null;
    }

    public void showAttendance(){
        for(Employee employee : employees){
            if(employee.isPresent()){
                System.out.println("EMP: "+employee.empId+" is Present");
            }
            else{
                System.out.println("EMP: "+employee.empId+" is Absent");
            }
        }
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public double getTotalEmpWage() {
        return totalEmpWage;
    }

    public double getDailyWage() {
        return dailyWage;
    }
}

package main_package;

import java.util.*;

public class Company {
    private List<Employee> employees = new ArrayList<Employee>();
    private double partTimeWorkingHours;
    private double regularWorkingHours;
    private int workingDaysAMonth;

    Company(double partTimeWorkingHours,double regularWorkingHours,int worworkingDaysAMonth){
        this.partTimeWorkingHours = partTimeWorkingHours;
        this.regularWorkingHours = regularWorkingHours;
        this.workingDaysAMonth = worworkingDaysAMonth;
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

    public double calculateDailyWage(Employee e){
        if(e.employeeType == Employee.REGULAR_EMP){
            return e.calculateDailyWage(regularWorkingHours);
        }
        else{
            return e.calculateDailyWage(partTimeWorkingHours);
        }
    }

    public double calculateMonthlyWage(Employee e){
        if(e.employeeType == Employee.REGULAR_EMP){
            return e.calculateMonthlyWage(regularWorkingHours, workingDaysAMonth);
        }
        else{
            return e.calculateMonthlyWage(partTimeWorkingHours, workingDaysAMonth);
        }
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
                System.out.println(employee.empId+" is Present");
            }
            else{
                System.out.println(employee.empId+" is Absent");
            }
        }
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }
}

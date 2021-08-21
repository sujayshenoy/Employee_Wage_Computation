package main_package;

public class Employee {
	public boolean isPresent() {
		int attendance = (int)(Math.floor(Math.random()*10))%2;
		return attendance==1?true:false;
	}
}

package day1;

public class Employee {
	
	int salary;
	int bonus;
	
	void calculateSalary() {
		
		int totalSalary = salary + bonus;
		
		System.out.println("Total salary: " + totalSalary );
	}
	

}

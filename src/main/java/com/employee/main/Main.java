package com.employee.main;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

public class Main {
	public static void main (String[] args) {
		
		Employee emp1 = new Employee(101, "satyam", "SDE" , 100000);
		Employee emp2 = new Employee(102, "logesh", "Game Programmer", 100000);
		Employee emp3 = new Employee(103, "nikhil", "Game Programmer", 100000);
		Employee emp4 = new Employee(104, "harsh", "HR", 40000);
		Employee emp5 = new Employee(105, "mansi", "TL", 120000);
		
		EmployeeRepository repository = new EmployeeRepository();
		
		repository.addEmployees(emp1);
		repository.addEmployees(emp2);
		repository.addEmployees(emp3);
		repository.addEmployees(emp4);
		repository.addEmployees(emp5);
		
//		System.out.println(repository.getAllEmployees());
		
		Employee employee = repository.findEmployeeById(101);
		System.out.println(employee);
		
		Employee emp = repository.findEmployeeByName("Mansi");
		System.out.println(emp);
		
		
		
	}
}

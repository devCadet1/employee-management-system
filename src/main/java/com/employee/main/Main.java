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
		
		// find employee by name
		Employee emp = repository.findEmployeeByName("Mansi");
		System.out.println(emp);
		
		// Delete employee method from Employee repository
		boolean deleted = repository.deleteEmployee(102);
		System.out.println(deleted);
		
		System.out.println(repository.getAllEmployees());
		
		// find employee by ID
		Employee employee = repository.findEmployeeById(102);
		System.out.println(employee);
		
		
		
	}
}

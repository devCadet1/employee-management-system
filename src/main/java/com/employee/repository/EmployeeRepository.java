package com.employee.repository;
import java.util.List;
import java.util.ArrayList;
import com.employee.model.Employee;

public class EmployeeRepository {
	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployees(Employee employee) {
		employees.add(employee);
		
	}
	
	public List<Employee> getAllEmployees() {
		return employees;
	}
	
	// method to find employee by ID 
	public Employee findEmployeeById(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
			 
		}
		return null;
	}
	
	// Method to find employee by name
	public Employee findEmployeeByName(String name) {
		for (Employee employee : employees) {
			if (employee.getName().equalsIgnoreCase(name)) {
				return employee;
			}
		}
		return null;
	}
	
	// Method to delete an employee 
	public boolean deleteEmployee(int id) {
		return employees.removeIf( employee -> employee.getId() == id);
	}
}

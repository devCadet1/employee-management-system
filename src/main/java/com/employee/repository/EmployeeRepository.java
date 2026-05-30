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
	
	public Employee findEmployeeById(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
			 
		}
		return null;
	}
	
	public Employee findEmployeeByName(String name) {
		for (Employee employee : employees) {
			if (employee.getName() == name) {
				return employee;
			}
		}
		return null;
	}
}

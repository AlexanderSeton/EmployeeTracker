package com.codeclan.example.EmployeeTracker;

import com.codeclan.example.EmployeeTracker.models.Employee;
import com.codeclan.example.EmployeeTracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeTrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee testEmployee = new Employee("Tim", 42, 43290842, "tim@gmail.com");
		employeeRepository.save(testEmployee);
	}

}

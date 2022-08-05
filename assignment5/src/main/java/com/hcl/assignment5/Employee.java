package com.hcl.assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	int empId;
	String empName;
	int empAge;
	String gender;
	String empDept;
	int empJoinDate;
	int empSalary;

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "David", 29, "Male", "Management", 2014, 60000));
		list.add(new Employee(2, "Lizzy", 22, "Female", "IT", 2019, 65000));
		list.add(new Employee(3, "Josh", 37, "Male", "Accounting", 2011, 85000));
		list.add(new Employee(4, "Jessica", 55, "Female", "IT", 2000, 55000));
		list.add(new Employee(5, "Billy", 33, "Male", "Accounting", 2013, 35000));
		list.add(new Employee(6, "Susan", 35, "Female", "Managment", 2015, 95000));

		// Number of males and females in Employee's
		Map<String, Long> genderCount = list.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println("No. of males and females in the organization: " + genderCount);
		
		Map<String, Double> avgEmpAgeByGender = list.stream()
				.collect(Collectors.groupingBy(e->e.getGender(), Collectors.averagingInt(Employee::getEmpAge)));
		System.out.println("average Age based on Gender" + avgEmpAgeByGender);
		
		Employee maxSalaryEmp = list.stream().max(Comparator.comparing(e->e.getEmpSalary())).get();
		System.out.println("Highest paid employee is :" + maxSalaryEmp);
	}
}
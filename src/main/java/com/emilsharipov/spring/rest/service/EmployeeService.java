package com.emilsharipov.spring.rest.service;

import com.emilsharipov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    public Employee getEmployeeById(int id);

    public void deleteEmployeeById(int id);
}

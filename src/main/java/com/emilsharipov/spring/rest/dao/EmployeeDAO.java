package com.emilsharipov.spring.rest.dao;

import com.emilsharipov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    public Employee getEmployeeById(int id);

    public void deleteEmployeeById(int id);
}

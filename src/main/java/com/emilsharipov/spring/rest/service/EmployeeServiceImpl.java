package com.emilsharipov.spring.rest.service;

import com.emilsharipov.spring.rest.dao.EmployeeDAO;
import com.emilsharipov.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee emp) {
        employeeDAO.saveEmployee(emp);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id) {
        employeeDAO.deleteEmployeeById(id);
    }
}

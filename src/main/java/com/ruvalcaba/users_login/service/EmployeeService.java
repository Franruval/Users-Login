package com.ruvalcaba.users_login.service;

import com.ruvalcaba.users_login.entity.Employee;
import com.ruvalcaba.users_login.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee e) {
        return employeeRepository.save(e);
    }
}

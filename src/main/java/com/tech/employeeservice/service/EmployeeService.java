package com.tech.employeeservice.service;

import com.tech.employeeservice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee department);

    Employee findById(Long id);

    List<Employee> findAll();

    List<Employee> findEmployeeByDepartmentId(Long id);
}

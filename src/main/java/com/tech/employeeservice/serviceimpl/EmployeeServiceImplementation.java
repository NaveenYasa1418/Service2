package com.tech.employeeservice.serviceimpl;

import com.tech.employeeservice.entity.Employee;
import com.tech.employeeservice.repository.EmployeeRepository;
import com.tech.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee save(Employee department) {
        return repository.save(department);
    }

    @Override
    public Employee findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Employee> findEmployeeByDepartmentId(Long id) {
        return repository.findByDepartmentId(id);
    }
}

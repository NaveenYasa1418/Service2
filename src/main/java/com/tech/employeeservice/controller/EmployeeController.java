package com.tech.employeeservice.controller;

import com.tech.employeeservice.entity.Employee;
import com.tech.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @PostMapping("/save")
    public Employee save(@RequestBody Employee department){
        return service.save(department);

    }
    @GetMapping("/getEmployee/{id}")
    public Employee findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/getEmployees")
    public List<Employee> findAll(){
        return service.findAll();
    }
    @GetMapping("getEmployeesByDepartment/{id}")
    public List<Employee> findEmployeeByDepartmentId(@PathVariable Long id){
        return service.findEmployeeByDepartmentId(id);
    }
}

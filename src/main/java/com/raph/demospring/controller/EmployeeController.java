package com.raph.demospring.controller;

import com.raph.demospring.entities.emp.Employee;
import com.raph.demospring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("addemployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees){
        return employeeService.saveAllEmployee(employees);
    }

    @GetMapping("allemployees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("employeewithname")
    public List<Employee> findAllEmployeeByIds(@RequestParam String employee_name){
        return employeeService.findAllEmployees();
    }

    @GetMapping("employeeid")
    public Employee getEmployeeById(@RequestParam int id){
        return employeeService.findEmployeeById(id);
    }
}

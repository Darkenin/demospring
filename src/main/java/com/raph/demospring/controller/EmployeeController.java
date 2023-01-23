package com.raph.demospring.controller;

import com.raph.demospring.entities.emp.Employee;
import com.raph.demospring.repo.empRepo.EmployeeRepo;
import com.raph.demospring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("addemployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees){
        return employeeService.saveAllEmployee(employees);
    }

    @GetMapping("allemployees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("employeewithname")
    public List<Employee> findEmployeeByName(@RequestParam String employee_name){
        return employeeService.findByEmployeename(employee_name);
    }

    @GetMapping("employeeid")
    public Employee getEmployeeById(@RequestParam int id){
        return employeeService.findByEmployeeid(id);
    }
    @GetMapping("employeebyids")
    public List<Employee> getEmployeeById(@RequestBody List<Integer> ids){
        return employeeService.findAllEmployeeByIds(ids);
    }

    @GetMapping("empbydeptandage")
    public List<Employee> getEmpByDeptAndAge(@RequestParam String department, @RequestParam int age){
        return employeeRepo.findByDepartmentAndAgeLessThan(department,age);
    }

}

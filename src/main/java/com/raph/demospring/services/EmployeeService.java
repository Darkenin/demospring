package com.raph.demospring.services;

import com.raph.demospring.entities.emp.Employee;
import com.raph.demospring.repo.empRepo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeService() {
    }

    public List<Employee> saveAllEmployee(List<Employee> employees){
        return employeeRepo.saveAll(employees);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public List<Employee> findAllEmployeeByIds(List<Integer> ids){
        return employeeRepo.findAllById(ids);
    }

    public Employee findEmployeeById(int id){
        return employeeRepo.findById(id);
    }
    public List<Employee> findEmployeeByName(String name){
        return employeeRepo.findByEmployeeName(name);
    }

}

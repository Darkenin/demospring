package com.raph.demospring.repo.empRepo;

import com.raph.demospring.entities.emp.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    Employee findById(int id);
    List<Employee> findByEmployeeName(String employee_name);
}

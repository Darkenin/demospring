package com.raph.demospring.repo;


import com.raph.demospring.entities.vehicle.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
    
}

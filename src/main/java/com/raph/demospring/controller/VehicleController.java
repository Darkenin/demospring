package com.raph.demospring.controller;


import com.raph.demospring.entities.Manufacturer;
import com.raph.demospring.entities.Vehicle;
import com.raph.demospring.entities.vehicle.Car;
import com.raph.demospring.entities.vehicle.Motorbike;
import com.raph.demospring.repo.CarRepository;
import com.raph.demospring.repo.ManufacturerRepository;
import com.raph.demospring.repo.MotorbikeRepository;
import com.raph.demospring.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vehicle/")
public class VehicleController {

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    CarRepository carRepository;

    @Autowired
    MotorbikeRepository motorbikeRepository;

    @PostMapping("addmanufacturers")
    public List<Manufacturer> addManufacturers(@RequestBody List<Manufacturer> manufacturers){

        return manufacturerRepository.saveAll(manufacturers);
    }

    @PostMapping("addvehicles")
    public List<Vehicle> addVehicles(@RequestBody List<Vehicle> vehicles){

        return vehicleRepository.saveAll(vehicles);
    }

    @PostMapping("addcars")
    public List<Car> addCars(@RequestBody List<Car> cars){

        return carRepository.saveAll(cars);
    }

    @PostMapping("addmotorbikes")
    public List<Motorbike> addMotorbikes(@RequestBody List<Motorbike> motorbikes){

        return motorbikeRepository.saveAll(motorbikes);
    }
    

    @GetMapping("getvehicles")
    public List<Vehicle> getVehicle(){
        return vehicleRepository.findAll();
    }

    @GetMapping("getcards")
    public List<Car> getCars(){
        return carRepository.findAll();
    }

    @GetMapping("getmotorbikes")
    public List<Motorbike> getMotorbikes(){
        return motorbikeRepository.findAll();
    }

    @GetMapping("getmanufacturers")
    public List<Manufacturer> getManufacturers(){
        return manufacturerRepository.findAll();
    }
}

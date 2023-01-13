package com.raph.demospring.controller;

import com.raph.demospring.entities.Geo.City;
import com.raph.demospring.entities.acad.Course;
import com.raph.demospring.pojo.CityRequest;
import com.raph.demospring.pojo.CourseRequest;
import com.raph.demospring.services.CityService;
import com.raph.demospring.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/raph")
public class HomeController {

    @Autowired
    CityService cityService;
    @Autowired
    CourseService courseService;

    @GetMapping("p")
    public String print(){
        return "Raphael";
    }

    @GetMapping("cities")
    public List<City> getCities(){
        return cityService.getCities();
    }

    @PostMapping("addcity")
    public City saveCity(@RequestBody City city){
       return  cityService.saveCity(city);
    }

    @GetMapping("getcity")
    public City getCity(String cityname){

        return cityService.getCity(cityname);

    }
    @PostMapping("savecity")
    public City addcity(@RequestBody CityRequest cityRequest){
        return cityService.addcity(cityRequest);
    }

    @PostMapping("addcourse")
    public Course addCourse(@RequestBody CourseRequest courseRequest){
        return courseService.addCoursewithContents(courseRequest);
    }
}

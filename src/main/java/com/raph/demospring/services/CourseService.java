package com.raph.demospring.services;

import com.raph.demospring.entities.acad.Course;
import com.raph.demospring.entities.acad.CourseContent;
import com.raph.demospring.pojo.CourseRequest;
import com.raph.demospring.repo.acadRepo.CourseContentRepo;
import com.raph.demospring.repo.acadRepo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class CourseService {

    Logger logger = Logger.getLogger(CourseService.class.getName());

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseContentRepo courseContentRepo;
    public CourseService() {
    }

    public Course addCoursewithContents(CourseRequest courseRequest){
        Course course = new Course();
        course.setId(courseRequest.id);
        course.setCourse_name(courseRequest.coursename);
        course.setCourseContents(courseRequest.courseContents.stream()
                .map(courseContent -> {
                    logger.log(Level.INFO, "course"+courseContent);
                    CourseContent courseContent1 = courseContent;
                    if(courseContent1.getId() > 0){
                        courseContent1 = courseContentRepo.findById(courseContent1.getId());
                    }
//                    courseContent1.getCourses().add(course); -> doing this will query the database for every data
                    courseContent1.addCourse(course);
                    return courseContent1;
                }).collect(Collectors.toSet()));
        return courseRepo.save(course);
    }
}

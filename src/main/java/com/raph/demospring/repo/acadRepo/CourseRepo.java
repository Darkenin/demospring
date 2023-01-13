package com.raph.demospring.repo.acadRepo;

import com.raph.demospring.entities.acad.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo  extends JpaRepository<Course, Integer> {
    public Course findById(int id);
}

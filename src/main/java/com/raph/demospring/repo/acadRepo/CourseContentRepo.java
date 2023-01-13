package com.raph.demospring.repo.acadRepo;

import com.raph.demospring.entities.acad.CourseContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepo extends JpaRepository<CourseContent, Integer> {
    public CourseContent findById(int id);
}

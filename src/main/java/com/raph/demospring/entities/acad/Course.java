package com.raph.demospring.entities.acad;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    public int id;

    @Column(name = "course_name")
    private String course_name;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "course_coursecontents_mapping",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private Set<CourseContent> courseContents = new HashSet<>();

    public Set<CourseContent> getCourseContents() {
        return courseContents;
    }

    public void setCourseContents(Set<CourseContent> courseContents) {
        this.courseContents = courseContents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}

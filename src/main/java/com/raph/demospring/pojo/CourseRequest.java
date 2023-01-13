package com.raph.demospring.pojo;

import com.raph.demospring.entities.acad.CourseContent;

import java.util.Set;

public class CourseRequest {
    public int id;
    public String coursename;
    public Set<CourseContent> courseContents;
}

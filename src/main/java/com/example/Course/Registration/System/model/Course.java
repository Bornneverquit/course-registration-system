package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key

    private String courseId;
    private String courseName;
    private String trianerName;
    private int duraionInWeeks;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrianerName() {
        return trianerName;
    }

    public void setTrianerName(String trianerName) {
        this.trianerName = trianerName;
    }

    public int getDuraionInWeeks() {
        return duraionInWeeks;
    }

    public void setDuraionInWeeks(int duraionInWeeks) {
        this.duraionInWeeks = duraionInWeeks;
    }
}

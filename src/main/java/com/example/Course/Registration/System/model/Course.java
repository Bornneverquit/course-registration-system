package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;

@Entity
public class Course {
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

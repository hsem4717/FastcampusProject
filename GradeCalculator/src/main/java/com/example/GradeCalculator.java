package com.example;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }


    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalComplitedCredit();

        return totalMultipliedCreditAndCourseGrade/totalCompletedCredit;
    }
}

package com.example;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    /**
     * 요구사항
     * 평균학 계산 방법 = (학점수*교과목의 평)의 합계/수강신천 총학점 수
     * 일급 컬렉션 사용
     */

    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalComplitedCredit();

        return totalMultipliedCreditAndCourseGrade/totalCompletedCredit;
    }
}

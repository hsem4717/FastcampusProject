package com.example;

public class Course {
    private final String subject; //과목명
    private final int credit; //학점
    private final String gradle; //성적

    public Course(String subject, int credit, String gradle) {
        this.subject = subject;
        this.credit = credit;
        this.gradle = gradle;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber() ;
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.gradle) {
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;
        }
        return grade;
    }
}
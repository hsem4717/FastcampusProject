package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학 계산 방법 = (학점수*교과목의 평)의 합계/수강신천 총학점 수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    //학점 계산기에 필요한 도메인: 이수한 과목, 학점 계산

    @DisplayName("평균 학점을 계산한다")
    @Test
    void calculateGradetest() {
        List<Course> courses= List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator= new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);

    }
}

package org.example.calculate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

class PositiveNumberTest {
    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void createTest(int value){
        assertThatCode(()-> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("양수만 허용에여");
    }

}
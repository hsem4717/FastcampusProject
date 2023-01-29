package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다
 * 비밀번호가 8자 미만 12자 초과일때는 IllegalArgumentExeption 예외를 발생시킨다
 * 경계조건에 대한 테스트 코드를 작성한다
 */
public class  PasswordValidatorTest {
    @DisplayName("비밀번호는 최소 8자 이상 12자 이하일경우 오류가 발생하지 않는다")
    @Test
    void vaildatePasswordTest () {
        assertThatCode(() -> PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }
    @DisplayName("비밀번호가 8가 미만 또는 12자를 초과하는 경우 IllegalArgumentException예외가 발생한다")
    @ParameterizedTest
    @ValueSource(strings = {"aaaabbb", "aaaabbbbccccd"})
    void vaildatePasswordTest2 (String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다");
    }
}

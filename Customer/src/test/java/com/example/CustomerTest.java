package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * 음식점에서 음식을 주문하는 과정 구현
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 메뉴를 주문한다")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 7000), new MenuItem("냉면", 6000)));
        Chef chef = new Chef();
        assertThatCode(()->customer.order("돈까스", menu, chef))
                .doesNotThrowAnyException();
    }
}

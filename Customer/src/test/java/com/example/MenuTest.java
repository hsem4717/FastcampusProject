package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MenuTest {

    @DisplayName("메뉴판에서 메뉴이름에 해당하는 메뉴를 반환한다")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 7000), new MenuItem("냉면", 6000)));

        MenuItem menuItem= menu.choose("돈까스");

        assertThat(menuItem).isEqualTo(new MenuItem("돈까스", 7000));
    }

    @DisplayName("메뉴판에 없는 메뉴를 주문할 시 예외 반환")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("돈까스", 7000), new MenuItem("냉면", 6000)));

        assertThatCode(()->menu.choose("치킨"));
    }
}

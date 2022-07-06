package com.example.firstproject.ioc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChefTest {

    @Test
    void 돈가스_요리하기() {
        Chef chef = new Chef();

        String menu = "돈가스";
        String food = chef.cook(menu);

        String expected = "한돈 등심 으로 만든 돈가스";

        Assertions.assertEquals(expected, food);
    }

    @Test
    void 스테이크_요리하기() {
        Chef chef = new Chef();

        String menu = "스테이크";
        String food = chef.cook(menu);

        String expected = "한우 꽃등심으로 만든 스테이크";

        Assertions.assertEquals(expected, food);

    }

}
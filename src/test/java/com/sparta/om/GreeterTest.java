package com.sparta.om;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    //all tests are public
    @Test
    @DisplayName("This is my first test")
    void firstTest() {
        Assertions.assertEquals(1,1);
    }

    @Test
    @DisplayName("Given time is 21, return Good Evening")
    void givenTimeIs21ReturnGoodEvening() {
        int time = 21;
        String expected = "Good Evening";
        String answer = Greeter.getGreeting(21);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given time is 14, return Good Afternoon")
    void givenTimeIs14ReturnGoodAfternoon() {
        int time = 14;
        String expected = "Good Afternoon";
        String answer = Greeter.getGreeting(14);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("Given time is 11, return Good Morning")
    void givenTimeIs11ReturnGoodMorning() {
        int time = 11;
        String expected = "Good Morning";
        String answer = Greeter.getGreeting(11);
        Assertions.assertEquals(expected, answer);
    }
}

package com.intellijide.userregistrationtesting;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistationsTest {
    UserRegistations test;
    void initialize(){
        test = new UserRegistations();
    }

    @Test
    void givenFirstNameInCorrectFormatShouldReturnTrue() {
        test = new UserRegistations();
        boolean actual = test.firstName("Aniket");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenLastNameInCorrectFormatShouldReturnTrue() {
        test = new UserRegistations();
        boolean actual = test.lastName("Shelar");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenEmailIdInCorrectFormatShouldReturnTrue() {
        test = new UserRegistations();
        boolean actual = test.email("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenphoneNumberInCorrectFormatShouldReturnTrue() {
        test = new UserRegistations();
        boolean actual = test.phoneNumber("91 9848372837");
        Assertions.assertEquals(true,actual);
    }
}

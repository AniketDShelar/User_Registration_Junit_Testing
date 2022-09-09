package com.intellijide.userregistrationtesting;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationsTest {
    UserRegistrations test;
    void initialize(){
        test = new UserRegistrations();
    }

    @Test
    void givenFirstNameInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.firstName("Aniket");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenLastNameInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.lastName("Shelar");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenEmailIdInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.email("abc.xyz@bl.co.in");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenphoneNumberInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.phoneNumber("91 9848372837");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenRulePasswordInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.password("Abcd@432");
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenEmailSamplesInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.emailSamples("abc@yahoo.com");
        Assertions.assertEquals(true,actual);
    }
}
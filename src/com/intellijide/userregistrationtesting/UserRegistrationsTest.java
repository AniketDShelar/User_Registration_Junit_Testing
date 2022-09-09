package com.intellijide.userregistrationtesting;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class UserRegistrationsTest {
    UserRegistrations test;
    void initialize(){
        test = new UserRegistrations();
    }

    @Test
    void givenFirstNameInCorrectFormatShouldReturnTrue(){
        test = new UserRegistrations();
        boolean actual = false;
        try {
            actual = test.firstName("aniket");
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenLastNameInCorrectFormatShouldReturnTrue(){
        test = new UserRegistrations();
        boolean actual = false;
        try {
            actual = test.lastName("shelar");
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenEmailIdInCorrectFormatShouldReturnTrue(){
        test = new UserRegistrations();
        boolean actual = false;
        try {
            actual = test.email("abc.xyz@bl.co.in");
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenphoneNumberInCorrectFormatShouldReturnTrue(){
        test = new UserRegistrations();
        boolean actual = false;
        try {
            actual = test.phoneNumber("91 9848372837");
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenRulePasswordInCorrectFormatShouldReturnTrue(){
        test = new UserRegistrations();
        boolean actual = false;
        try {
            actual = test.password("Abcd@432");
        } catch (Exception e) {
            System.out.println("Invalid Input "+e.getMessage());
        }
        Assertions.assertEquals(true,actual);
    }
    @Test
    void givenEmailSamplesInCorrectFormatShouldReturnTrue() {
        test = new UserRegistrations();
        boolean actual = test.emailSamples("abc@yahoo.com");
        Assertions.assertEquals(true,actual);
    }
}
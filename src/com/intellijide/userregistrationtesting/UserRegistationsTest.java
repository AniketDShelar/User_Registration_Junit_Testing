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
        boolean actual = test.firstName("Aakash");
        Assertions.assertEquals(true,actual);
    }
}
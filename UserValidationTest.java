package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void givenFirstName_WhenProper_ShouldNotThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidFirstName("Rahul");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid First Name", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidFirstName("robin");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid First Name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldNotThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidLastName("nachos");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Last Name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidLastName("match");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Last Name", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenProper_ShouldNotThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidEmailId("sri456@gmail.com");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Email Id", e.getMessage());
        }
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidEmailId("srikar.@.gmail*com");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid First Name", e.getMessage());
        }
    }

    @Test
    public void givenMobileNo_WhenProper_ShouldNotThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidMobileNo("91 9993334445 ");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void givenMobileNo_WhenNotProper_ShouldThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidMobileNo("919993334445");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldNotThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidPassword("A123@abc ");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Password", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldThrows_ExceptionMessage() {
        UserValidator valid = new UserValidator();
        try {
            valid.isValidPassword("abc@#ABC");
        } catch (RegistrationException e) {
            Assert.assertEquals("Please Enter valid Password", e.getMessage());
        }
    }


}

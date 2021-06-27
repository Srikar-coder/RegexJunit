package com.bridgelabz.regex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidationTest {

        @Test
        public void givenEmailId_WhenProper_ShouldReturnTrue(){
            UserValidation valid = new UserValidation();
            assertTrue(valid.isValidEmailId("abc@yahoo.com"));
            assertTrue(valid.isValidEmailId("abc-100@yahoo.com"));
            assertTrue(valid.isValidEmailId("abc.100@yahoo.com"));
            assertTrue(valid.isValidEmailId("abc111@abc.com"));
            assertTrue(valid.isValidEmailId("abc-100@abc.net"));
            assertTrue(valid.isValidEmailId("abc.100@abc.com.au"));
            assertTrue(valid.isValidEmailId("abc@1.com"));
            assertTrue(valid.isValidEmailId("abc@gmail.com.com"));
            assertTrue(valid.isValidEmailId("abc+100@gmail.com"));
        }

        @Test
        public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
            UserValidation inValid = new UserValidation();
            assertFalse(valid.isValidEmailId("abc.@gmail.com"));
            assertFalse(valid.isValidEmailId("abc@.com.my"));
            assertFalse(valid.isValidEmailId("abc123@gmail.a"));
            assertFalse(valid.isValidEmailId("abc123@.com"));
            assertFalse(valid.isValidEmailId("abc123@.com.com"));
            assertFalse(valid.isValidEmailId(".abc@abc.com"));
            assertFalse(valid.isValidEmailId("abc()*@gmail.com"));
            assertFalse(valid.isValidEmailId("abc@%*.com"));
            assertFalse(valid.isValidEmailId("abc..2002@gmail.com"));
            assertFalse(valid.isValidEmailId("abc.@gmail.com"));
            assertFalse(valid.isValidEmailId("abc@gmail.com.1a"));
            assertFalse(valid.isValidEmailId("abc@gmail.com.aa.au"));
        }
}

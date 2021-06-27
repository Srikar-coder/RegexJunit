package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserValidatorTest {
    private String emailIdTest;
    private  boolean expectedResult;
    private UserValidator validator;

    @Before
    public void initialize(){
        validator = new UserValidator();
    }

    public UserValidatorTest(String emailIdTest, boolean expectedResult){
        this.emailIdTest = emailIdTest;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true},
                {"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},
                {"abc.@gmail.com", false}, {"abc@.com.my", false}, {"abc123@gmail.a", false},
                {"abc123@.com", false}, {"abc123@.com.com", false}, {".abc@abc.com", false},
                {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@gmail.com.aa.au", false}});
    }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedResult () {
        System.out.println("Email Ids :" +emailIdTest);
        Assert.assertEquals(expectedResult, validator.isValidEmailId(emailIdTest));
    }
}

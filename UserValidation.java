package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserValidation {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";

    private static final String EMAIL_PATTERN = "^([a-zA-Z0-9.]+)@([a-zA-Z0-9]+).([a-zA-Z]{2,3})$";
    private static final String MOBILE_NUMBER_PATTERN = "(0|91)?\\s([7-9][0-9]{9})";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,12}$";

    //First name starts with Cap and has minimum 3 characters
    public boolean isValidFirstName(String fname) {
        /**
         * @param firstName
         * @return boolean
         */
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname). matches();
    }
    // Last name starts with Cap and has minimum 3 characters
    public boolean isValidLastName(String lname) {
        /**
         *
         * @param lastName
         * @return boolean
         */
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname). matches();
    }
    //Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public boolean isValidEmailId(String emailId) {
        /**
         *
         * @param emailId
         * @return boolean
         */
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailId).matches();
    }
    //Country code follow by space and 10 digit number
    /**
     *
     * @param mobileNo
     * @return boolean
     */
    public boolean isValidMobileNo(String mobileNo) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNo). matches();
    }
    //Password should contain minimum 8 Characters
    public static boolean isValidPassword(String password) {
        /**
         *
         * @param password
         * @return boolean
         */
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password). matches();
    }

}

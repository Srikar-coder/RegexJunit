package com.bridgelabz.regex;

import java.util.regex.Pattern;

public class UserValidation {

    private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
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

}

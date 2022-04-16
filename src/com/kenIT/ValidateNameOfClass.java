package com.kenIT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameOfClass {
   private static final String REGEX = "^[ACP]\\d{4}[GHIKLM]$";

    public ValidateNameOfClass(){}

    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

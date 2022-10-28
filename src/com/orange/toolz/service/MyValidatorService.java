package com.orange.toolz.service;

import com.orange.toolz.utility.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyValidatorService {

    public MyValidatorService() {
    }

    public boolean isPhoneNumberValid(String number) {
        synchronized(this) {
            Pattern pattern = Pattern.compile(Utils.PHONE_REGEX);
            Matcher matcher = pattern.matcher(number);
            return matcher.matches();
        }
    }

    public boolean isEmailValid(String email) {
        synchronized (this) {
            Pattern pattern = Pattern.compile(Utils.EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }
}

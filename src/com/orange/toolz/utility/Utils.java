package com.orange.toolz.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static int RETRIEVE_PROCESS = 100;
    public static int STORING_PROCESS = 101;
    public static String FILE_PATH = "C:\\Users\\DICO\\Desktop\\Assignment\\src\\com\\orange\\toolz\\data\\1M-customers.txt";
    public static String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
    public static String PHONE_REGEX = "\\(?\\d{3}\\)?-? *\\d{3}-? *-?\\d{4}";
    public static synchronized boolean phoneNumberValidator(String number) {
        Pattern pattern = Pattern.compile("\\(?\\d{3}\\)?-? *\\d{3}-? *-?\\d{4}");
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            return true;
        } else {
            System.out.println("Invalid Number : " + number);
            return false;
        }
    }
}
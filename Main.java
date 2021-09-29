package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String email = "tihon.bobrov@gmail.com";
        emailValidation(email);
    }

    private static void emailValidation(String email) {
        String result = null;
        Pattern pattern = Pattern.compile("^([\\w-]+\\.?[\\w-]+)@([\\w&&[^_]]+).[a-z]{2,4}$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            result = matcher.group();
        }
        if (result != null) {
            System.out.println(String.format("Адрес эл.почты %s является валидным.", email));
        } else {
            System.out.println(String.format("Адрес эл.почты %s не является валидным.", email));
        }
    }
}

package com.simpleExamples;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class PassWordValidator {
    private static String oldPassword = "hisTorica!";
    private static final int PASS_MAX_LENGTH = 8;
    private static Scanner input = new Scanner(System.in);
    private static String password = new String();
    private static final String userName = "Roberto";

    public static void main(String[] args) {
        System.out.print("Please, enter the new password : " );
        password = input.next();
        System.out.println("User : " + userName + ",\toldPassword >> " + oldPassword + ",\tcurrent pass >> " + password);
        System.out.println();

        boolean correctSize = isSizeCorrect(password);
        System.out.println("Is the length correct?  " + correctSize);

        boolean upperCaseIncluded = containsUppercaseLetters(password);
        System.out.println("Does it contain uppercase letters? " + upperCaseIncluded);

        boolean  specialCharIncluded = containsSpecial(password);
        System.out.println("Does it contain special characters? " + specialCharIncluded);

        boolean isSameAsUser =  isUserName(password);
        System.out.println("Password is the username? " + isSameAsUser);

        boolean isTheOldOne = isSameAsOld(password);
        System.out.println("Is the old one? " + isTheOldOne);

        System.out.println();
        if (correctSize && upperCaseIncluded && specialCharIncluded && !isSameAsUser && !isTheOldOne) {
            System.out.println("The new password is valid");
        } else System.out.println("The new password is not valid. Please check it again");
        input.close();

    }

    private static boolean containsUppercaseLetters(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) return true;
        }
        return false;
    }

    private static boolean isSameAsOld(@NotNull String password) {
        if (password.equalsIgnoreCase(oldPassword))  return true;
            else return false;
    }

    private static boolean isUserName(String password) {
        if (password == userName) return true;
            else return false;
    }

    private static boolean containsSpecial(@NotNull String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) { return true; }
        }
        return false;
    }

    public static boolean isSizeCorrect(@NotNull String password) {
        if (password.length() >= PASS_MAX_LENGTH) {return true;} else {return false;}
    }




}

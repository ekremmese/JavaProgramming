package day28_ArrayList;

import java.util.Scanner;

public class StrongPassword {
    /*
    Warmup tasks:
	1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

     */

    public static void main(String[] args) {

        String password = "Kardanad am1.%";

        int countUpperCaseLetter = 0;
        int countLowerCaseLetter = 0;
        int countSpecialCharacters = 0;
        int countDigits = 0;
        char[] ch = password.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                countUpperCaseLetter++;
            }
            if (Character.isLowerCase(ch[i])) {
                countLowerCaseLetter++;
            }
            if (!Character.isLetterOrDigit(ch[i])) {
                countSpecialCharacters++;
            }
            if (Character.isDigit(ch[i])) {
                countDigits++;
            }

        }
        if (password.length() < 8 || password.contains(" ") || countUpperCaseLetter < 1 || countLowerCaseLetter < 1 || countSpecialCharacters < 1 || countDigits < 1) {
            System.out.println("Password is not strong");
        } else {
            System.out.println("Password is OK!");
        }

    }


}

package sample.model;

import java.util.ArrayList;
import java.util.Random;

public class Password {

    private String password = "";
    private final int maxLength = 16;
    private char[] specialChars = new char[]{'!','@','#','$','%','^','&','*','(',')','_','?','+','<','>','-','~',';',':','/','.'};
    private char[] numbers = new char[]{'1','2','3','4','5','6','7','8','9','0'};
    private char[] lowerCaseLetters = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private char[] upperCaseLetters = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    public Password() {}

    // create the password
    public void createPassword() {

        String tmpString = "";
        int number;
        int counter = 0;

        Random rn = new Random();

        // pick at random characters to make a password that is 12 characters long
        while(counter < maxLength) {

            // get a random number between 1 and 4
            number = rn.nextInt(4) + 1;

            // choose between the four different arrays

            // add special symbol to password
            if(number == 1) {
                number = rn.nextInt(specialChars.length);
                tmpString += specialChars[number];
            }

            // add a number to password
            else if(number == 2) {
                number = rn.nextInt(numbers.length);
                tmpString += numbers[number];
            }

            // add lower case letter to password
            else if(number == 3) {
                number = rn.nextInt(lowerCaseLetters.length);
                tmpString += lowerCaseLetters[number];
            }

            // add upper case letter to password
            else {
                number = rn.nextInt(upperCaseLetters.length);
                tmpString += upperCaseLetters[number];
            }

            counter += 1;
        }

        // set the password
        password = tmpString;
    }

    // get the password
    public String getPassword() {
        return password;
    }
}

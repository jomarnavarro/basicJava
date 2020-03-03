package mArrays;

import libs.Input;

public class StringProperties {

    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet);

        Input.print("This string contains " + alphabet.length() + " characters.\n");

        Input.print("The character at index 4 is "+ alphabet.charAt(4) + "\n");

        Input.print("The index of the character Z is " + alphabet.indexOf('Z') + "\n");
    }
}

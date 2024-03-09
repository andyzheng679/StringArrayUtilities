package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean isWord = false;
        for(int i = 0; i < array.length; i++){
            if(value.equals(array[i])){
                isWord = true;
            }
        }
        return isWord;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[array.length - 1 - i];
        }


        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isEqual = false;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(array[array.length - 1 - i])){
                isEqual = true;
            }
        }

        return isEqual;

        //for palindromic, set a bool to false, then create a for loop, then inside of that for loop
        //have c comparison that compares the array[i] to the last equivelent of array, array[array.length - 1 -i]
        // if it's equal change bool to true
        //its array[array.length - 1 -i] bc array.length -1 auto goes to the last element of the array
        //the - i makes sure array[i] is being compared to the position equivalent,
        // so if i = 1, which is the second iteration, it would compare array[1] to array[array.length -1 - 1]
        //which is the second to last element of the array
        
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] charAlphabet = alphabet.toCharArray();

        StringBuilder build = new StringBuilder();
        for(String str : array){
            build.append(str.toLowerCase());
        }

        String buildToString = build.toString();

        for(char c : charAlphabet){
            if(!buildToString.contains(String.valueOf(c))){
                return false;
            }
        }
        return true;

        //for pangramic, create a String with all the lowercase letters in alphabet
        //then convert it to a char array
        //then you're going to use Stringbuilder and a for each loop
        //to append each string in the String[] array parameter but set it to lowercase bc the aplhabet we created is all lowercase
        //then convert the Stringbuilder instance to a String
        //then use a for each loop to loop through the char array of the alphabet
        //if the Stringbuilder instance that was convereted into a String does not contain the String.valueOf()
        // of the character, return false, if it goes through the entire for each loop without using the block of code
        //then it's true

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}

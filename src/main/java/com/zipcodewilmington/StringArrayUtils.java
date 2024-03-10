package com.zipcodewilmington;

import java.util.*;

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
        int numOfOcc = 0;
        for(String word : array){
            if(value.equals(word)){
                numOfOcc++;
            }
        }
        return numOfOcc;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int valueCounter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(valueToRemove)){
                valueCounter++;
            }
        }

        String[] newArray = new String[array.length - valueCounter];
        int newArrayIndex = 0; //index of newArray, only goes up when a value is added into it
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }
        return  newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> noDup = new ArrayList<>();
        noDup.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(array[i - 1])){
                noDup.add(array[i]);
            }
        }
        return noDup.toArray(new String[0]);

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> holder = new ArrayList<>();
        StringBuilder appending = new StringBuilder();


        appending.append(array[0]);
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(array[i - 1])){
                appending.append(array[i]);
            } else if (!array[i].equals(array[i - 1])) {
                holder.add(appending.toString());
                appending.setLength(0); //clears appending
                appending.append(array[i]);

            }
        }
        holder.add(appending.toString());

        return holder.toArray(new String[0]);
        // created a List obj bc order does matter and created a StringBuilder obj bc we have to append strings together
        //started off by appending array[0] first bc in the for loop, int i = 1 bc we want to compare the previous index
        //if we compare it to the next index, it will go out of bounds
        //inside the for loop, use an if statement
        //if array[i] is equal to the previous index, append it to the StringBuilder obj
        //if it does not equal, then add the value thats in the StringBuilder obj to the List obj
        //then reset the Stringbuilder obj: appending.setLength(0);
        //then append the current array[i] to the StringBuilder obj
        //after the loop is done, the only thing missing in the List obj is the last element in the input array
        //which will be whatever is in the Stringbuilder obj from this line: appending.append(array[i]);
        //outside of the for loop, add that to the List obj
        //then convert the List obj to a String[] using: .toArray(new String[0]);

    }


}

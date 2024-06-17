package se.lexicon;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtilExample {
    static String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};

    public static void main(String[] args) {
        ex4();
    }

    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        System.out.println(Arrays.toString(names));

        //Arrays.sort(names);
        //Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(names, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        System.out.println(Arrays.toString(names));
    }

    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
        Arrays.sort(numbers); //  // {200, 700, 900, 4555, 34500, 445000, 600000}
        int index = Arrays.binarySearch(numbers, 900);
        System.out.println("index = " + index); // Output = 2
        if (index < 0) { // negative number
            System.out.println("Data not found!"); // negative number
        } else { // positive number or zero
            System.out.println(numbers[index]); // 900
        }
    }

    public static void ex3() {
        int[] numbers = {10, 20, 30, 40};
        int[] newArray = Arrays.copyOf(numbers, numbers.length + 1);
        newArray[newArray.length - 1] = 50; // [10, 20, 30, 40, 50]
        System.out.println(Arrays.toString(newArray)); // Output = [10, 20, 30, 40, 50]
    }

    public static void addName(String newName){
        // todo : you will done it in the workshop
    }


    public static void ex4(){
        char[] letters = {'J', 'A', 'V', 'A'};

        char[] referenceToOriginalArray = letters; // {'J', 'A', 'V', 'A'}
        char[] copyOfTheOriginalArray = Arrays.copyOf(letters, letters.length); // {'J', 'A', 'V', 'A'}

        letters[0] = 'L';


        System.out.println("referenceToOriginalArray = " + Arrays.toString(referenceToOriginalArray));
        System.out.println("copyOfTheOriginalArray = " + Arrays.toString(copyOfTheOriginalArray));


    }


}

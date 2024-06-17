package se.lexicon;

public class ArrayExample {

    public static void main(String[] args) {
        // Syntax: datatype[] arrayName;
        int[] numbers;
        numbers = new int[3]; // [ 0 , 0 , 0 ]

        int[] numbersArr = new int[]{2, 4, 6, 8}; // 4
        int[] numberArrShortenedSyntax = {2, 4, 6, 8}; // 4

        String[] stringArray = new String[3]; // [null,null,null]
        char[] letters = {'J', 'A', 'V', 'A'};


        ex6();

    }


    // Accessing an Array elements
    public static void ex1() {
        String[] names = new String[3]; // [null,null,null]
        System.out.println(names.length);

        names[0] = "Fredrik";  // ["Fredrik",null,null]
        names[names.length - 1] = "Jonas";  // ["Fredrik",null,"Jonas"]

        System.out.println(names[0]); // Output = Fredrik
        System.out.println(names[1]); // Output = null
        System.out.println(names[2]); // Output = Jonas
        //System.out.println(names[10]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3


    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7}; // [5, 2, 3, 4, 7]
        // iterating through the array using an index-based for loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                numbers[i] = 3000;
            }
            System.out.println("numbers[" + i + "]= " + numbers[i]);
        }

        System.out.println("-----------");
        // Iterating through the array using Enhanced for loop or for-each loop
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    // Expanding the array
    public static void ex3() {
        int[] originalArray = {2, 5, 8, 1, 9}; // 5
        for (int element : originalArray) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line

        int[] newArray = new int[originalArray.length + 1]; // [0,0,0,0,0,0]

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = 7;  // [2,5,8,1,9,7]

        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line

    }

    // how to sort this array?
    public static void ex4() {
        int[] numbers = {5, 2, 3, 4, 7};

        // iterating over each element of the array
        for (int i = 0; i < numbers.length; i++) {
            // inner loop to iterate over the remaining elements in the array, starting from the next element after i
            for (int j = i + 1; j < numbers.length; j++) {
                //{2, 5, 3, 4, 7}
                //{2, 3, 5, 4, 7}
                //{2, 3, 4, 5, 7}
                if (numbers[i] > numbers[j]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                } // if

            } // for j

        } // for i

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

    } // ex4

    // how to find the max number of the array ?
    public static void ex5() {
        int[] numbers = {5, 2, 3, 4, 7};
        int maxNumber = 5; // 5
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("maxNumber = " + maxNumber);

    }

    public static void ex6() {
        // O  X  O
        // O  X  X
        // X  O  X

        String[][] board = new String[3][3];
        // column [0]  [1]  [2]
        // row[0]   O    X    O
        // row[1]   O    X    X
        // row[2]   X    O    X

        board[0][0] = "O";
        board[0][1] = "X";
        board[0][2] = "O";

        board[1][0] = "O";
        board[1][1] = "X";
        board[1][2] = "X";

        board[2][0] = "X";
        board[2][1] = "O";
        board[2][2] = "X";

        for (int i = 0; i < board.length; i++) {

            for (int j = 0 ; j< board[i].length ; j++){
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("\n");

        }


    }

}

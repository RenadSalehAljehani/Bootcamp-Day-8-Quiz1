import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //-------------------------------1---------------------------------------
        // Q1. Write a Java program that accept three numbers from the user and print the largest number.

        // Header
        System.out.println("-------------------Q1-------------------");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = userInput.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = userInput.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = userInput.nextInt();

        userInput.nextLine();

        if(num1 > num2 && num1 > num3) System.out.println("The largest number is " + num1);
        else if (num2 > num1 && num2 > num3) System.out.println("The largest number is " + num2);
        else System.out.println("The largest number is " + num3);

        //-------------------------------2---------------------------------------
        /* Q2. Write a Java program that accept a String and a number from the user,
        then print the character in the given index. */

        // Header
        System.out.println("-------------------Q2-------------------");

        System.out.print("Enter a string: ");
        String text = userInput.nextLine();

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        userInput.nextLine();

        char letter =' ';

        for(int i = 0; i < text.length(); i++){
            letter = text.charAt(number);
        }

        System.out.println("The character in the string (" + text + ") at the index "
                + number +" is "+ letter);

        //-------------------------------3---------------------------------------
        /* Q3.  Write a program to enter the numbers till the user wants
        and at the end it should display the sum entered. */

        // Header
        System.out.println("-------------------Q3-------------------");

        int num = 0;
        int sum = 0;

        do{
            System.out.print("Enter a number (enter -1 to exit): ");
            num = userInput.nextInt();

            userInput.nextLine();

            if(num == -1) {
                System.out.println("You exited the program!");
                break;
            }else {
                sum = sum + num;
            }
        }while (true);

        System.out.println("The sum of the numbers you entered is " + sum);

        //-------------------------------4---------------------------------------
        // Q4. Write a Java program to find positive and negative numbers of a given array.

        // Header
        System.out.println("-------------------Q4-------------------");

        int [] arrOfNumbers = {10, -21 , 30, 31, -25};

        System.out.println("The original array: " + Arrays.toString(arrOfNumbers));

        for(int n: arrOfNumbers){
            if(n > 0 ) System.out.println( n + " is a positive number");
            if(n < 0) System.out.println( n + " is a negative  number");
        }

        //-------------------------------5---------------------------------------
        // Q5. Write a Java program to find the shortest word of a given array.

        // Header
        System.out.println("-------------------Q5-------------------");

        ArrayList<String> wordsArr = new ArrayList<String>();

        wordsArr.add("Tuwaiq");
        wordsArr.add("Bootcamp");
        wordsArr.add("Student");
        wordsArr.add("JAVA");

        System.out.println("The original array: " + wordsArr);

        String shortestWord = "Short";

        for(int i = 0 ; i < wordsArr.size();i++){
            if(wordsArr.get(i).length() < shortestWord.length()) shortestWord = wordsArr.get(i);
        }

        System.out.println("The shortest word of the given array is " + shortestWord);













    }
}
package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declaration
        int biggestNum; //will hold the biggest number of the three inputted values

        System.out.println("\nEnter the first number: "); //ask for the first number
        Scanner firstNumInput = new Scanner(System.in); //scan for the first number
        int firstNum = firstNumInput.nextInt();

        System.out.println("\nEnter the second number: "); //ask for the second number
        Scanner secondNumInput = new Scanner(System.in); //scan for the second number
        int secondNum = secondNumInput.nextInt();

        System.out.println("\nEnter the third number: "); //ask for the third number
        Scanner thirdNumInput = new Scanner(System.in); //scan for the third number
        int thirdNum = thirdNumInput.nextInt();

        if ((firstNum >= secondNum) && (firstNum >= thirdNum)) { //if the first value is greater than the other values
            biggestNum = firstNum; //then the first value is the biggest value
        }
        else if ((secondNum >= firstNum) && (secondNum >= thirdNum)) { //if the second value is greater than the other values
            biggestNum = secondNum; //then the second value is the biggest value
        }
        else { //if the first and second values are not bigger than the third value
            biggestNum = thirdNum; //then the third value is the biggest value
        }

        System.out.println("\nThe largest number is " + biggestNum + "."); //tell the user which value is the biggest
    }
}
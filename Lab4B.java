/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 4B
*/
import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        String dayEntered;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day: ");
        dayEntered = input.next();

        if (dayEntered.equals("Monday")) {
            System.out.println("I have class today!");
        } else if (dayEntered.equals("monday")) {
            System.out.println("I have class today!");
        } else if (dayEntered.equals("Wednesday")) {
            System.out.println("I have class today!");
        } else if (dayEntered.equals("wednesday")) {
            System.out.println("I have class today!");
        } else if (dayEntered.equals("Friday")) {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        } else if (dayEntered.equals("friday")) {
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
        }  else {
            System.out.println("I should use this time to do my homework.");
        }

    }

        }








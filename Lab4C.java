/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 4C
*/
import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args) {
        float num;
        int choice = 0;
        System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");

        num = input.nextFloat();

            System.out.println("What would you like to do to this number:");
            System.out.println("0- Get the additive inverse of the number");
            System.out.println("1- Get the reciprocal of the number");
            System.out.println("2- Square the number");
            System.out.println("3- Cube the number");
            System.out.println("4- Exit the program\n");

            choice = input.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("\nThe additive inverse of " + num + " is " + -(num));
                    break;

                case 1:
                    System.out.println("\nThe reciprocal of " + num + " is " + (1 / num));
                    break;

                case 2:
                    System.out.println("\nThe square of " + num + " is " + (num * num));
                    break;

                case 3:
                    System.out.println("\nThe cube of " + num + " is " + (num * num * num));
                    break;

                case 4:
                    System.out.println("\nThank you, goodbye!");
                    break;

                default:
                    System.out.println("\nInvalid input, please try again!");
                    break;

            }
        }
    }


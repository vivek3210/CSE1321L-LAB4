/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 4A
*/
import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args){

        float testScore;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score of your exam: ");
        testScore = input.nextFloat();

        if (testScore >= 97.5)
        {
            System.out.println("Letter grade is: A+");
        }
        else if (testScore >= 94.5)
        {
            System.out.println("Letter grade is: A");
        }
        else if (testScore >= 91.5)
        {
            System.out.println("Letter grade is: A-");
        }
        else if (testScore >= 88.5)
        {
            System.out.println("Letter grade is: B+");
        }
        else if (testScore >= 85.5)
        {
            System.out.println("Letter grade is: B");
        }
        else if (testScore >= 82.5)
        {
            System.out.println("Letter grade is: B-");
        }
        else if (testScore >= 79.5)
        {
            System.out.println("Letter grade is: C+");
        }
        else if (testScore >= 76.5)
        {
            System.out.println("Letter grade is: C");
        }
        else if (testScore >= 73.5)
        {
            System.out.println("Letter grade is: C-");
        }
        else if (testScore >= 70.5)
        {
            System.out.println("Letter grade is: D+");
        }
        else if (testScore >= 67.5)
        {
            System.out.println("Letter grade is: D");
        }
        else if (testScore >= 64.5)
        {
            System.out.println("Letter grade is: D-");
        }
        else if (testScore >= 0)
        {
            System.out.println("Letter grade is: F");
        }


    }
}

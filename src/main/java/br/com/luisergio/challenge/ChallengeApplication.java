package main.java.br.com.luisergio.challenge;

import java.util.Scanner;

public class ChallengeApplication {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("################################");
        System.out.println("  Welcome to Luis's Challenge!");
        System.out.println("################################");
        System.out.println();

        int option;

        do{

            System.out.println("Type the number of the exercise to be executed:");
            System.out.println("  1 - Votes in relation to the total number of voters");
            System.out.println("  2 - Bubble Sort");
            System.out.println("  3 - Factorial");
            System.out.println("  4 - Sum of multiples of 3 or 5");
            System.out.println("  To exit type -1");
            System.out.println();

            System.out.print("Execute: ");
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Executing 1...");
                    break;
                case 2:
                    System.out.println("Executing 2...");
                    break;
                case 3:
                    System.out.println("Executing 3...");
                    break;
                case 4:
                    System.out.println("Executing 4...");
                    break;
                case -1:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("ERROR: INVALID OPTION!");
                    break;
            }

            System.out.println();
            System.out.println();

        }
        while(option != -1);
    }
}

package br.com.luisergio.challenge;

import br.com.luisergio.challenge.business.impl.FactorialBusinessImpl;
import br.com.luisergio.challenge.business.impl.MultiplesOfThreeAndFiveBusinessImpl;
import br.com.luisergio.challenge.business.impl.VotesBusinessImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Challenge application.
 */
public class ChallengeApplication {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("################################");
        System.out.println("  Welcome to Luis's Challenge!");
        System.out.println("################################");
        System.out.println();

        int option;

        do{
            ChallengeApplication.printExerciseList();

            try {
                option = sc.nextInt();

                switch (option){
                    case 1:
                        System.out.println("Executing 1...");
                        VotesBusinessImpl exe1 = new VotesBusinessImpl(800, 150, 50);
                        exe1.execute();
                        break;
                    case 2:
                        System.out.println("Executing 2...");
                        break;
                    case 3:
                        System.out.println("Executing 3...");
                        FactorialBusinessImpl exe3 = new FactorialBusinessImpl();
                        exe3.execute();
                        break;
                    case 4:
                        System.out.println("Executing 4...");
                        MultiplesOfThreeAndFiveBusinessImpl exe4 = new MultiplesOfThreeAndFiveBusinessImpl();
                        exe4.execute();
                        break;
                    case -1:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("ERROR: INVALID OPTION!");
                        break;
                }

            } catch (InputMismatchException ex){
                System.out.println("ERROR: INVALID INPUT!");
                option = 0;
                sc.nextLine();
            }

            System.out.println();
            System.out.println();

        }
        while(option != -1);
    }

    public static void printExerciseList(){
        System.out.println("Type the number of the exercise to be executed:");
        System.out.println("  1 - Votes in relation to the total number of voters");
        System.out.println("  2 - Bubble Sort");
        System.out.println("  3 - Factorial");
        System.out.println("  4 - Sum of multiples of 3 or 5");
        System.out.println("  To exit type -1");
        System.out.println();
        System.out.print("Execute: ");
    }
}

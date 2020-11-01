package br.com.luisergio.challenge.business.impl;

import br.com.luisergio.challenge.business.ExerciseBusiness;

import java.util.Scanner;

/**
 * The type Bubble sort business.
 */
public class BubbleSortBusinessImpl implements ExerciseBusiness {

    /**
     * Execute method to run the votes exercise.
     */
    @Override
    public void execute() {

        Scanner sc = new Scanner(System.in);
        System.out.println("To cancel this execution type a letter at any time.");

        System.out.print("Type the size of the vector: ");
        int size = sc.nextInt();

        int[] vector = new int[size];

        for(int index = 0; index < size; index ++){
            System.out.print(String.format("Type the %dº value:", index + 1));
            vector[index] = sc.nextInt();
        }

        System.out.println("So given the vector:");
        this.printVector(vector);

        System.out.println("The Bubble Sort result is:");
        int[] sortedVector = this.bubbleSort(vector);
        this.printVector(sortedVector);
    }

    private int[] bubbleSort(int[] vector){
        int[] sortedVector = vector.clone();
        boolean isSorted;

        do{
            isSorted = true;

            for(int index = 0; index < sortedVector.length - 1; index++){
                if(sortedVector[index] > sortedVector[index + 1]) {
                    int temp = sortedVector[index];
                    sortedVector[index] = sortedVector[index + 1];
                    sortedVector[index + 1] = temp;
                    isSorted = false;
                }
            }


        } while(!isSorted);

        return sortedVector;
    }

    private void printVector(int[] vector){
        System.out.print("[");
        for(int index = 0; index < vector.length; index ++){
            System.out.print(vector[index]);
            if(index < vector.length-1)
                System.out.print(",");
        }
        System.out.println("]");
    }

}

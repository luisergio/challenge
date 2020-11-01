package br.com.luisergio.challenge.business.impl;

import br.com.luisergio.challenge.business.ExerciseBusiness;

import java.util.Scanner;


/**
 * The type Multiples of three and five business.
 */
public class MultiplesOfThreeAndFiveBusinessImpl implements ExerciseBusiness {

    /**
     * Execute method to get the sum of multiples of three and five exercise.
     */
    @Override
    public void execute() {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("This exercise get the sum of multiples of three and five there are above the number.");
        System.out.println();
        System.out.print("Type the number : ");

        int value = sc.nextInt();
        long result = this.getSum(value-1);

        System.out.println("The sum is: " + result);

    }

    /**
     * Gets the sum of multiples of three and five.
     *
     * @param value the value
     * @return the sum
     */
    public long getSum(int value) {

        if(value < 2)
            return 0;

        if(value % 3 == 0 || value % 5 == 0)
            return value + getSum(value - 1);

        return getSum(value - 1);
    }
}

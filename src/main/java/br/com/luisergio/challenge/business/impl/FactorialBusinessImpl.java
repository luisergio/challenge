package br.com.luisergio.challenge.business.impl;

import br.com.luisergio.challenge.business.ExerciseBusiness;

import java.util.Scanner;


/**
 * The type Factorial business.
 */
public class FactorialBusinessImpl implements ExerciseBusiness {

    /**
     * Execute method to run the factorial exercise.
     */
    @Override
    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type the number to get the factorial of: ");

        int value = sc.nextInt();
        long factorial = this.getFactorial(value);

        System.out.println("The factorial is: " + factorial);

    }

    /**
     * Gets factorial.
     *
     * @param value the value to use on calculation
     * @return the factorial
     */
    public long getFactorial(int value) {
        if(value <= 1)
            return 1;

        long result = value;

        for(int x = value-1; x > 1; x--) {
            result = result * x;
        }

        return result;
    }
}

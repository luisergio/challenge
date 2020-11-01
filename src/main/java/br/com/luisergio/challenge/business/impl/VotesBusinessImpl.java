package br.com.luisergio.challenge.business.impl;

import br.com.luisergio.challenge.business.ExerciseBusiness;

/**
 * The type Votes business.
 */
public class VotesBusinessImpl implements ExerciseBusiness {

    private int validVotes;
    private int nullVotes;
    private int blankVotes;
    private int totalVotes;

    /**
     * Instantiates a new Votes business.
     *
     * @param validVotes the valid votes
     * @param nullVotes  the null votes
     * @param blankVotes the blank votes
     */
    public VotesBusinessImpl(int validVotes, int nullVotes, int blankVotes){
        this.validVotes = validVotes;
        this.nullVotes = nullVotes;
        this.blankVotes = blankVotes;
        this.totalVotes = validVotes + nullVotes + blankVotes;
    }

    /**
     * Execute method to run the votes exercise.
     */
    @Override
    public void execute() {
        System.out.println("Given...");
        System.out.println("  Valid votes = " + this.validVotes);
        System.out.println("  Null votes  = " + this.nullVotes);
        System.out.println("  Blank votes = " + this.blankVotes);
        System.out.println();
        System.out.println("So...");
        System.out.println(String.format("  Valid percentage = %.2f", this.getValidPercentage()) + "%");
        System.out.println(String.format("  Null percentage = %.2f", this.getNullPercentage()) + "%");
        System.out.println(String.format("  Blank percentage = %.2f", this.getBlankPercentage()) + "%");
    }

    private float getValidPercentage(){
        return this.getPercentage(this.validVotes, this.totalVotes);
    }

    private float getBlankPercentage(){
        return this.getPercentage(this.blankVotes, this.totalVotes);
    }

    private float getNullPercentage(){
        return this.getPercentage(this.nullVotes, this.totalVotes);
    }

    /**
     * Gets percentage using kind of Template Method Design Pattern.
     *
     * @param part  the part
     * @param total the total
     * @return the percentage
     */
    public float getPercentage(int part, int total) {
        return (part * 100f) / total;
    }
}

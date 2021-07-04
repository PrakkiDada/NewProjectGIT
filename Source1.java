package com.prakash;

import java.util.*;

class SavingAmount {
    //write your code here
    int savings;

    public int checkSaving() {
        if(savings >= 1000)
            System.out.println("Congratulations! You have saved a good amount");
        else if (savings < 1000 && savings > 0)
            System.out.println("Insufficient saving!");
        else if (savings < 0)
            System.out.println("You are in debt");
        return savings;
    }

    public void setInitialSaving(int savings) {
        this.savings = savings;
    }
    public void decrementSaving(){
        this.savings = this.savings - 100;
    }
    public void incrementSaving(){
        this.savings = this.savings + 1000;
    }

    public int getCurrentSaving() {
        return savings;
    }
}

public class Source1 {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs" + obj.getCurrentSaving());
    }
}



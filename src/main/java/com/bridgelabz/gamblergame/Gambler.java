package com.bridgelabz.gamblergame;

public class Gambler {

    public static final int STAKE = 100;
    public static final int BET = 1;

    public static void main(String[] args) {

        System.out.println("New Branch1");
        Gambler gambler = new Gambler();
        System.out.println("******* Welcome to Gambler Game *******");
        gambler.checkWinOrLose();
        System.out.println("*********** Gambler Game Finished *******");

    }

    public void checkWinOrLose() {
        boolean randomlyCheck = (Math.random() < 0.5);

        if (randomlyCheck) {
            System.out.println(" Congrats Player Win ");
        } else {
            System.out.println(" Player Lose ");
        }
    }



}
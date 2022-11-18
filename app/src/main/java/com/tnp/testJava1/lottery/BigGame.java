package com.tnp.testJava1.lottery;

public class BigGame extends NumberGame {

    int numberCount = 6;


    @Override
    public void generate() {
        System.out.println("generate big game");
    }


    public static void main(String[] args) {

        BigGame bigGame = new BigGame();
        bigGame.numberCount = 5;  //default-level variable

    }
}


package com.bob;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "james";
       // int score = 200;
        int score =  calculateHighScorePosition(1500);
        displayHighScorePosition(name, score);
        //System.out.println(calculateHighScorePosition(score));

    }

    public static void displayHighScorePosition(String playerName,int position){
        System.out.println(playerName + " " + "managed to get into position "
         + " " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 100 && playerScore < 500){
            return 3;
        }
        if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        if(playerScore >= 1000){
            return 1;
        }
        else {
            return 4;
        }
    }

}

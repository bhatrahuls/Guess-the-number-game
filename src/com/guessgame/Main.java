package com.guessgame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gameNumber;

        Scanner sc = new Scanner(System.in);
        while(true){
            gameNumber = (int) (Math.random()*10);
            System.out.println(gameNumber);
            System.out.println("Guess the number between 0-10 or enter -1 to give up");
            int userNumber = sc.nextInt();
            if(userNumber==-1){
                System.out.println("Thank you for playing.");
                System.out.print("The correct number was ");
                System.out.println(gameNumber);
                break;
            }
            if(userNumber==gameNumber){
                System.out.println("hurray!!!!!! You won!!!!");
                System.out.println("Press 1 to play again or 0 to exit");
                int choice=sc.nextInt();
                if(choice==1)
                    continue;
                System.out.println("Thank you for playing.");
                break;


            }
            else if(userNumber<gameNumber){
                System.out.println("The correct number is greater than the number you entered.");
            }
            else{
                System.out.println("The correct number is lesser than the number you entered");
            }
        }


    }
}
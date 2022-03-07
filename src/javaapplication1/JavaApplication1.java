/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruang
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stopvalue = "Y";
        Scanner sc = new Scanner(System.in);

        System.out.println("Add betting money");
        int beta = 0;
        beta = sc.nextInt();
        int bet = 0;
        int betr = 0;

        do {
            switch (stopvalue) {
                case "Y": {
                    System.out.println("Hello World");
                    System.out.println("Place your bet:");

                    bet = sc.nextInt();

//                    if (bet > betr || bet > beta) {
//                        System.out.println("Not enough betting money remaining");
//                        break;
//                    }
                    System.out.println("You bet " + bet);
                    System.out.println("What do you bet on? 1-6");

                    int die = 0;
                    die = sc.nextInt();

                    System.out.println("You bet on " + die);
                    System.out.println("You roll a six sided die...");

                    int result;
                    Random gen = new Random();
                    result = gen.nextInt(7);
                    
                    if (result < 1) {
                        result = gen.nextInt(7);
                    }

                    System.out.println("You rolled a " + result);

                    if (die == result) {
                        System.out.println("You win!!");
                        betr = bet * 2;
                        System.out.println("Betting money doubled!!");
                    } else {
                        System.out.println("You lose..");
                        betr = bet / 2;
                        System.out.println("Betting money halved..");
                    }

                    System.out.println("Betting money remaining: " + betr);
                    System.out.println("Play again? Y/N");

                    stopvalue = sc.next();
                }
                break;
                default:
                    System.exit(0);
                    break;
            }
        } while (true);

    }

}

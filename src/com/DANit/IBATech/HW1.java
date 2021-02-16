package com.DANit.IBATech;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;


public class HW1 {
    public static int random;
    public static int inputnumber;
    public static int z = 0;

    public static int sortRowWise(int m[][])   // add 2d array
    {

        for (int i = 0; i < m.length; i++) {
            Arrays.sort(m[i]);               // sort array
        }

        return 0;
    }

    static boolean isInt(String s) {   // if input String give exception
        try {
            Scanner sc =new Scanner(System.in);
            inputnumber = Integer.parseInt(s);
            boolean a = true;
            while (a) {
                if (inputnumber <= 100) {
                    a = false;
                    break;
                } else {
                    System.out.println("print small than 100");
                    isInt(sc.next());
                    a = true;
                }
            }
            return false;
        } catch (NumberFormatException e) {

            System.out.println("Print digit");
            return true;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Let the game begin!");
        boolean y = true;

        while (y) {


            Scanner sc = new Scanner(System.in);
            System.out.print("Add players number: ");
            while (isInt(sc.next())) {
            }

            String[] nameofPlayers = new String[inputnumber];

            int[] number = new int[100];
            int[][] result = new int[nameofPlayers.length][number.length];

            for (int i = 0; i < nameofPlayers.length; i++) {
                z++;
                System.out.print("Add name of player " + z + ": ");
                nameofPlayers[i] = sc.next();
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(nameofPlayers[i]);
                System.out.print(":  Print number\n");
                random = (int) (Math.random() * 100);
                System.out.println(random);

                for (int j = 0; j < result[i].length; j++) {
                    while (isInt(sc.next())) {
                    }
                    result[i][j] = inputnumber;
                    inputnumber = 0;

                    if (result[i][j] > random) {
                        System.out.println("Your number is too big. Please, try again.");
                    } else if (result[i][j] < random) {
                        System.out.println("Your number is too small. Please, try again.");
                    } else if (result[i][j] == random) {
                        System.out.println("Congratulations:  " + nameofPlayers[i]);
                        break;
                    }
                }
            }
            sortRowWise(result);
            for (int i = 0; i < result.length; i++) {
                System.out.println();
                System.out.print(nameofPlayers[i] + " Your numbers: ");

                for (int j = result[i].length - 1; 0 <= j; j--) {

                    if (result[i][j] != 0) {
                        System.out.print(result[i][j] + " | ");
                    }
                }

            }
            System.out.println("\nYou want continue the game print yes or no: y/n");
            z = 0;
            char answer = sc.next().charAt(0);
            while (!(answer == 'y' || answer == 'n')) {
                System.out.println("Print y/n");
                answer = sc.next().charAt(0);
                if (answer == 'y') {
                    y = true;
                } else if (answer == 'n') {
                    y = false;
                    break;
                }
            }


        }
        Thread.sleep(250);
        System.out.print(".");
        Thread.sleep(250);
        System.out.print(".");
        Thread.sleep(250);
        System.out.print(".");
        Thread.sleep(450);
        System.out.println("\nGAME FINISHED!");

    }
}



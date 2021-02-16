package com.DANit.IBATech;

import java.io.StreamCorruptedException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
    public static char[][] fires = new char[6][6];
    static int l = 0;
     static int[] i1j1 = new int[2];
     static int i1 = 0;
     static int j1 = 0;
     static int[] i2j2 = new int[2];
     static int i2 = 0;
     static int j2 = 0;
     static int count = 0;
     static int count1 = 0;


    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("All set. Get ready to rumble!" + "\nPlease input smaller than 6 digits" + "\nYou have for fire");

        boolean y = true;
        while (y) {
            tableAdd();
            tablePrint();

            boolean t = true;
            while (t) {
                System.out.println();
                while (isInt(sc.next())) { }
                i1j1[0] = l;
                i1 = l;
                while (isInt(sc.next())) { }
                i1j1[1] = l;
                j1 = l;
                for (int i = 0; i < fires.length; i++) {
                    System.out.print("\n" + i + " | ");
                    for (int j = 0; j < fires[i].length-1; j++) {
                        if (i1 == i && j1 == j+1) {
                            fires[i][j] = '*';
                            System.out.print(fires[i][j] + " | ");
                        } else if (i == 0) {
                            System.out.print((j + 1) + " | ");
                        } else {
                            System.out.print(fires[i][j] + " | ");
                        }
                    }
                }
                System.out.println("");
                        while (isInt(sc.next())) {
                        }
                        i2j2[0] = l;
                        i2 = l;
                        while (isInt(sc.next())) {
                        }
                        i2j2[1] = l;
                        j2 = l;
                if (i2 == i1 && j2 == j1) {
                    for (int i = 0; i < fires.length; i++) {
                        System.out.print("\n" + i + " | ");
                        for (int j = 0; j < fires[i].length-1; j++) {
                            if (i1 == i && j1 == j+1) {
                                fires[i][j] = '*';
                                System.out.print(fires[i][j] + " | ");
                            } else if (i == 0) {
                                System.out.print((j + 1) + " | ");
                            } else {
                                System.out.print(fires[i][j] + " | ");
                            }
                        }
                    }

                    count++;
                        if (count == 4){
                            t = false;
                        }
                        System.out.println("");
                }
                else {
                    for (int i = 0; i < fires.length; i++) {
                        System.out.print("\n" + i + " | ");
                        for (int j = 0; j < fires[i].length - 1; j++) {
                            if (i1 == i && j1 == j+1) {
                                fires[i][j] = 'x';
                                System.out.print(fires[i][j] + " | ");
                            } else if (i == 0) {
                                System.out.print((j + 1) + " | ");
                            } else {
                                System.out.print(fires[i][j] + " | ");
                            }
                        }
                   }
                    count1++;
                    if (count == 8) {
                        t = true;
                    }
                }

            }
            for (int i = 0; i < fires.length; i++) {
                System.out.print("\n" + i + " | ");
                for (int j = 0; j < fires[i].length - 1; j++) {
                     if (i == 0) {
                        System.out.print((j + 1) + " | ");
                    } else {
                        System.out.print(fires[i][j] + " | ");
                    }
                }
            }


                    System.out.println("");

            System.out.println("\n You want continue the game print yes or no: y/n");
            char answer = sc.next().charAt(0);
            while (!(answer == 'y' || answer == 'n')) {
                System.out.println("Print y/n");
                answer = sc.next().charAt(0);
                if (answer == 'y') {
                    y = true;
                    break;
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

    public static void tableAdd() {
        for (int i = 0; i < fires.length; i++) {
            for (int j = 0; j < fires[i].length - 1; j++) {
                fires[i][j] = '-';
            }
        }


    }

    public static void tablePrint() {
        for (int i = 0; i < fires.length; i++) {
            System.out.print("\n" + i + " | ");
            for (int j = 0; j < fires[i].length - 1; j++) {
                if (i == 0) {
                    System.out.print((j + 1) + " | ");
                } else System.out.print(fires[i][j] + " | ");


            }

        }
    }

    static boolean isInt(String s) {   // if input String give exception
        try {
            Scanner sc = new Scanner(System.in);
            l = Integer.parseInt(s);
            boolean a = true;
            while (a){
                if (l <= 5){
                    a = false;
                    break;
                }
                else {
                    System.out.println("print small than 6");
                    isInt(sc.next());
                    a=true;}
            }

            return false;
        } catch (NumberFormatException ex) {

            System.out.println("Print digit");
            return true;
        }
    }


}

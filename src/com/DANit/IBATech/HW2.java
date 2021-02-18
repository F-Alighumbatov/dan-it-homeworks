package com.DANit.IBATech;

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
    static boolean a = true;

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
                while (isInt(sc.next())) {
                }
                i1j1[0] = l;
                i1 = l;
                while (isInt(sc.next())) {
                }
                i1j1[1] = l;
                j1 = l;
                for (int i = 0; i < fires.length; i++) {
                    System.out.print("\n" + i + " | ");
                    for (int j = 0; j < fires[i].length - 1; j++) {
                        if (i1 == i && j1 == j + 1) {
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
                        for (int j = 0; j < fires[i].length - 1; j++) {
                            if (i1 == i && j1 == j + 1) {
                                fires[i][j] = 'x';
                                System.out.print(fires[i][j] + " | ");
                            } else if (i == 0) {
                                System.out.print((j + 1) + " | ");
                            } else {
                                System.out.print(fires[i][j] + " | ");
                            }
                        }
                    }

                    count++;
                    if (count == 4) {
                        t = false;
                        System.out.println("");
                        break;
                    }
                    System.out.println("");
                } else {
                    for (int i = 0; i < fires.length; i++) {
                        System.out.print("\n" + i + " | ");
                        for (int j = 0; j < fires[i].length - 1; j++) {
                            if (i1 == i && j1 == j) {
                                fires[i][j] = '*';
                                System.out.print(fires[i][j] + " | ");
                            } else if (i == 0) {
                                System.out.print((j + 1) + " | ");
                            } else {
                                System.out.print(fires[i][j] + " | ");
                            }
                        }
                    }
                    count1++;
                    if (count1 == 4) {
                        t = true;
                        break;
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


            if (count == 4) {
                count = 0;
                System.out.println("");
                System.out.println("You are won!");
            } else if (count1 == 4) {
                count1 = 0;
                System.out.println("");
                System.out.println("Game over");
            }


            System.out.println("");


            System.out.println("\n You want continue the game print yes or no: y/n");
            boolean x = true;
            char answer = sc.next().charAt(0);
            while (x) {
                if (answer == 'y') {
                    y = true;
                    x = true;

                    break;
                } else if (answer == 'n') {

                    x = false;
                    y = false;
                    break;
                } else {
                    System.out.println("Print y/n");
                    answer = sc.next().charAt(0);
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

            while (a) {
                if (Integer.parseInt(s) >= 1 && Integer.parseInt(s) <= 5) {
                    a = true;
                    break;
                } else if (Integer.parseInt(s) <= 0) {
                    System.out.println("print digit aroun 1-5");
                    return true;
                } else if (Integer.parseInt(s) > 5) {
                    System.out.println("print digit around 1-5");
                    return true;
                } else if (isInt(sc.next()) && l < 5) {
                    a = false;
                    break;
                } else a = true;

            }

            return false;
        } catch (NumberFormatException ex) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Print digit");
            a = true;
            return true;
        }
    }


}

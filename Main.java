package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please pick a lab > ");
        int main_choice = scanner.nextInt();
        int choice = 1;
        try {
            switch (main_choice) {
                case 1:
                    Lab1 lab = new Lab1();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                                System.out.println("Please enter arguments");
                            switch (choice) {
                                case 1:
                                    System.out.println(lab.convert(scanner.nextInt()));
                                    break;
                                case 2:
                                    System.out.println(lab.points(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 3:
                                    System.out.println(lab.footballPoints(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 4:
                                    System.out.println(lab.divisibleByFive(scanner.nextInt()));
                                    break;
                                case 5:
                                    System.out.println(lab.and(scanner.nextBoolean(), scanner.nextBoolean()));
                                    break;
                                case 6:
                                    System.out.println(lab.howManyWalls(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 7:
                                    System.out.println(lab.squared(scanner.nextInt()));
                                    break;
                                case 8:
                                    System.out.println(lab.profitableGamble(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat()));
                                    break;
                                case 9:
                                    System.out.println(lab.frames(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 10:
                                    System.out.println(lab.mod(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 0:
                                    System.out.println("Goodbye!");
                                    break;
                                default:
                                    System.out.println("No such function");
                            }
                        } catch (Exception e) {
                            System.out.println("invalid argument");
                            scanner.next();
                        }
                    }
                    break;

            }
        } catch (Exception e) {
            System.out.println("invalid argument");
            scanner.next();
        }

    }

}

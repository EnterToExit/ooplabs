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
                    Lab1 lab1 = new Lab1();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                                System.out.println("Please enter arguments");
                            switch (choice) {
                                case 1:
                                    System.out.println(lab1.convert(scanner.nextInt()));
                                    break;
                                case 2:
                                    System.out.println(lab1.points(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 3:
                                    System.out.println(lab1.footballPoints(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 4:
                                    System.out.println(lab1.divisibleByFive(scanner.nextInt()));
                                    break;
                                case 5:
                                    System.out.println(lab1.and(scanner.nextBoolean(), scanner.nextBoolean()));
                                    break;
                                case 6:
                                    System.out.println(lab1.howManyWalls(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 7:
                                    System.out.println(lab1.squared(scanner.nextInt()));
                                    break;
                                case 8:
                                    System.out.println(lab1.profitableGamble(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat()));
                                    break;
                                case 9:
                                    System.out.println(lab1.frames(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 10:
                                    System.out.println(lab1.mod(scanner.nextInt(), scanner.nextInt()));
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
                case 2:
                    Lab2 lab2 = new Lab2();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                                System.out.println("Please enter arguments");
                            switch (choice) {
                                case 1:
                                    System.out.println(lab2.oppositeHouse(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 2:
                                    System.out.println(lab2.nameShuffle("Donald Trump"));
                                    break;
                                case 3:
                                    System.out.println(lab2.discount(scanner.nextDouble(), scanner.nextInt()));
                                    break;
                                case 4:
                                    System.out.println(lab2.differenceMaxMin(scanner.next()));
                                    break;
                                case 5:
                                    System.out.println(lab2.equal(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 6:
                                    System.out.println(lab2.reverse(scanner.next()));
                                    break;
                                case 7:
                                    System.out.println(lab2.programmers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 8:
                                    System.out.println(lab2.getXO(scanner.next()));
                                    break;
                                case 9:
                                    System.out.println(lab2.bomb("There bomb!"));
                                    break;
                                case 10:
                                    System.out.println(lab2.sameAscii(scanner.next(), scanner.next()));
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
            }
        } catch (Exception e) {
            System.out.println("invalid argument");
            scanner.next();
        }

    }

}

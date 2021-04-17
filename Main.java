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
                    Prak1 prak1 = new Prak1();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                                System.out.println("Please enter arguments");
                            switch (choice) {
                                case 1:
                                    System.out.println(prak1.convert(scanner.nextInt()));
                                    break;
                                case 2:
                                    System.out.println(prak1.points(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 3:
                                    System.out.println(prak1.footballPoints(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 4:
                                    System.out.println(prak1.divisibleByFive(scanner.nextInt()));
                                    break;
                                case 5:
                                    System.out.println(prak1.and(scanner.nextBoolean(), scanner.nextBoolean()));
                                    break;
                                case 6:
                                    System.out.println(prak1.howManyWalls(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 7:
                                    System.out.println(prak1.squared(scanner.nextInt()));
                                    break;
                                case 8:
                                    System.out.println(prak1.profitableGamble(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat()));
                                    break;
                                case 9:
                                    System.out.println(prak1.frames(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 10:
                                    System.out.println(prak1.mod(scanner.nextInt(), scanner.nextInt()));
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
                    Prak2 prak2 = new Prak2();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                                System.out.println("Please enter arguments");
                            switch (choice) {
                                case 1:
                                    System.out.println(prak2.oppositeHouse(scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 2:
                                    System.out.println(prak2.nameShuffle("Donald Trump"));
                                    break;
                                case 3:
                                    System.out.println(prak2.discount(scanner.nextDouble(), scanner.nextInt()));
                                    break;
                                case 4:
                                    System.out.println(prak2.differenceMaxMin(scanner.next()));
                                    break;
                                case 5:
                                    System.out.println(prak2.equal(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 6:
                                    System.out.println(prak2.reverse(scanner.next()));
                                    break;
                                case 7:
                                    System.out.println(prak2.programmers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                                    break;
                                case 8:
                                    System.out.println(prak2.getXO(scanner.next()));
                                    break;
                                case 9:
                                    System.out.println(prak2.bomb("There bomb!"));
                                    break;
                                case 10:
                                    System.out.println(prak2.sameAscii(scanner.next(), scanner.next()));
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
                case 3:
                    Prak3 prak3 = new Prak3();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                            switch (choice) {
                                case 1:
                                    prak3.millionsRounding();
                                    break;
                                case 2:
                                    System.out.println(prak3.otherSides(3.0));
                                    break;
                                case 9:
                                    double[] array = {1.0,2.0,3.0,4.0,5.0,6.0};
                                    System.out.println(prak3.mean(array));
                                    break;
                                case 3:
                                    System.out.println(prak3.rps("scissor","rock"));
                                    System.out.println(prak3.rps("scissor","scissor"));
                                    System.out.println(prak3.rps("paper","rock"));
                                    break;
                                case 4:
                                    int[] input = {1, 2, 3, 4, 5, 6, 8, 9};
                                    System.out.println(prak3.warOfNumbers(input));
                                    break;
                                case 5:
                                    System.out.println(prak3.reverseCase("Lorem ipsum"));
                                    break;
                                case 6:
                                    System.out.println(prak3.inatorInator(scanner.next()));
                                    break;
                                case 7:
                                    System.out.println(prak3.doesBrickFit(500, 500, 500, 1, 2));
                                    break;
                                case 8:
                                    System.out.println(prak3.totalDistance(36.1, 8.6, 3, true));
                                    System.out.println(prak3.totalDistance(55.5, 5.5, 5, false));
                                    System.out.println(prak3.totalDistance(70.0, 7.0, 0, false));
                                    break;
                                case 10:
                                    System.out.println(prak3.parityAnalysis(243));
                                    System.out.println(prak3.parityAnalysis(12));
                                    System.out.println(prak3.parityAnalysis(3));
                                    break;
                                case 0:
                                    System.out.println("Goodbye!");
                                    break;
                                default:
                                    System.out.println("No such function");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                            scanner.next();
                        }
                    }
                case 4:
                    Prak4 prak4 = new Prak4();
                    while (choice != 0) {
                        try {
                            System.out.print("Please pick a number to test function > ");
                            choice = scanner.nextInt();
                            if (choice >= 1 && choice <= 10)
                                System.out.println("Please enter arguments");
                            switch (choice) {
                                case 1:
                                    int[] array = {2, 55, 60, 97, 86};
                                    prak4.sevenBoom(array);
                                    break;
                                case 2:
                                    int[] array2 = {1, 2, 3, 4, 4, 5};
                                    System.out.println(prak4.cons(array2));
                                    break;
                                case 3:
                                    System.out.println(prak4.unmix("hTsii  s aimex dpus rtni.g"));
                                    break;
                                case 4:
                                    System.out.println(prak4.noYelling("What went??? wrong!!!!!!!!!"));
                                    break;
                                case 5:
                                    System.out.println(prak4.xPronounce("The x ray is excellent deus ex"));
                                    break;
                                case 6:
                                    int[] array3 = {13, 123, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 90};
                                    System.out.println(prak4.largestGap(array3));
                                    break;
                                case 7:
                                    System.out.println(prak4.ugadaika(scanner.nextInt()));
                                    break;
                                case 8:
                                    System.out.println(prak4.commonLastVowel("Hello World!"));
                                    break;
                                case 9:
                                    System.out.println(prak4.memeSum(1222, 30277));
                                    break;
                                case 10:
                                    System.out.println(prak4.unrepeated("teshahset"));
                                    System.out.println(prak4.unrepeated("hello"));
                                    System.out.println(prak4.unrepeated("aaaaa"));
                                    System.out.println(prak4.unrepeated("WWE!!!"));
                                    System.out.println(prak4.unrepeated("call 911"));
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

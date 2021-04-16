package com.company;

import java.util.Arrays;

public class Prak2 {
    //1
    public int oppositeHouse(int num, int lenght) {
        return (lenght * 2) - num + 1;
    }

    //2
    public String nameShuffle(String name) {
        String[] namesSplit = name.split(" ");
        return namesSplit[1] + " " + namesSplit[0];
    }

    //3
    public double discount(double cost, int dis) {
        return cost -((cost / 100) * dis);
    }

    //4
    public int differenceMaxMin(String args) {
        String[] args_splitted = args.split(";");
        int[] intarray = new int[args_splitted.length];
        for (int i = 0; i < args_splitted.length; i++){
            intarray[i]=Integer.parseInt(args_splitted[i].trim());
        }
        Arrays.sort(intarray);
        int min = intarray[0];
        int max = intarray[intarray.length - 1];
        return max - min;
    }

    //5
    public int equal(int a, int b, int c) {
        if (a == b && a == c) {
            return 3;
        }
        if (a == b || a == c || b == c) {
            return 2;
        }
        return 0;
    }

    //6
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //7
    public int programmers(int first, int second, int third) {
        int[] array = {first, second, third};
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        return max - min;
    }

    //8
    public boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        String lower_str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (lower_str.charAt(i) == 'x') {
                countX += 1;
            }
            if (lower_str.charAt(i) == 'o') {
                countO += 1;
            }
        }
        return countX == countO;
    }

    //9
    public String bomb(String str) {
        return str.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }

    //10
    public boolean sameAscii(String arg1, String arg2) {
        int asciiSum1 = 0;
        int asciiSum2 = 0;
        for (int i = 0; i < arg1.length(); i++) {
            asciiSum1 += (int) arg1.charAt(i);
        }
        for (int i = 0; i < arg2.length(); i++) {
            asciiSum2 += (int) arg2.charAt(i);
        }
        return asciiSum1 == asciiSum2;
    }
}

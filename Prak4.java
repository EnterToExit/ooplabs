import java.util.*;

public class Prak4 {

    //1
    public void sevenBoom(int[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i : args) {
            builder.append(i);
        }
        String text = builder.toString();
        if (text.contains("7")) {
            System.out.print("Boom!");
        } else {
            System.out.print("there is no 7 in the array");
        }
    }

    //2
    public boolean cons(int[] args) {
        Arrays.sort(args);
        boolean output = true;
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] == args[i + 1] || (args[i] + 1) != (args[i + 1])) {
                output = false;
                break;
            }
        }
        return output;
    }

    //3
    public String unmix(String input) {
        char[] array = input.toCharArray();
        for (int i = 0; i < Math.floorDiv(array.length, 2); i++) {
            char temp = array[2 * i];
            array[2 * i] = array[2 * i + 1];
            array[2 * i + 1] = temp;
        }
        return String.valueOf(array);
    }

    //4
    public String noYelling(String input) {
        char[] array = input.toCharArray();
        for (int i = array.length - 1; i > 0; i--) {
            if ((array[i] != '!') && (array[i] != '?')) {
                break;
            }
            if (array[i] == array[i - 1]) {
                input = input.substring(0, i);
            }
        }
        return input;
    }

    //5
    public String xPronounce(String input) {
        StringBuilder output = new StringBuilder();
        String[] array = input.split("");
        System.out.print(Arrays.toString(array));
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i].equals("x")) {
                if (array[i - 1].equals(" ")) {
                    if (array[i + 1].equals(" ")) {
                        array[i] = "ecks";
                    } else {
                        array[i] = "z";
                    }
                    continue;
                }
                array[i] = "cks";
            }
        }
        if (array[array.length - 1].equals("x")) {
            if (array[array.length - 2].equals(" ")) {
                array[array.length - 1] = "ecks";
            } else {
                array[array.length - 1] = "cks";
            }
        }
        for (String s : array) {
            output.append(s);
        }
        return output.toString();
    }

    //6
    public int largestGap(int[] args) {
        Arrays.sort(args);
        int gap = 0;
        int sub;
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i] != args[i + 1]) {
                sub = args[i + 1] - args[i];
                if (sub > gap) {
                    gap = sub;
                }
            }
        }
        return gap;
    }

    //7
    public int ugadaika(int input) {
        int newInput;
        int[] inputArray = parseInt(input);
        Arrays.sort(inputArray);
        StringBuilder str = new StringBuilder();
        for (int i : inputArray) {
            str.append(i);
        }
        newInput = Integer.parseInt(str.toString());
        return input - newInput;
    }

    public int[] parseInt(int input) {
        String tempStr = Integer.toString(input);
        int[] output = new int[tempStr.length()];
        for (int i = 0; i < tempStr.length(); i++) {
            output[i] = input % 10;
            input = input / 10;
        }
        return output;
    }

    //8
    public String commonLastVowel(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        String[] parsedInput = input.toLowerCase().split(" ");
        String vowels = "aeiouy";
        for (String s : parsedInput) {
            char[] word = s.toCharArray();
            for (int j = word.length - 1; j > 0; j--) {
                if (vowels.indexOf(word[j]) > 0) {
                    map.put(word[j], map.getOrDefault(word[j], 0) + 1);
                    break;
                }
            }
        }
        Map.Entry<Character, Integer> maxEntry = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        assert maxEntry != null;
        return maxEntry.getKey().toString();
    }

    //9
    public String memeSum(int input1, int input2) {
        int temp;
        StringBuilder output = new StringBuilder();
        for (; input1 != 0 || input2 != 0; input1 /= 10, input2 /= 10) {
            temp = (input1 % 10 + input2 % 10);
            output.insert(0, temp);
        }
        return output.toString();
    }

    //10
    public String unrepeated(String input) {
        StringBuilder usedChars = new StringBuilder();
        StringBuilder output = new StringBuilder();
        String[] array = input.split("");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                usedChars.append(array[i]);
                output.append(array[i]);
                continue;
            }
            if (usedChars.toString().contains(array[i])) {
                array[i] = " ";
            } else {
                output.append(array[i]);
                usedChars.append(array[i]);
            }
        }
        return output.toString();
    }
}

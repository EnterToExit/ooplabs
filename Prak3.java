import java.util.*;


public class Prak3 {

    private Double roundTo(Double toRound, int n) {
        return (double) Math.round(toRound / Math.pow(10, n)) * Math.pow(10, n);
    }


    //1
    public void millionsRounding() {
        Map<String, Integer> places = new HashMap<>();
        places.put("Nice", 942208);
        places.put("Abu Dhabi", 1482816);
        places.put("Naples", 2186853);
        places.put("Vatican City", 572);
        printValues(places);
    }

    public void printValues(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            double value = pair.getValue();
            String key = pair.getKey();
            value = Math.round(value / 1000000) * 1000000;
            int x = (int) value;
            System.out.println("[" + key + " " + x + "]");
        }
    }

    //2
    public ArrayList<Double> otherSides(Double len) {
        return new ArrayList<Double>(Arrays.asList(roundTo(2 * len, -2), roundTo(Math.sqrt(3) * len, -2)));
    }

    //3
    public String rps(String arg1, String arg2) {
        Map<String, Integer> states = new HashMap<>();
        states.put("rock", 1);
        states.put("scissor", 2);
        states.put("paper", 3);
        int player1 = states.get(arg1);
        int player2 = states.get(arg2);
        int result = player1 - player2;
        String gameResult = "Draw";
        switch (result) {
            case 2:
            case -1:
                gameResult = "Player 1 wins";
                break;
            case 1:
            case -2:
                gameResult = "Player 2 wins";
                break;
        }
        return gameResult;
    }

    //4
    public int warOfNumbers(int[] array) {
        int even = 0;
        int odd = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even += i;
                continue;
            }
            odd += i;
        }
        return Math.abs(even - odd);
    }

    //5
    public String reverseCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    //6
    public String inatorInator(String arg) {
        String vowels = "aeiouy";
        String lastChar = arg.substring(arg.length() - 1);
        String output = "";
        if (vowels.contains(lastChar)) {
            output = arg + "-inator" + " " + arg.length() + "000";
        } else {
            output = arg + "inator" + " " + arg.length() + "000";
        }
        return output;
    }

    //7
    public boolean doesBrickFit(int height, int width, int thickness, int w, int h) {
        ArrayList<Integer> brickDimensions = new ArrayList<Integer>(Arrays.asList(height, width, thickness));
        brickDimensions.remove(Collections.max(brickDimensions));
        return (brickDimensions.get(0) <= w && brickDimensions.get(1) <= h) || (brickDimensions.get(1) <= w && brickDimensions.get(0) <= h);
    }

    //8
    public double totalDistance(double petrol, double petrolC, int passenger, boolean aC) {
        double distance;
        double petrolUsage;
        if (aC) {
            petrolUsage = petrolC * (1 + 0.05 * passenger) * (1 + 0.1);
        } else {
            petrolUsage = petrolC * (1 + 0.05 * passenger);
        }
        distance = petrol / petrolUsage * 100;
        return distance;
    }

    //9
    public double mean(double[] args) {
        double sum = 0;
        for (double i : args) {
            sum += i;
        }
        return sum / args.length;
    }

    //10
    public boolean parityAnalysisOld(String argStr) {
        int arg = Integer.parseInt(argStr);
        int argSum = 0;
        String[] argSplit = argStr.split("");
        for (int i = 0; i < argStr.length(); i++) {
            argSum += Integer.parseInt(argSplit[i]);
        }
        return (arg % 2 - argSum % 2) == 0;
    }

    public boolean parityAnalysis(int arg) {
        int argSum = 0;
        for (int i = arg; i > 0; i /= 10) {
            argSum += i % 10;
        }
        return (arg % 2 - argSum % 2) == 0;
    }
}

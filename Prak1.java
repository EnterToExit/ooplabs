public class Prak1 {
    public int convert(int minutes){
        return 60 * minutes;
    }
    public int points(int _double, int _triple){
        return _double * 2 + _triple * 3;
    }
    public int footballPoints(int wins, int draw, int lose){
        return wins * 3 + draw;
    }
    public boolean divisibleByFive(int number){
        return number % 5 == 0;
    }
    public boolean and(boolean first, boolean second){
        return first && second;
    }
    public int howManyWalls(int n, int w, int h){
        return Math.floorDiv(n, w * h);
    }
    public int squared(int a){
        return a * a;
    }
    public boolean profitableGamble(float prob, float prize, float pay){
        return prob * prize > pay;
    }
    public int frames(int frame, int minutes){
        return frame * minutes * 60;
    }
    public int mod(int a, int b){
        return a - Math.floorDiv(a, b)*b;
    }
}

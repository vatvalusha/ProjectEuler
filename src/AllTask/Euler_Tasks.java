package AllTask;

/**
 * Created by valeriyartemenko on 13.08.17.
 */
public class Euler_Tasks {
    public static int sumSquareDifference() {
        int sumSquare = 0;
        int totalSumNatural = 0;
        int squareSum = 0;
        for (int i = 1; i < 101; i++) {
            totalSumNatural += i;
            sumSquare += Math.pow(i,2);
        }
        squareSum = (int)Math.pow(totalSumNatural,2);
        return squareSum - sumSquare;
    }

    public static void main(String[] args) {
        System.out.println(sumSquareDifference());
    }
}

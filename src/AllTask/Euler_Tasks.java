package AllTask;

import java.util.ArrayList;
import java.util.List;

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
            sumSquare += Math.pow(i, 2);
        }
        squareSum = (int) Math.pow(totalSumNatural, 2);
        return squareSum - sumSquare;
    }

    public static long primeNumber() {
        long divisor = 0; //количество делителей
        List<Long> primeList = new ArrayList<>();
        primeList.add((long) 1);
        label:
        for (long i = 0; primeList.size() <=10001; i++) {
            for (long j = 1; j <= i; j++) {      // перебираем делители в диапазоне
                if (i % j == 0) { // проверяем  делимость числа на цело
                    divisor++; // считаем делители

                }
                if (divisor > 2) {    // данная проверка для оптимизации,
                    divisor = 0;    // ускорила работу на том же интервале
                    continue label;    // в 4.91 раза
                }

            }
            if (divisor == 2) {    //  делителей два
                primeList.add(i);
            }
            divisor = 0;
        }
        return primeList.get(primeList.size()-1);
    }

    public static void main(String[] args) {
//        System.out.println(sumSquareDifference());
//        System.out.println(primeNumber());
    }
}

package AllTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valera on 14.08.2017.
 */
public class FindSumPrime {

    static boolean  isPrime(long n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(long i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void findPrime() {
        int divisor = 0;
        int sum = 0;
        List<Long> listPrime = new ArrayList<>();
        label:
        for (long i = 1; i < 2000000; i++) {
            if(isPrime(i)){
                listPrime.add(i);
            }
        }
        System.out.println(listPrime);

        for (int i = 0; i < listPrime.size(); i++) {
            sum += listPrime.get(i);
        }
        System.out.println(listPrime.get(0));
        System.out.println(listPrime.get(1));
        System.out.println(listPrime.get(2));
        System.out.println(sum);
    }
}

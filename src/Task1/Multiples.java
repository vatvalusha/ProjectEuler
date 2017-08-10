package Task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valera on 09.08.2017.
 */
public class Multiples {
    public static void findSumNaturalNumbers() {
        int sum = 0;
        List<Integer> naturalList = new ArrayList<Integer>();
        for (int i = 1; i < 1000; i++) {
            naturalList.add(i);
        }
        for (int i = 0; i < naturalList.size(); i++) {
            if ((naturalList.get(i) % 3 == 0) || (naturalList.get(i) % 5 == 0)) {
                sum = sum + naturalList.get(i);
            }

        }
        System.out.print(sum);


    }

    public static void main(String[] args) {
        findSumNaturalNumbers();
    }
}

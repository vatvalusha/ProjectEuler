package Polinome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by valeriyartemenko on 10.08.17.
 */
public class Polinome {
    public static int findPolinoame() {
        List<Integer> polinomList = new ArrayList<>();
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int multiple = i * j;
                if (isPolinoame(multiple)) {
                    polinomList.add(multiple);
                }
            }
        }
        System.out.println("List: " + polinomList);
        return Collections.max(polinomList);
    }

    private static boolean isPolinoame(int muliple) {
        StringBuffer polinoame = new StringBuffer();
        polinoame.append(muliple);

        return polinoame.toString().equals(polinoame.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(findPolinoame());
    }
}

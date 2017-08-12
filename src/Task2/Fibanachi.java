package Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valeriyartemenko on 10.08.17.
 */
public class Fibanachi {
    public static List<Integer> allListFiba = new ArrayList<Integer>();

    public static List<Integer> methodeFibanachi(){
        int a = 1;
        int b = 2;
        allListFiba.add(a);
        allListFiba.add(b);
        for(int value = a+b; value <=4000000; value = a+b){
            allListFiba.add(value);
            a = b;
            b = value;
        }
        return allListFiba;
    }

    public static int sumValues(List<Integer> fibanachiList){
        int sum = 0;
        for(int i = 0; i < fibanachiList.size();i++){
            if(fibanachiList.get(i)%2 == 0){
                System.out.print(fibanachiList.get(i) + " ");
                sum += fibanachiList.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumValues(methodeFibanachi()));
    }
}


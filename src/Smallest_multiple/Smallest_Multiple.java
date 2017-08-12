package Smallest_multiple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by valeriyartemenko on 12.08.17.
 */
public class Smallest_Multiple {
    public static int smallestMultiple(){
        List<Integer> multiList = new ArrayList<>();
        for(int i = 2520; i < 1000000000; i++){
//            System.out.print("+");
            if(i%2 == 0 && i%3 == 0 && i%4 == 0 && i%5 == 0 && i%6 == 0 && i%7 == 0 && i%8 == 0 &&i%9 == 0 && i%10 == 0 &&
            i%11 == 0 && i%12 == 0 && i%13 == 0 && i%14 == 0 && i%15 == 0 && i%16 == 0 && i%17 == 0 &&i%18 == 0 && i%19 == 0 && i%20 == 0){
                multiList.add(i);
            }
        }
        if(!multiList.isEmpty()) {
            return Collections.min(multiList);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(smallestMultiple());
    }

}

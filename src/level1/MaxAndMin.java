package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class MaxAndMin {
    public int[] solution(int n, int m) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(n);
        list.add(m);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        int gcd = getGCD(list.get(0), list.get(1));

        answer[0] = gcd;
        answer[1] = list.get(0)*list.get(1)/gcd;

        return answer;
    }
    public static int getGCD(int n, int m){
        if(n % m == 0){
            return m;
        }
        return getGCD(m, n%m );
    }

}


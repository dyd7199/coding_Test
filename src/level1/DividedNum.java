package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DividedNum {
    public int[] solution(int[] arr, int divisor) {

        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr){
            if(i % divisor == 0)
                list.add(i);
        }
        Collections.sort(list);

        if(list.isEmpty()){
            return new int[]{-1};
        } else {
            answer = new int[list.size()];
        }
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        DividedNum dividedNum = new DividedNum();

        System.out.println(dividedNum.solution(new int[]{3,2,6},5));

    }
}

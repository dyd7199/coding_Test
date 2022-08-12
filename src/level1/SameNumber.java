package level1;

import java.util.ArrayList;
import java.util.HashSet;

public class SameNumber {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int preNum = arr[0];
        list.add(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if(preNum != arr[i] ){
                list.add(arr[i]);
            }
            preNum = arr[i];
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        SameNumber sameNumber = new SameNumber();

        System.out.println(sameNumber.solution(new int[]{1,1,3,3,0,1,1}));


    }
}

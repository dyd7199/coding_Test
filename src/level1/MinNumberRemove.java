package level1;

import java.util.ArrayList;
import java.util.Collections;

public class MinNumberRemove {

    public int[] solution(int[] arr) {

//        최솟값찾기
        int min = minValue(arr);

        //순회하여 최소값제거
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if(i != min)  list.add(i);
        }

        // 리스트가 비어있다면, -1 삽입
        if(list.isEmpty())  list.add(-1);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++ ) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static int minValue(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);
        return Collections.min(list);
    }

    public static void main(String[] args) {
        MinNumberRemove squareDiscrimination = new MinNumberRemove();
        int[] result = squareDiscrimination.solution(new int[]{1,2,3,4,5,6,7});
        for (int i : result) {
            System.out.print(i + ",");
        }

    }


}

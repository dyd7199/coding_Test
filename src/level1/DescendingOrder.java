package level1;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public long solution(long n) {
        // 리스트 생성
        ArrayList<Character> list = new ArrayList<>();
        // String 으로 형변환
        String num = Long.toString(n);
        // list에 넣기
        for(int i = 0; i < num.length(); i++)   list.add(num.charAt(i));
        // 내림차순 정렬
        Collections.sort(list,Collections.reverseOrder());

        String str = "";
        // String 변수에 정렬된 값 넣기
        for (Character character : list)       str += Character.getNumericValue(character);

        return Long.valueOf(str);
    }



    public static void main(String[] args) {
        DescendingOrder descendingOrder = new DescendingOrder();

        System.out.println(descendingOrder.solution(118372));


    }
}

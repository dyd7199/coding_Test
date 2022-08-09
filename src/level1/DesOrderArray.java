package level1;

import java.util.ArrayList;
import java.util.Collections;

public class DesOrderArray {
    public int[] solution(long n) {
        String num = Long.toString(n);
        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < num.length(); i++)   list.add(num.charAt(i));
        Collections.reverse(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)    answer[i] = Character.getNumericValue(list.get(i));

        return answer;
    }

    public static void main(String[] args) {
        DesOrderArray desOrderArray = new DesOrderArray();

        System.out.println(desOrderArray.solution(12345));

    }
}

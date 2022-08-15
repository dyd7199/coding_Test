package level1;

import java.util.ArrayList;

public class GetCenterText {
    public String solution(String s) {
        String answer = "";

        int index = s.length();

        if(index % 2 == 0){
            answer = Character.toString(s.charAt(index / 2 - 1)) + Character.toString(s.charAt(index / 2 ));
        } else {
            answer = Character.toString(s.charAt(index / 2 ));
        }

        return answer;
    }

    public static void main(String[] args) {
        GetCenterText getCenterText = new GetCenterText();
        System.out.println("getCenterText = " + getCenterText.solution("abcede"));

    }


}

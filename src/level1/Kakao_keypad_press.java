package level1;

import java.util.Arrays;

public class Kakao_keypad_press {

    public String solution(int[] numbers, String hand){
        String answer = "";

        System.out.println(Arrays.toString(numbers));
        System.out.println(hand);

        String [][] whole = new String [][]{
                {"1","4","7","*"}

                ,{"2","5","8","0"}

                ,{"3","6","9","#"}
        };

        String[][] whole2 = new String [][]{
                {"1","2","3"}
                ,{"4","5","6"}
                ,{"7","8","9"}
                ,{"*","0","#"}
        };
        String leftLoc = "";
        String rightLoc = "";


        for (int number : numbers) {

//            System.out.println(number);

            if(Arrays.asList(whole[0]).contains(String.valueOf(number))){
                // 왼손 이라면
                answer += "L";
                leftLoc = String.valueOf(number);
            } else if(Arrays.asList(whole[2]).contains(String.valueOf(number))){ // 오른손
                // 오른손 이라면
                answer += "R";
                rightLoc = String.valueOf(number);
            } else {

                // 숫자
                System.out.println(String.valueOf(number));



                answer += hand.equals("right") ? "R" : "L";
            }

        }

        System.out.println(answer);



        return answer;

    }


}

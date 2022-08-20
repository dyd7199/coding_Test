package level1;

import java.util.ArrayList;

public class Darts {
    public int solution(String dartResult) {

        // S = 1 제곱, D = 2 제곱, T = 3 제곱 \

        // * 해당 점수와 바로 전에 얻은 점수를 각 2배로 만듬
        // # 당첨시 해당 점수 마이너스스

        // S,D,T,#,*을 기준으로 문자열 잘라야함

        ArrayList<String> list = new ArrayList<>();

        String temp = "";
        for (int i = 0; i < dartResult.length(); i++){
            temp += dartResult.charAt(i);
            if(dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D'|| dartResult.charAt(i) == 'T' || dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#'){
                System.out.println(temp);
                list.add(temp);
                temp = "";
            }
        }

        int answer = 0;
//        for (String s : list) {
        String str = "";
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).contains("S")){
                str = "S";
                answer += Math.pow(Integer.valueOf(list.get(i).replace(str,"")),1);
            } else if(list.get(i).contains("D")){
                str = "D";
                answer += Math.pow(Integer.valueOf(list.get(i).replace(str,"")),2);
            } else if(list.get(i).contains("T")){
                str = "T";
                answer += Math.pow(Integer.valueOf(list.get(i).replace(str,"")),3);
            } else if(list.get(i).contains("*") || list.get(i).contains("#")){
                int powerNum = 0;
                if("T".equals(str)){
                    powerNum = 3;
                } else if ("S".equals(str)){
                    powerNum = 1;
                } else if("D".equals(str)){
                    powerNum = 2;
                }
                answer = (int) (answer - Math.pow(Integer.valueOf(list.get(i-1).replace(str,"").replace("#","").replace("*","")),powerNum));
                if(list.get(i).contains("#")){
                    answer += Math.pow(Integer.valueOf(list.get(i-1).replace(str,"").replace("#","")),powerNum) * (-1);
                } else {
                    answer = (int) (answer - Math.pow(Integer.valueOf(list.get(i-2).replace(str,"").replace("S","").replace("T","").replace("D","")),powerNum));

                    answer += Math.pow(Integer.valueOf(list.get(i-2).replace(str,"").replace("S","").replace("T","").replace("D","")),powerNum) * 2;
                    answer += Math.pow(Integer.valueOf(list.get(i-1).replace(str,"").replace(str,"").replace("T","").replace("D","")),powerNum) * 2;
                }

            }

        }

        return answer;
    }


    public static void main(String[] args) {
        Darts darts = new Darts();
        System.out.println("darts = " + darts.solution("1D2S3T*"));

    }


}

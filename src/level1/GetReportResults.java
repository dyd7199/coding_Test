package level1;

import java.util.*;

public class GetReportResults {

    public int[] solution(String[] id_list, String[] report, int k) {

        // 결과값
        int[] answer = new int[id_list.length];
        // 신고자, 신고당한자 리스트
        HashMap<String,HashSet<String>>reportInfo = new HashMap<>();
        // 신고당한자, 신고당한 횟수
        HashMap<String,Integer>reportCount = new HashMap<>();

        int i = 0;
        for (String s : id_list) {
            String name = s;

            reportInfo.put(s, new HashSet<>());
            reportCount.put(s,i);
            i++;
        }

        for (String s : report) {
            String [] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            reportInfo.get(to).add(from);
        }

        for (String s : id_list) {
            HashSet<String> send = reportInfo.get(s);
            if(send.size() >= k){
                for (String s1 : send) {
                    answer[reportCount.get(s1)]++;
                }

            }
        }


        return answer;
    }



}

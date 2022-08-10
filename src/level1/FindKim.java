package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FindKim {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";


        ArrayList<String> list = new ArrayList<>(Arrays.asList(seoul));

        Iterator<String> it = list.iterator();
        int cnt = 0;
        while(it.hasNext()){
            if("Kim".equals(it.next())){
                System.out.println("발견");
                answer += cnt+"에 있다";
            }
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindKim findKim = new FindKim();
        System.out.println(findKim.solution(new String[]{"Jane","Jane","Jane","Kim"}));
    }
}

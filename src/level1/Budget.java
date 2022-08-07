package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Budget {

    public int solution(int[] d, int budget) {


        int sum = 0;
        int answer = 0;


        Arrays.sort(d);
        for (int i : d) {
            sum += i;

            if (sum <= budget) {
                answer += 1;
            } else {
                break;
            }
        }

        return answer;
    }
}

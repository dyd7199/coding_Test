import level1.Backtraking_ex;
import level1.Budget;
import level1.GetReportResults;
import level1.Kakao_keypad_press;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {



//        Backtraking_ex s1 = new Backtraking_ex();
//        int[] nums = {1,2,7,6,4};
//        System.out.println(s1.solution(nums));


        // kakao
//        Kakao_keypad_press ac = new Kakao_keypad_press();
//
//        int [] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//
//        String hand = "right";
//        System.out.println(ac.solution(numbers,hand));


//        S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다. 그러나, 전체 예산이 정해져 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
//
//        물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
//
//        부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.

//        Budget budget = new Budget();
//        System.out.println(budget.solution(new int[]{1,3,2,5,4},9));


        GetReportResults getReportResults = new GetReportResults();

        String [] id_list = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};


        int[] result = getReportResults.solution(id_list,report,2);

        for (int i : result) {
            System.out.print(i + ", ");
        }

        //        System.out.println(Arrays.toString(result));

    }
}

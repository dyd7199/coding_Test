package level1;

import java.util.Arrays;
import java.util.HashSet;

public class TwoAdd {


    public int[] solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();


        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i;j++){
                set.add(nums[i] + nums[j]);
                System.out.println("nums = " + (nums[i] + nums[j]));
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        TwoAdd twoAdd = new TwoAdd();

        System.out.println(twoAdd.solution(new int[]{0,2,7}));
    }
}

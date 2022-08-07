package level1;

import java.util.HashSet;

public class Backtraking_ex {

    private static int answer = 0;

    public int solution(int[] nums) {

        int n = nums.length;    // 전체개수
        int r = 3;              // 뽑는숫자
        boolean [] visited = new boolean[n];;

        combination(nums,n,r,0,visited);

        return answer;

    }
    public static void combination(int[] nums, int n,int r,int index, boolean[] visited){

        // 결과값
        int sum  = 0;

        if( r == 0 ){
            for (int i = 0; i < n; i++) {
                if(visited[i]){
                    sum += nums[i];
                }
            }


            //소수 판별
            if(is_primeNumber(sum)){
                answer += 1;
            }
            return;
        }


        for(int i = index; i < n; i++ ){

            visited[i] = true;
            combination(nums,n,r-1,i+1,visited);
            visited[i] = false;
        }

    }

    public static boolean is_primeNumber(int num){
        int count = 0;
        for(int i = 1 ; i <= num; i++){
            // 약수인 경우
            if(num % i == 0){
                count++;
            }
        }
        // 소수인경우
//        System.out.println("소수인경우" + count);
        if(count == 2 ){
            return true;
        } else {
            return false;
        }
    }



}

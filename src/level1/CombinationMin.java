package level1;

public class CombinationMin {
    public int solution(int n) {
        int answer = 0;



        for(int i = 1; i <= n; i++){

            answer += (n%i == 0) ? i : 0;
        }

        return answer;
    }
    public static void main(String[] args) {
        CombinationMin combinationMin = new CombinationMin();
        System.out.println(combinationMin.solution(12));
    }

}

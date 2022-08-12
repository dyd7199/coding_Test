package level1;

public class AddNumber {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = Math.min(a,b); i <= Math.max(a,b); i++ ){
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        AddNumber addNumber = new AddNumber();

        System.out.println(addNumber.solution(3,3));
    }


}

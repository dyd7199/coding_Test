package level1;

public class AddDigits {
    public int solution(int n) {
        int answer = 0;

        // 내 풀이
//        String str = Integer.toString(n);
//        for(int i= 0 ; i < str.length();i++ )   answer += Character.getNumericValue(str.charAt(i));
        // 다른풀이
        while(n > 0){
            answer+=n%10;
            n = n /10;
        }


        return answer;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        System.out.println(addDigits.solution(123));
    }
}

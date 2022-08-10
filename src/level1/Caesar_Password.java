package level1;

public class Caesar_Password {
    public String solution(String s, int n) {
        String answer = "";

        int alpbatNum = 26;
        for(int i = 0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            int caesarNum = (int)ch != 32 ? (int)ch + n:(int)ch;
            // 대문자Z의 경우
            if(caesarNum > 90 && Character.isUpperCase(ch)){
                caesarNum = caesarNum - alpbatNum;
            }
            // 소문자z인 경우
            else if(caesarNum > 122 && Character.isLowerCase(ch)){
                caesarNum = caesarNum -alpbatNum;
            }
            answer += (char)caesarNum;
        }
        return answer;
    }
    public static void main(String[] args) {
        Caesar_Password caesar_password = new Caesar_Password();
        System.out.println(caesar_password.solution("a B z",4));
    }

}

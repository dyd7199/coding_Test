package level1;

public class IsAllNumber {
    public boolean solution(String s) {
        boolean answer = true;

        if( !(s.length() == 4 || s.length() == 6) ){
            return false;
        }
        for (int i = 0; i < s.length(); i++ ){
            int ascii = (int)s.charAt(i);
            System.out.println(ascii);
            if(!(ascii>=48 && ascii<=57)){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IsAllNumber isAllNumber = new IsAllNumber();
        System.out.println(isAllNumber.solution("1234"));
    }

}

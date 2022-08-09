package level1;

public class SquareDiscrimination {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        num = num - Math.floor(num);
        if(num > 0)
            answer = -1;
        else
            answer = (long) Math.pow((int)Math.sqrt(n), 2);
        return answer;
    }

    public static void main(String[] args) {
        SquareDiscrimination squareDiscrimination = new SquareDiscrimination();

        System.out.println(squareDiscrimination.solution(121));
    }

}

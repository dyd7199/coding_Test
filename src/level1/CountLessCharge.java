package level1;

public class CountLessCharge {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++ ){
            sum += price * i;
        }
        return sum > money ? (sum - money) : 0;
    }

    public static void main(String[] args) {
        CountLessCharge countLessCharge = new CountLessCharge();

        System.out.println(countLessCharge.solution(20,20,4));
    }
}

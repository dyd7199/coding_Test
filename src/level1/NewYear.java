package level1;

import java.util.ArrayList;
import java.util.HashMap;

public class NewYear {

    public String solution(int a, int b) {
        HashMap<Integer,Integer>map = new HashMap<>();

        map.put(1,31);
        map.put(3,31);
        map.put(5,31);
        map.put(7,31);
        map.put(8,31);
        map.put(10,31);
        map.put(12,31);

        map.put(2,29);

        map.put(4,30);
        map.put(6,30);
        map.put(9,30);
        map.put(11,30);

        int totalDate = 0;
        for(int i = 1; i < a; i++){
            totalDate += map.get(i);
        }

        totalDate += b;

        ArrayList<String>list = new ArrayList<>();
        list.add("THU");
        list.add("FRI");
        list.add("SAT");
        list.add("SUN");
        list.add("MON");
        list.add("TUE");
        list.add("WED");

        int index = (totalDate % 7);

        return list.get(index);
    }

    public static void main(String[] args) {

        NewYear newYear = new NewYear();

        System.out.println("newYear = " + newYear.solution(5,24));


    }
}

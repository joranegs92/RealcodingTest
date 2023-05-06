package Java.이전;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TestOrder2 {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] test = new String[numbers.length];

        for(int i = 0; i< numbers.length ; i++){
            test[i] = String.valueOf(numbers[i]);
        }

        //내림차순 정렬
        Arrays.sort(test, new Comparator<>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        for(String t: test) {
            answer += t;
        }

        return answer;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] test= {6, 10, 2};
        System.out.println(solution(test));
    }

}

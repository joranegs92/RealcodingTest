package Java.이전;

import java.util.ArrayList;
import java.util.Arrays;

public class Greedy3 {
    public static String solution(String numbers, int k) {
        StringBuilder st = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<numbers.length() - k; i++) { //st에는 numbers.length- k 개 만큼 담길거기 때문에,
            max = 0; // 두번째 포문이 돌때 max를 초기화 해줘야 한다
            for(int j= index;j<= k+i; j++) { // index는 가장 큰수를 선택한 다음번째수가 셋팅되어야 한다.
                int a = numbers.charAt(j)-'0';
                if(max < a) {
                    max = a;
                    index = j+1;
                }
            }
            st.append(max);
        }
        return st.toString();

        /*
        몇번째인지 알았으니 그 다음것부터 남은 갯수만큼
        * */

    }
    public static void main(String[] args){

        String number="4177252841";
        int k = 4;

        System.out.println(solution(number, k));
    }
}

package samphyo;

import java.util.Arrays;

public class main1 {
    public static double solution(int l, int[] v) {
        double d = 0;
        Arrays.sort(v);
        int max=0;
        int max_arr = 0;
        //가로등 첫번째 위치와 끝 위치가 0,L인지 확인하기
        if(v[0]-0 < l-v[v.length-1]) {
            max = l-v[v.length-1];
            d = max;
            System.out.println("l과의 거리 "+max);
        }
        else {
            max = v[0]-0;
            d = max;
            System.out.println("0과의 거리 "+max);
        }

        //배열 내 최댓값 구하기
        for(int i=0; i<v.length-1; i++){
            if(max_arr<v[i+1]-v[i]){
                max_arr = v[i+1]-v[i];
            }
        }
        //홀수 짝수 구분하기 ->이유 : d는 정수이기 때문에 max_arr이 1.5이면 최솟값은 2이기 때문
        if(max_arr%2==0) {
            max_arr = max_arr/2;
        }
        else {
            max_arr = (max_arr/2)+1;
        }


        //마지막 max값과 max_arr값 구해서 큰것이 최솟값이 된다.
        if(max<max_arr) {
            d = max_arr;
        }
        else
            d = max;

        System.out.print(d);
        return d;
    }


    public static void main(String[] args) throws Exception {


        int l = 10;
        int[] a = {2, 5};

        double result = solution(l, a);

        System.out.println(result);
    }
}

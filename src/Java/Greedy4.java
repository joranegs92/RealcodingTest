package Java;

import java.util.Arrays;

public class Greedy4 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        int start = 0;
        int i;
        Arrays.sort(people); // =>{ 50 50 70 80}

        for(i=people.length-1; start<=i; i--) {// 보트들 중에 한팀이라도 100이 안넘으면 되기때문에, 한번만 탐색. 두세번 더 탐색할 필요가 없음.
            if(people[i] + people[start] > limit)//1)50 이랑 80이랑 더한다 > 100 , 2)70이랑 50이랑 더한다 > 100 ,
                answer ++;
            else { // 3)50이랑 50이랑 더한다
                answer ++;
                start ++;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){

        int[] people = {70, 80, 50};
        int limit = 100;

        System.out.println(solution(people, limit));
    }
}

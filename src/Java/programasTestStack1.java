package Java;

import java.util.Arrays;
import java.util.Stack;

public class programasTestStack1 {

    public static void main(String[] args){
        int[] test1 ={93, 30, 55};
        int[] test2 = {1, 30, 5};

        solution2(test1, test2);
    }

    public static int[] solution2(int[] progresses, int[] speeds){
        Stack<Integer> stack = new Stack<Integer>();
        for(int p :progresses) {
            stack.push(p);
        }

        System.out.println(stack);
        boolean tr = false;
        while(tr){
            int i = 0;
            int day = 0;
            //100이 넘으면 다음 stack으로 넘어간다
            if(progresses[i] >= 100){
                i++;
            }else {
                progresses[i] =+  speeds[i] * day;
            }
            //
            System.out.println(day);

        }
        return null;
    }
    public static int[] solution(int[] progresses, int[] speeds){
        Stack<Integer> stack = new Stack<Integer>();


        //작업 진도를 담을 배열
        int[] dayint = new int[100];
        //배열 두번째 돌때 0으로 잡아놓으면 계산 올바르게 안돌아감
        int day = -1;
        //작업 개수만큼 돌린다
        for(int i =0 ; i< progresses.length; i++){
            // 작업개수 + 작업 하루당 걸리는시간 * 작업 기간
            while (progresses[i] + (day * speeds[i])< 100 ) {
                int a = progresses[i] + (day * speeds[i]);
                //하루 작업이 끝날때마다 돈다.
                day++;
            }
            //작업이 끝나면 담는다.
            dayint[day]++;
        }
        return Arrays.stream(dayint).filter(i -> i!=0).toArray();
    }
    /* public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int[] box = new int[progresses.length];
        int[] box2 = new int[progresses.length];
        int index = 0;
        //얼마나 남았는지는 어떻게 아는가


        for(int i = 0; i < progresses.length; i++){
            box[i] = 100 - progresses[i];
            box2[i] = box[i] / speeds[i];
        }
        // 2번째 단계. 앞에것보다 뒤에것이 크면 넘어가고 뒤에게 더 작으면 더한다.
        int count = 1;

        for(int j = 0; j < progresses.length; j++){
            if(j+1 <progresses.length) {
                if (box[j] < box[j + 1] ) { //앞에것이 뒤에것보다 클때 뒤에게 더 크면 짜르는거지. 뒤에게 더크면 자르는것
                    count++;

                }
            }
        }
        //2보다1이 크면 카운트를 끝내고 다음단계로 가야한다.
        // 두번째가 더 크면 카운트를 시작한다.
        int[] count2 =new int[count];
        int index2 = 0;
        while(index2 == count2.length){
            for(int progrem :progresses) {
                if(progrem)
            }
        }

        return answer;
    }*/
}

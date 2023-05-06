package Java.이전;

import java.util.LinkedList;
import java.util.Queue;

public class programasTestStack3 {
    /*
    * 트럭 여러대가
    * 다리를 건너려면 최소 몇초가 걸리는지 ??
    * 최대 브릿
    * */
    public static void main(String[] args){
        int bridge_length =2; // 다리 길이 그리고 1당 한개의 트럭 입장가능
        int weight = 10; //견딜 수 있는 무게
        int[] truck_weights = {7,4,5,6}; // 트럭 무게 배열

       System.out.println(solution(bridge_length, weight, truck_weights));

    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {

        int answer = 0;
        int totalWeight = 0;
        // int truckin =0;
        int i =0; //넘어간 트럭 총 갯수
        Queue<Integer> q = new LinkedList<>();

        while(i < truck_weights.length){//트럭이 다 돌때까지

            /*1. 무조건 넣는경우*/
            if(q.size() == 0){
                q.add(truck_weights[i]);
                totalWeight += truck_weights[i]; //토탈무게 계산
                //truckin++; // 다리에 오른 트럭이 한대 늘었음
                i++; // 적재된 트럭도 한대 늘음
                answer++;
            /*2. 무조건 빼는경우*/
            }else if(q.size() == bridge_length){// 여기는 , 적재된 트럭으 수가 초과된 경우에 빼준다
                totalWeight -= q.poll();
            }else { /*조건에 맞춰 넣는경우*/
                if(weight >= totalWeight + truck_weights[i]){ // 견딜수있는 무게수가 지금까지 적재된 트럭의 무게와 앞으로 들어갈 무게보다 큰 경우에
                    q.add(truck_weights[i]);
                    totalWeight += truck_weights[i];
                    i++;
                    answer++;
                }else{
                    q.add(0);
                    answer++;
                }

            }
        }
        return answer+ bridge_length;
    }
    //여기는 이전거
  /*  public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; //걸리는 시간
        int sequence = 0; //truck _ weights의 몇번째인지
        int totalWeight = 0;//지금 다리에 올라가있는 트럭들으 무게

        Queue<Integer> q = new LinkedList<>();
        while (sequence != truck_weights.length){ //트럭 다 태운 경우
            if(q.size() == 0){ // 다리에 트럭이 하나도 없는 경우
                q.add(truck_weights[sequence]); // 적재한다.
                totalWeight += truck_weights[sequence];// 지금 다리에 올라가있는 트럭들으 무게
                sequence++; // 트럭 다음걸로!
                answer++;

            }else if(q.size() < truck_weights.length){//트럭 태울수 있는 여유분이 있는 경우
                if(totalWeight+truck_weights[sequence] <= weight){//적재할 트럭무게들이 다리가 견딜 수 있는 무게보다 적은 경우
                    q.add(truck_weights[sequence]);
                    totalWeight += truck_weights[sequence];
                    sequence++;
                    answer++;
                }else{//적재가능 무게보다 더 나갈경우
                    totalWeight -= q.peek();
                    q.poll();
                    answer++;
                }
            }else{ //트럭 태울수 있는 여유분ㅇ 없는 경우
                totalWeight += truck_weights[sequence];
                q.poll();
                answer++;
            }

            *//*(totalWeight+truck_weights[sequence] <= weight){ //적재할 트럭무게합쳐서 다리가 견딜수 있는 무게보다 적을 경우
                q.add(truck_weights[sequence]);
                sequence++;
                answer++;
            }else if(totalWeight+truck_weights[sequence] > weight){//적재가능한 무게보다 더 나갈경우
                //시간은 흐르고
                answer++;
                //입장가능한 길이보다 입
            }*//*

        }
        return answer+bridge_length;
    }*/

/*    public static int solution(int bridge_length, int weight, int[] truck_weights) {
            int answer = 0;

            //현재 다리위에 있는 트럭의 무게
            int carWeight = 0;
            Queue<Integer> q =new LinkedList<>();

            for(int i = 0; i< truck_weights.length; i++ ){
                //트럭이 다 건너면 게임 끝
                while(i < truck_weights.length){
                    //다리위에 있는 트럭 무게 총합
                    if(carWeight + truck_weights[i] > weight){
                        answer++;
                    }
                    //q 가 다 차면 q에서 뺀다. 선입선출


                    // 트럭 지나갈수 있는것 .(총 무게가 다리 건널수 있는 차량의 무게보다 작거나, q가 비어있을 때 )
                    if(carWeight + truck_weights[i] <= weight || q.isEmpty()){
                        q.add(truck_weights[i]);
                        carWeight += truck_weights[i];
                        answer++;
                        i++;
                    }
                }
            }
            return answer;

    }*/
}

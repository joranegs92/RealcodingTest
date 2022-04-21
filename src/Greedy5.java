import java.util.Arrays;
import java.util.Comparator;

public class Greedy5 {
    public static int solution(int[][] routes) {
        int answer = 0;
        int camera = -30000; // 카메라는 진입지점부터 설치해서 차차 설치하는 방향으로다가..
        /*
        일단 오름차순부터..
        * */
        Arrays.sort(routes,((o1, o2) -> Integer.compare(o1[1], o2[1])));
        //얘내가지고 음ㅇ마러 ㅁ아ㅣ러
        /*카메라를 1번차량 출입지점에 달고
        * a[0] => 진입지점
        * a[1] => 진출지점
        * 진출지점들이 겹친다. 예아 예아
        * */
        for( int[] a: routes){
            System.out.println(Arrays.toString(a));
            if(a[0]>camera){ // 진입지점보다 카메라가 적으면 -> 카메라를 진출지점에 .
                camera = a[1];
                System.out.println(camera);
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        int[][] routes ={{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
        solution(routes);
    }
}

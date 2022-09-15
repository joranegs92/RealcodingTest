package Java;

public class programasTestStack4 {

    /*
     * 트럭 여러대가
     * 다리를 건너려면 최소 몇초가 걸리는지 ??
     * 최대 브릿
     * */
    public static void main(String[] args) {

        int[] price = {1, 2, 3, 2, 3};
        System.out.println(solution(price));

    }

    public static int[] solution(int[] price) {
        int[] test = new int[price.length];
        int j = 0;
        for (int p : price) {
            int answer = -1;

            int t = 0;
            for (int i = j; i < price.length; i++) {
                if (p <= price[i]) { //현재가격보다 다음가격ㅇ ㅣ 크면
                    answer++;
                }
                test[j] = answer;
            }
            j++;
        }
        return test;

    }
}

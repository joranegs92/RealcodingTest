public class kakak2020 {

        public static String solution(int[] numbers, String hand) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            for(int number : numbers){
                if(number%3 == 1){
                    sb.append("L");
                }else if(number%3 == 0){
                    sb.append("R");
                }
            }
            System.out.println(sb);
            return answer;
        }
     public static void main(String[] args){
            int[] num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
            String hand = "right";

     }

}

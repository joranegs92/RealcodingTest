package Java.이전;

public class kakak2020 {

        public static String solution(int[] numbers, String hand) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            int right = 0;
            int left = 0;

            for(int number : numbers){
                if(number%3 == 1){
                    sb.append("L");
                    left = number;
                }else if(number%3 == 0){
                    sb.append("R");
                    right =number;
                }else{
                    if(Math.abs(number-left) > Math.abs(number-right)){
                        sb.append("R");
                        right =number;
                    }else if(Math.abs(number-left) < Math.abs(number-right)){
                        sb.append("L");
                        left = number;

                    }else {
                        if(hand =="right"){
                            sb.append("R");
                            right =number;
                        }else {
                            sb.append("L");
                            left = number;
                        }
                    }
                }
            }
            System.out.println(sb);
            return answer;
        }
     public static void main(String[] args){
            int[] num = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
            String hand = "right";
            solution(num,hand);

     }

}

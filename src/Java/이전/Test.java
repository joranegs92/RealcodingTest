package Java.이전;

import java.util.Arrays;

public class Test {
    public static String solution(String numbers,int k ) {
        String answer = "";
        int max = 0;
        //아예 없애기
        int index = 0;
        //return이 k개만큼 되어야한다.
        StringBuilder st =new StringBuilder();
        for(int i= 0; i< numbers.length()-k ;i++){//가장 큰 수 찾기
            int a =  numbers.charAt(i)-'0';
            if(a > max){
                max = a;
                index = i;//몇번쨰인지 알기 위해서
            }
        }
        System.out.println("max"+max);
       // System.out.println("ind';lex);
        st.append(max);
        System.out.println("st"+st);

    //가장큰수 이후부터 제일큰수 찾아서 담기
        int index2 = 0;
        for(int z= index ; z < numbers.length(); z = index) {
            int max2 = 0;
            index2= 0;
            for(int j = 1; j < k; j++) {// k개씩 잘라서 검사할거임
                if(index+j >= numbers.length()){
                break;
                 }
            int a = numbers.charAt(index + j) - '0';//max다음 수부터 max를 또 정할거임
             if(a > max2) {
                max2 = a;
                index2 = j;
                }
        }
        if(st.length() >= numbers.length()-k){
            break;
        }
        st.append(max2);
        index += index2;
             System.out.println("max2="+max2);
        }
             answer = st.toString();

             System.out.println("answer"+answer);
            return answer;
        }
        public static void main(String[] args) {
        //TODO Auto-generated method stub
                String number = "4177252841";
                int k= 4;
                solution(number, k );
                }
        }

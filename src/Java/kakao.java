package Java;

import java.util.*;

public class kakao {

    public static int solution(int n, int k) {
        int answer = 0;
        int another = 0;// 나누기할거
        StringBuilder sb = new StringBuilder();

        /*진법만들기부터 시작 n이 숫자고 이고 k가진법임 */
        /*10진법일땐 넘어가고*/
        if(k == 10){

        }else{
            /*진법구하기 */
            another = n;
            while (true){
                int na = 0; //나머지
                if(another > k){
                    na = another % k ;
                    another =  another / k;
                    // System.out.println(na);
                    sb.append(na);
                }else {
                    sb.append(another);
                    sb.reverse();
                    break;

                }
            }
        }
        System.out.println("asdf"+sb);
/*2. 0이 나오면 끊어서 list에 담는다 */
        StringBuilder two = new StringBuilder();
        List test = new ArrayList<>();
        //    0이 나올때 그 앞에서 자르기. 각자 담기
        for(int i =0; i< sb.length(); i++){
            System.out.println(sb.charAt(i));
            if(sb.charAt(i) != '0'){
                if(i == sb.length()-1){
                    two.append(sb.charAt(i));
                    test.add(two);
                }else{
                    two.append(sb.charAt(i));
                }
            }else if(sb.charAt(i) == '0' || i-1 == sb.length()){
                //배열에 넣기
                String test2 = two.toString();
                test.add(test2);
                two.delete(0,i);
            }
        }
        /*3. list에 담긴것들마다 소수인지 구하기*/

        for(Object t: test){
            Long tt = Long.parseLong(String.valueOf(t));

            System.out.println(test3(tt));
            if(  test3(tt)){
                answer++;
            }
        }

        System.out.println(test);

        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        int n = 437674;
        int k = 3;
        solution(n , k);
    }

    private static boolean test3(Long n){
        //long n = Long.parseLong(num);
        if(n <= 1) return false;
        else if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;


        return true;
    }
}

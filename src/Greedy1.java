import java.util.*;

public class Greedy1 {
    public static String solution(String number, int k) {
        StringBuilder st = new StringBuilder();
        String answer ;
        int index =0;
        System.out.println(number.length());
        for(int i = 0 ;i < number.length()-k;i++){
            System.out.println("i="+i);
            for(int j = index; j<number.length();j++){
                index = j+1;
                System.out.println("j="+j);
            }

        }
       // System.out.println(st);
        return null;
    }
    //1 /23 1/ 34 1 /45 1/56

    public static void main(String[] args){
        String number = "4177252841";
        int k = 4;

        System.out.println(solution(number,k));

    }

}

package Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class kakao2022 {
    public static String solution(String new_id) {
        String answer = "";
        //1.대문자를 소문자로 치환

        //2. 소문자, 숫자, - , _ , .를 제외한 모든문자 제외
        //3. .. -> .
        //4. 마침표가 첫번째나 마지막이었다면 지운다
        //5. 빈문자열이면 a
        //6. 길이가 16자 이상이면 15자이상은 지운다
        //7.2자 이하면 마지막글자를 붙인다.
        return answer;
    }
    public static void main(String[] args){
        String new_id = "...!@BaT#*..y.abcdefghijklm";

        solution(new_id);
       // System.out.println( solution(id_list,report,k));

    }
}

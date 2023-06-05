package Java.해쉬;

import java.util.HashMap;

public class Hash3 {
    public static int solution(String[][] clothes) {
        int answer = 0;

        return answer;
    }
    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 값 저장
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);
        hashMap.put("orange", 7);

        // 값 검색
        int count = hashMap.get("apple");
        System.out.println(hashMap.hashCode());
        System.out.println("apple의 개수: " + count);  // 출력: apple의 개수: 5
    }
}

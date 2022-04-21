public class Greedy2 {

    public static int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index;
        int move = length - 1;

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i)- 'A');
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

        }
        return answer + move;
    }
    public static void main(String[] args){

        solution("ABCDE");
      //  System.out.println("A".charAt(1));
    }
}

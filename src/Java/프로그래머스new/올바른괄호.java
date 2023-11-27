package Java.프로그래머스new;

import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		String s = "())(())";
		Stack<Character> stack = new Stack<>();
		boolean answer = false;
		if(stack.push(s.charAt(0)) == ')'){
			return;
		};

		for(int i =0;i<s.length();i++){
			if(s.charAt(i) == '('){
				stack.push('(');
			}else {
				if(stack.isEmpty()){
					return;
				}
				stack.pop();
			}
		}


	/*
	*  프로그래머스에 넣은 코드
	* import java.util.Stack;
class Solution {
    boolean solution(String s) {
	 	Stack<String> stack = new Stack<>();
        boolean answer = false;
       if(String.valueOf(s.charAt(0)).equals(")")){
			return answer;
		}
        for(int i=0; i<s.length();i++){
			String a = String.valueOf(s.charAt(i));
			if(a.equals("(")){
				stack.push("(");
			}else if(stack.contains("(") && a.equals(")")){
				stack.pop();
			}
		}
		if(stack.isEmpty()){
			answer =true;
		}
        return answer;
    }
}
	* */



	//얘도 시간초과..
/*
	public static void main(String[] args) {
		String s = "())(())";
		Stack<String> stack = new Stack<>();
		boolean answer = false;
		if(String.valueOf(s.charAt(0)).equals(")")){
			System.out.println(answer);
			return;
		}
		for(int i=0; i<s.length();i++){
			String a = String.valueOf(s.charAt(i));
			if(a.equals("(")){
				stack.push("(");
			}else if(stack.contains("(") && a.equals(")")){
				stack.pop();
			}
		}
		if(stack.isEmpty()){
			answer =true;
		}
		System.out.println(answer);*/

		/////// 테스트케이스에서 걸린 사례
		/*String s = "())(())";
		int one = 0;
		int two = 0;
		boolean answer = false;
		if(String.valueOf(s.charAt(0)).equals(")")){
			System.out.println(answer);
			return;
		}
		Stack<String> stack = new Stack<>();
		for(int i=0; i<s.length();i++){
			String a = String.valueOf(s.charAt(i));
			if(a.equals("(")){
				one ++;
			}else{
				two ++;
			}
		}
		if(one == two){
			answer= true;
		}
		System.out.println(answer);*/
	}
}

package Java.스택큐;

import java.util.Stack;

public class 올바른괄호 {
	public static boolean solution(String s) {
		boolean answer = true;

		Stack<String> stack = new Stack<>();
		for(int i =0 ; i< s.length();i++) {
			stack.push(s.substring(i,i+1));

		}
		System.out.println(stack);
		String test = stack.pop();

		System.out.println(test);
		return answer;
	}
	public static void main(String[] args){
		String s = "(((()";
		solution(s);
	}
}

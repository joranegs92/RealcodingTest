package Java.스택큐;

import java.util.Stack;

public class 올바른괄호 {
	public static boolean solution(String s) {
		boolean answer = true;

		Stack<String> stack = new Stack<>();
		for(int i =0 ; i< s.length();i++) {
			if(s.charAt(i)=='('){
				stack.push("(");
			}
			else if(s.charAt(i) == ')'){
				if(stack.isEmpty()){
					return false;
				}else {
					stack.pop();
				}
			}

			System.out.println(stack);
		}

		return stack.isEmpty();
	}
	public static void main(String[] args){
		String s = "(())()";
		solution(s);
	}
}

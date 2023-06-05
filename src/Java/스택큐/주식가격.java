package Java.스택큐;

public class 주식가격 {
	public static int[] solution(int[] prices) {
		int[] answer = {};
		answer = new int[prices.length];
		int count =0 ;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				count++;
				if(prices[i] > prices[j]) {
					break;
				}


			}
			answer[i]=count;
			count = 0;
		}

		return answer;
	}
	public static void main(String[] args){
		int[] s ={1, 2, 3, 2, 3};
	주식가격.solution(s);
	}
}

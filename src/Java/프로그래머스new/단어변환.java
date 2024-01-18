package Java.프로그래머스new;


import java.util.LinkedList;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/43163
public class 단어변환 {
	static int[] visited;
	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = {"hot","dot","dog","lot","log","cog"};
		bfs(begin,target,words);
	}
	public static int solution(String begin, String target, String[] words) {
		int answer = 0;


		return answer;
	}
	public static int bfs(String begin, String target, String[] words){

		int count = 0;//변환횟수
		visited = new int[words.length];
		Queue<String> queue = new LinkedList<>();
		queue.add(begin);
		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int a=0;a<size;a++){
				String now = queue.poll();

				if (now.equals(target)){
					return count;
				}
				for (int i = 0; i < words.length; i++) {
					if (chech(now, words[i]) && visited[i] == 0) {
						visited[i] = 1;
						queue.add(words[i]);
					}
				}
			}
			count++;
		}
		return 0; // 변환할 수 없는 경우
	}
	public static boolean chech(String begin, String target){
		int diff = 0;
		for (int i = 0; i < begin.length(); i++) {
			if (begin.charAt(i) != target.charAt(i)) {
				diff++;
			}
		}
		return diff == 1; // 한 글자만 다른 경우 true 반환
	}
	public static void dfs(String begin){


	}
}

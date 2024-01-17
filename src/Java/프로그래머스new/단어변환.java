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
	public static void bfs(String begin, String target, String[] words){
		String now = "";//현재 단어
		int count = 0;//변환횟수
		visited = new int[words.length];
		Queue<String> queue = new LinkedList<>();
		queue.add(begin);
		while (!queue.isEmpty()) {
			now = queue.poll();

			for (int i=0; i<words.length; i++){
				for(int j=0;j<words[i].length();j++){
					if (now.charAt(j)==words[i].charAt(j)&&visited[i]==0){
						visited[i]=1;

						queue.add(words[i]);
						j=0;
						break;
					}


				}
				//같은글자가 없으면
				System.out.println(words[i]+"="+queue.contains(words[i]));
				if(chech(now,words[i])&&queue.contains(words[i])){
					System.out.println(chech(now,words[i]));
					queue.remove(words[i]);
				}
			}
			count++;
			if (now.equals(target)){
				break;
			}
		}
	}
	public static boolean chech(String begin, String target){
		for(int i=0;i<begin.length();i++){
			if (begin.charAt(i)==target.charAt(i)){
				//같은 글자가 잇음
				return false;
			}
		}
		return true;
	}
	public static void dfs(String begin){


	}
}

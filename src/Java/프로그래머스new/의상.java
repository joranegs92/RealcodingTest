package Java.프로그래머스new;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 의상 {
	/**
	 * 경우의 수 사용한 문제
	 * 종류별로 [안입은 경우, 첫번째 의상, 두번쨰 의상 ...]* [안입은 경우, 첫번째 의상, 두번쨰 의상 ...] - 모든 종류 하나도 안입은경우 = 결과
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] cloths = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

		//Map<String , List<String[]>> c = Arrays.stream(cloths).collect(Collectors.groupingBy(item -> item[1]));
		Map<String ,Integer> c = new HashMap<>();


		for(String[] cloth : cloths){
			String type = cloth[1];
			c.put(type,c.getOrDefault(type, 0)+1);
		}

		int answer =1;

		for(int count:c.values()){
			answer *= (count+1);
		}


	}
}

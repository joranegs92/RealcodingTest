package 스택.큐;

import Java.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {

    public int[] solution(int[] a, int[] b) {
        int[] c = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int z = 0;
        for(int i= 0; i< a.length; i++){
            for(int j = z; j< b.length; j++){
                if(a[i] == b[j]){
                    z++;
                    arrList.add(a[i]);
                    System.out.println(a[i]);
                }
            }
        }
        c = new int[arrList.size()];
        for(int i =0; i < arrList.size(); i++){
            c[i] = arrList.get(i);
        }
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) throws Exception {
        같은숫자는싫어 main = new 같은숫자는싫어();
        int[] a = {1,2,2,3,3,3};
        int[] b = {2,3,3,4,5};
        int[] result = main.solution(a,b);

        System.out.println(Arrays.toString(result));
    }
}

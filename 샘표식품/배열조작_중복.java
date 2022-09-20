package Java;
/*
* */
public class 배열조작_중복 {

    ppublic int[] solution(int[] a, int[] b) {
        int[] c = {};
        int z = 0;
        for(int i= 0; i< a.length; i++){
            for(int j = z; j< b.length; j++){
                if(a[i] == b[j]){
                    z++;

                    System.out.println(a[i]);
                }
            }
        }
        return c;
    }
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        int[] a = {1,2,2,3,3,3};
        int[] b = {2,3,3,4,5};
        int[] result = main.solution(a,b);

        System.out.println(Arrays.toString(result));
    }
}

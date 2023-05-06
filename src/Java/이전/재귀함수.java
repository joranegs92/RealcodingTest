package Java.이전;

public class 재귀함수 {
	static int a =0;
	public static void main(String[] args){
		DNS();
	}
	public static void DNS(){
		for(int i =0; i<= 2;i++){
			System.out.println("처음");
			if(a <=2 ){
				a++;
				DNS();
			}
			a =0;
			System.out.println("언제오냐");
		}
	}
}

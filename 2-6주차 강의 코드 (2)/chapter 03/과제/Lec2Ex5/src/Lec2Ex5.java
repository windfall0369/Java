import java.util.Scanner;

public class Lec2Ex5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("Number of cycle:");
		num = input.nextInt();
		
		double pi = 0;
		double a = 1;
		
		for(int i =1; i<num+1; i++) {
			pi+=4/a;
			if(a<0){
				a-=2;
			}
			else{
				a+=2;
			}
			a=-a;
		}
		System.out.println(num+"번 반복한 Gregory-Leibniz 무한수열의 PI 값은 "+pi+" 입니다.");
		System.out.print("여러번 반복할 수록 3.141592....에 수렴합니다.");
	}

}

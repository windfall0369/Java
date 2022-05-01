import java.util.Scanner;
public class Lec2Ex5 {

	public static void main(String[] args) {
		int i;
		double pi=0;
		double bunmo=1;
		double buho=1;
		System.out.print("반복 횟수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(i=1; i<=num; i++) {
			pi=pi+(1/bunmo)*buho;
			bunmo=bunmo+2;
			buho=buho*-1;
		}
		System.out.println(4*pi);
	}

}

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
		System.out.println(num+"�� �ݺ��� Gregory-Leibniz ���Ѽ����� PI ���� "+pi+" �Դϴ�.");
		System.out.print("������ �ݺ��� ���� 3.141592....�� �����մϴ�.");
	}

}

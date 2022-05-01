import java.util.Scanner; 
public class Lec2Ex1 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 2개를 입력하세요:"); 
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		
		if (a>b)
			System.out.print("A가 B보다 큽니다.");
		
		else if (b>a)
			System.out.print("B가 A보다 큽니다.");
		
		else
			System.out.print("A와 B는 같습니다.");
	}
}

import java.util.Scanner; 
public class Lec2Ex1 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("���� 2���� �Է��ϼ���:"); 
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		
		if (a>b)
			System.out.print("A�� B���� Ů�ϴ�.");
		
		else if (b>a)
			System.out.print("B�� A���� Ů�ϴ�.");
		
		else
			System.out.print("A�� B�� �����ϴ�.");
	}
}

import java.util.Scanner;

public class CheckInput {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month = input.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " + month);
	}
}
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean result;
		int year;
		
		System.out.print("�⵵�� �Է��Ͻÿ�. : ");
		year = input.nextInt();
		result = ((year % 4) == 0);
		System.out.println("�Է��Ͻ�"+year+"���� ���� ���δ� : "+result);
	}
}
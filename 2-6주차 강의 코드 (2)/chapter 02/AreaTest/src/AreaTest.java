import java.util.Scanner;
public class AreaTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		
		System.out.print("�������� �Է��Ͻÿ�. : ");
		radius = input.nextDouble();
		
		double PI = 3.141592;
		double area = (radius*radius*PI);
		System.out.println("��������" +radius+ "�� ���� ������" + area + "�Դϴ�.");
	}
}
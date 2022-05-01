import java.util.Scanner;
public class QuadraticEq {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double b;
		double c;
		System.out.print("b값을 입력하세요. : ");
		b = input.nextDouble();
		System.out.print("c값을 입력하세요. : ");
		c = input.nextDouble();
		double result1 = (-b+(Math.sqrt((b*b)-(4*c))))/2; 
		double result2 = (-b-(Math.sqrt((b*b)-(4*c))))/2;
		
		boolean positive;
		double result3 = ((b*b)-(4*c));
		positive = result3 > 0;
		System.out.println("첫 번째 근은"+result1+"두 번째 근은"+result2+"입니다. 그리고 이 근이 두 근을 가지는지의 여부는"+positive+"입니다.");
	}
}
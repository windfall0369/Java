import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean result;
		int year;
		
		System.out.print("년도를 입력하시오. : ");
		year = input.nextInt();
		result = ((year % 4) == 0);
		System.out.println("입력하신"+year+"년의 윤년 여부는 : "+result);
	}
}
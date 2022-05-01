import java.util.Scanner;

public class Lec2Ex7 {
	public static void main(String[] args)  {
	int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
	int value, index = -1;
	int upper = 99999;
	int lower = -999999;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("탐색할 값을 입력하시오: ");
	value = scan.nextInt();
	
	for ( int i = 0; i < s.length; i++) {
		if (s[i] > value && s[i] < upper)
			upper = s[i];
		
		else if(s[i] < value && s[i] > lower)
			lower = s[i];
		
	}
	System.out.println(value + "은 " + lower + "보다 크고 "+ upper + "보다 작습니다.");
}




}

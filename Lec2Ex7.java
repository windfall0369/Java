import java.util.Scanner;

public class Lec2Ex7 {
	public static void main(String[] args)  {
	int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
	int value, index = -1;
	int upper = 99999;
	int lower = -999999;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Ž���� ���� �Է��Ͻÿ�: ");
	value = scan.nextInt();
	
	for ( int i = 0; i < s.length; i++) {
		if (s[i] > value && s[i] < upper)
			upper = s[i];
		
		else if(s[i] < value && s[i] > lower)
			lower = s[i];
		
	}
	System.out.println(value + "�� " + lower + "���� ũ�� "+ upper + "���� �۽��ϴ�.");
}




}

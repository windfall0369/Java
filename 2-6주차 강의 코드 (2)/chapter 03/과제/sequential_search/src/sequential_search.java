import java.util.Scanner;

public class sequential_search {
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		int s[] = {0,11,18,29,35,49,62,68,73,88,100};
		int Search_Num;
		System.out.print("Write the Search Number : ");
		Search_Num = input.nextInt();
		
		for(int i=0; i<s.length; i++) {
			if(Search_Num == s[0]) {
				System.out.print(Search_Num+"�� "+s[i+1]+"���� �۽��ϴ�.");
				break;
			}
			if(Search_Num == s[i])
				System.out.print(Search_Num+"�� "+s[i-1]+"���� ũ�� "+s[i+1]+"���� �۽��ϴ�.");
			
		}
	}

}

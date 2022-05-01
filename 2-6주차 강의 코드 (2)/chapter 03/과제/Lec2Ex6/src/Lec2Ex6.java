import java.util.Scanner;

public class Lec2Ex6 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int s[] = {12,3,19,6,18,8,12,4,1,19};
		
		int mini = s[0];
		
		for(int i=1; i<s.length; i++)
			if(mini>s[i])
				mini = s[i];

		System.out.print("Minimum : "+mini);
	}
}

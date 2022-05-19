
public class ArrayTest3 {

	public static void main(String[] args) {
		int[] s = new int[20];
		
		s[0]=1;
		s[1]=1;
		System.out.print(s[0]+" ");
		System.out.print(s[1]+" ");
		for(int i=2; i<s.length; i++) {
			s[i]=s[i-2]+s[i-1];
			System.out.print(s[i]+ " ");
		}
			
	}

}

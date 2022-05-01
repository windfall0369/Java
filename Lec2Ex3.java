
public class Lec2Ex3 {

	public static void main(String[] args) {
	int num,count,i;
	for(num=2 ; num<=100; num++) {
		count=0;
		for(i=2 ; i<num; i++)
			if(num%i==0)
				
				count+=1;
		if(count==0)
			System.out.println(num+"는 소수입니다");
	}

	}

}

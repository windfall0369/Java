class A {
	private int a; 	// ���� 
	int b; 			// ����Ʈ 
	public int c; 		// ���� 
}

public class Test {
	public static void main(String args[]) {

		A obj = new A();	// ��ü ����

		//obj.a = 10;		// ���� ����� �ٸ� Ŭ���������� ���� �� ��
		obj.b = 20;		// ����Ʈ ����� ������ �� ����
		obj.c = 30;		// ���� ����� ������ �� ����
	}
}
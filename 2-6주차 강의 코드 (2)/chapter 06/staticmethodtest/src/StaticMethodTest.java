interface MyInterface {
	static void print(String msg) {
		System.out.println(msg + ": �������̽��� ���� �޼ҵ� ȣ��");
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		MyInterface.print("Java 8");
	}
}
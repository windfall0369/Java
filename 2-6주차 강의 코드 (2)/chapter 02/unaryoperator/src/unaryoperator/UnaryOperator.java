package unaryoperator;
public class UnaryOperator {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;

		int nextx = ++x; // x�� ���� ���Ǳ� ���� �����ȴ�. nextx�� 2�� �ȴ�.
		int nexty = y++; // y�� ���� ���� �Ŀ� �����ȴ�. nexty�� 1�� �ȴ�.
		System.out.println(nextx);
		System.out.println(nexty);
	}
}
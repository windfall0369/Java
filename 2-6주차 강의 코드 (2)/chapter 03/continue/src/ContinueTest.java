public class ContinueTest {
	public static void main(String[] args) {

		String s = "no news is good news";
		int n = 0;

		for (int i = 0; i < s.length(); i++) {
			// n �� ������ ȸ���� ����.
			if (s.charAt(i) != 'n')
				continue;

			// n �� ������ �ϳ� �����Ѵ�.
			n++;
		}
		System.out.println("���忡�� �߰ߵ� n�� ���� " + n);
	}
}
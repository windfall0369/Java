public class Television {

	private int channel; // ä�� ��ȣ
	private int volume; // ����
	private boolean onOff; // ���� ����

	Television(int c, int v, boolean o) {
		channel = c;
		volume = v;
		onOff = o;
	}

	void print() {
		System.out.println("ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�.");
	}
}
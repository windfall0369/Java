public class TelevisionTest {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel();
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
	}
}
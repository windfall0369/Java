public class Television implements RemoteControl {
	boolean onOff = false;
	public void turnOn() {
		// TV�� ������ �ѱ� ���� �ڵ尡 ����.
		onOff = true;
	}

	public void turnOff() {
		// TV�� ������ ���� ���� �ڵ尡 ����.
		onOff = false;
	}
}
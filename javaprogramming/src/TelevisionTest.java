
public class TelevisionTest {

	public static void main(String[] args) {
	Television myTv = new Television(7,10, true);

	myTv.print();
	myTv.setChannel(11);
	int ch = myTv.getChannel();
	System.out.println("���� ä����"+ ch + "�Դϴ�");
	
	Television yourTv = new Television(1,2,true);
	
	yourTv.print();
	}

}

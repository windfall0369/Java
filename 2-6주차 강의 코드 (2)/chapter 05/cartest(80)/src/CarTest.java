public class CarTest {
	public static void main(String[] args) {

		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		if (firstCar.equals(secondCar)) {
			System.out.println("������ ������ �ڵ����Դϴ�.");
		} else {
			System.out.println("������ ������ �ڵ����� �ƴմϴ�.");
		}
	}
}
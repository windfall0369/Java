public class Car {
    
   private String model;
       private String color;
       private int speed;

        // �ڵ����� �ø��� ��ȣ
       private int id;
        // ��üȭ�� Car ��ü�� ������ ���� ���� ����
       private static int numbers = 0;
 
       public Car(String m, String c, int s) {
             model = m;
             color = c;
             speed = s;
              // �ڵ����� ������ �����ϰ� id�� �����Ѵ�. 
             id = ++numbers;
       }
      

	// ���� �޼ҵ� 
       public static int getNumberOfCars() {
             return numbers; // OK!
       }
}
public class Cat extends Animal {
    public static void eat() {
        System.out.println("Cat�� ���� �޼ҵ� eat()");
    }
    public void sound() {
        System.out.println("Cat�� �ν��Ͻ� �޼ҵ� sound()");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.eat();
        myAnimal.sound();
    }
}
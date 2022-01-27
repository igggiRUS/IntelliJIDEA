package lesson04;
public class Car {

    // в теле конструктора метод
    Car(String cvet, String motor);
    {
        color = cvet;
        engine = motor;
        System.out.println("цвет: " + color + " двигатель: " + engine);
    }
    String color;
    String engine;
}

class CarTest05 {
    public static void main(String[] args) {
        Car car1 =new Car("black", "v6");
    }
}
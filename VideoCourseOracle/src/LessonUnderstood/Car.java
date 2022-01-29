package LessonUnderstood;

public class Car {

  String color;
  String engine;
  int speed;

  int gaz(int scorost) {
    speed += scorost;
    return speed;
  }

  int tormoz(int scorost) {
    speed -= scorost;
    return speed;
  }

  // void пустота вывод на экран это не оутпут
  void showInfo() {
    System.out.println("cvet: " + color + " motor: " + engine + " scorost: " + speed);
  }
}

class CarSpeed {

  public static void main(String[] agrs) {
    Car c1;
    c1 = new Car();
    c1.color = "wite";
    c1.engine = "v6";
    c1.speed = 60;
    c1.showInfo(); //вывод войд пустоты
    c1.gaz(20);
    c1.showInfo(); //вывод войд пустоты
    c1.tormoz(40);
    c1.showInfo(); //вывод войд пустоты
  }
}

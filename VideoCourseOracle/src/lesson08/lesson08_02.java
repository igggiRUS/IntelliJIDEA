package Lesson08;

public class Lesson08_02 {

  // инстанс переменные пренадлежат всему объекту
  String color;
  String engine;
  static int count;

  Lesson08_02(String color2, String engine2) {
    count++;
    color = color2;
    engine = engine2;
  }

  public void setColor() {
    System.out.println("color");
  }

  public void changeColor(String color3) {
    System.out.println("цвет изменился");
    int cena = 5000;
    color = color3;
    cena += 1000;
  }
}


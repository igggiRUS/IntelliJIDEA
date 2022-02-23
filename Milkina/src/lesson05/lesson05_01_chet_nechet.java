package Lesson05;

public class Lesson05_01_chet_nechet {

  public static void main(String[] args) {
String y = "33";
    int x = Integer.parseInt(y);
    System.out.println("вы ввели строку преобразованную в число: " + x);
     if (x % 2 == 0) {
       System.out.println("Число четное: " + x);
       } else {
       System.out.println("Число не четное: " + x);
     }
  }
}


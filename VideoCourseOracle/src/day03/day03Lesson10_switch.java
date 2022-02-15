package day03;

import java.util.Scanner;

public class day03Lesson10_switch {
  // импортировал класс сканер
  // аналог оператора if
  // конструтор объекта сканер  который вносит данные с консоли во входной поток
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("введи возраст");
    int age = scanner.nextInt();
    switch(age) {
    case  0:
        System.out.println("ты родился");
    break;
    case 18:
        System.out.println("Уже можно");
    break;
    case 35:
        System.out.println("Еще можно");
    break;
    case 80:
        System.out.println("Приехали");
    break;
      default :
    }
  }
}


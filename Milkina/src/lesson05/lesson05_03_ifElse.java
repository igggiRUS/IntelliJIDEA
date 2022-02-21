package lesson05;

import java.util.Scanner;

public class lesson05_03_ifElse {

  public static void main(String[] args) {
    System.out.println("Введите цифру от 1 до 7");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      int d = scanner.nextInt();
      weekMethod(d);
    }
    System.out.println("Программа завершена");
  }

  private static void weekMethod(int d) {
    if (d == 1) {
      System.out.println("Понедельник");
    } else if (d == 2) {
      System.out.println("Вторник");
    } else if (d == 3) {
      System.out.println("Среда");
    } else if (d == 4) {
      System.out.println("Четверг");
    } else if (d == 5) {
      System.out.println("Пятница");
    } else if (d == 6) {
      System.out.println("Субботта");
    } else if (d == 7) {
      System.out.println("Восскресенье");
    } else {
      System.out.println("Значение неверно");
    }
  }
}


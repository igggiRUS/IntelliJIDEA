package lesson05;

import java.util.Scanner;

public class lesson05_02_milkin {

  public static void main(String[] args) {
    System.out.println("Введите число");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      int x = scanner.nextInt();
      compareNumber(x);
    } else {
      System.out.println("Значение неверно");
    }
  }

  private static void compareNumber(int x) {
    if (x > 0 & x <= 10) {
      System.out.println("Положительное число меньше или равно 10");
    } else {
      System.out.println("Выходит за рамки от 0 до 10");
    }
  }
}


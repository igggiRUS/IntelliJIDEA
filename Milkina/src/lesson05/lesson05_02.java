package Lesson05;

import java.util.Scanner;

public class Lesson05_02 {

  public static void main(String[] args) {
    System.out.println("Введите число");
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if (x > 0 & x <= 10) {
      System.out.println("Положительное число меньше или равно 10");
    } else {
      System.out.println("Выходит за рамки от 0 до 10");
    }
  }
}

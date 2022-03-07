
package Lesson05;

import java.util.Scanner;

public class Lesson05_04_doWhileIn {
  // TODO: Оператор ЦИКЛА "делай пока" do while сначало проверяется условие потом исполняется тело

  public static void main(String[] args) {
    System.out.println("Введите число: ");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      int x = scanner.nextInt();
      int i = 100;
      do {
        x++;
        if (x % 5 == 0) {
          System.out.println(x);
        }
      }
      while (x < i);
    } else {
      System.out.println("формат не верен");
    }
  }
}
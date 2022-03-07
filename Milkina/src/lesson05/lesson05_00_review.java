package Lesson05;

import java.util.Scanner;

public class Lesson05_00_review {
  /**
  Ввод со сканера
  Проверяется условие ввели ли целое число if (условие)
  scanner.hasNextInt
  Если число целое то в теле выполняется метод
  if (условие) {
  метод
  }
  */


  public static void main(String[] args) {
    System.out.println("Введите число");
    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      int i = scanner.nextInt();
      System.out.println(i);
    } else {
      System.out.println("Вы ввели не целое чиcло");
    }
  }
}

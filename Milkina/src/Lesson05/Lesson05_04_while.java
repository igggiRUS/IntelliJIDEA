package Lesson05;

import java.util.Scanner;

public class Lesson05_04_while {
  // TODO: Оператор ЦИКЛА while "ПОКА". Мы не знаем сколько раз но есть условие while (d <= 10)

  /**
   * Блок кода выполняется пока колличество итераций не станет равно 10
   * Сначало 1 Проверяется
   * Потом 2 Исполняется
   * Сначало исполняется условие потом проверяется телом
   * while (пока) условие выполняется делай
   */

  public static void main(String[] args) {
    System.out.println("input");
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    while (d <= 10) {
      System.out.println("task" + d++);
    }
  }
}
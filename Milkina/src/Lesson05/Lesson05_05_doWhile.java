package Lesson05;

import java.util.function.ToDoubleBiFunction;

public class Lesson05_05_doWhile {
  // TODO Оператор ЦИКЛА do while сначало исполняется потом проверяется
  // TODO НАЧНИ ОТСЮДА С САМОГО начало РОЛИКА

  /**
   * В do while тело выполнится хотя бы один раз потому что условие проверяется в конце
   * Сначало 1 Исполняется
   * Потом 2 Проверяется
   * do делай (исполняй)
   * while (пока) не выполнится условие
   */
  public static void main(String[] args) {
    int i = 100;
    int x = 1;
    do {
      x++;
      if (x % 5 == 0) {
        System.out.println(x);
      }
    }
    while (x < i);
  }
}
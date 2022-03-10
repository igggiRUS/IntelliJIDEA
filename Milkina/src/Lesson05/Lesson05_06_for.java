package Lesson05;

public class Lesson05_06_for {
  //TODO ЦИКЛ for искользуется когда мы знаем сколько чотка раз мы должны что то выполнить

  public static void main(String[] args) {
    char symbol = 'h';
    for (int i = 0; i < 5; i++) {
      System.out.print(" " + symbol++);
    }
  }
}
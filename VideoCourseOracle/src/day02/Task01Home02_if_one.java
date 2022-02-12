package day02;

import java.util.Scanner;
// удобнее читать аналог файла Task01Home02_if
public class Task01Home02_if_one {

  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    System.out.println("Введите число: ");
    int a1 = a.nextInt();
    if (a1 < 5) {
      System.out.println("мелкий");
    } else if (a1 >= 5 && a1 <= 8) {
      System.out.println("средний");
    } else if (a1 >= 9 && a1 <= 1) {
      System.out.println("большой");
    } else if (a1 >= 17 && a1 <= 24) {
      System.out.println("Великан");
    } else {
      System.out.println("Во всех остальных случайях");
    }
  }
}
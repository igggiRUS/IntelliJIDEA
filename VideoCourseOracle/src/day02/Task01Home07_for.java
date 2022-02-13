package day02;

import java.util.Scanner;

// удобнее читать аналог файла Task01Home02_if
public class Task01Home07_for {

  public static void main(String[] args) {
    System.out.println("Введите число 7 и 78 через энтер Программа найдет все что делится на 5");
    Scanner a1 = new Scanner(System.in);
    Scanner b1 = new Scanner(System.in);
    int a = a1.nextInt();
    int b = b1.nextInt();

    for (int i = a++; i < b; i++) {
      // сравнивает деление на 5 и 10 если сходится то пишет вывод
      if (i % 5 == 0 && i % 10 != 0) {
        System.out.println(i + " ");
      }
    }
  }
}
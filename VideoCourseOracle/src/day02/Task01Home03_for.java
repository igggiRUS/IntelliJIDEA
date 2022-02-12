package day02;

import static java.lang.System.*;

import java.util.Scanner;

// удобнее читать аналог файла Task01Home02_if
public class Task01Home03_for {

  public static void main(String[] args) {
    int a = 7;
    int b = 78;
    /*
    int a1 = a.nextInt();
    int b1 = b.nextInt();
    */
    for (int i = a++; i < b; i++) {
      // сравнивает деление на 5 и 10 если сходится то пишет вывод
        if (i % 5 == 0 && i % 10 != 0) {
        out.println(i + " ");
      }
    }
  }
//}
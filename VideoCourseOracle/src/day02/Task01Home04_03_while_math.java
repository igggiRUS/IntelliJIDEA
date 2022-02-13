package day02;

import java.util.Scanner;

public class Task01Home04_03_while_math {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число через энтер 2 раза");
   /*
    int a = scanner.nextInt();
    int b = scanner.nextInt();

   */
    int a = 7;
    int b = 78;

    int t = a+1;
    while (t < b) {
      if (t % 5 == 0 && t % 10 != 0);
      System.out.println(t);
      t++;
    }
  }
}

package day02;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task01Home04_02_math {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число");
    double x = scanner.nextInt();
    double y = 0;

    if (x >= 5) {
      y = (Math.pow(x, 2) - 10) / (x + 7);
    } else if (x > -3 && x < 5) {
      y = (x + 3) * (Math.pow(x, 2) - 2);
    } else {
      y = 420;
    }
    System.out.println(y);
  }

}


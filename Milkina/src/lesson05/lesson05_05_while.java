package Lesson05;

import java.util.Scanner;

public class Lesson05_05_while {

  public static void main(String[] args) {
    System.out.println("input");
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    while (d <= 10) {
      System.out.println("task" + d++);
    }
  }
}

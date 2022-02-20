package day03;

import java.util.Scanner;

public class day02Home_01 {

  public static void main(String[] args) {
    System.out.println("Введи название города");
    Scanner scanner = new Scanner(System.in);
    String city = scanner.nextLine();
    if (city.equals("Москва")) {
      System.out.println("Россия");
    } else if (city.equals("Спб")) {
      System.out.println("Россия");
    } else if (city.equals("Екб")) {
      System.out.println("Россия");
    } else if (city.equals("stop")) {
      System.out.println("xxx");
    } else {
      System.out.println("пиши правильно");
    }
  }
}
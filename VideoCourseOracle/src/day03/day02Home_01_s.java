package day03;

import java.util.Scanner;

public class day02Home_01_s {

  public static void main(String[] args) {
    System.out.println("Введи название города");
    Scanner scanner = new Scanner(System.in);
     while (true) {
       String city = scanner.nextLine();
      if (city.equals("stop")) {
        System.out.println("вы вышли из программы");
        break;
      }
      switch (city) {
        case "Москва", "Екб", "Спб" :
          System.out.println("Россия");
          break;
        default :
          System.out.println("Ничего не подошло");
      }
    }
  }
}
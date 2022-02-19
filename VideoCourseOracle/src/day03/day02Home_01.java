package day03;

import java.util.Scanner;

public class day02Home_01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String city = scanner.nextLine();
    if (city == "Москва") {
      System.out.println("Россия");
    } else if (city == "Спб") {
      System.out.println("Россия");
    } else if (city == "Екб") {
      System.out.println("Россия");
    } else if (city == "stop") {
      break;
    } else {
      continue;
    }
  }
}




      /*
      case "Москва":
        System.out.println("Россия");
        break;
      case "Владивосток":
        System.out.println("Россия");
        break;
      case "Ростов":
        System.out.println("Россия");
        break;
    }

    continue;
  }
    */



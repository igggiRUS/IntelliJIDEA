package Lesson05;

public class Lesson05_02_switchCaseMiklina {
  // введение данных через массив стринг
  public static void main(String[] args) {
    switch (args[0]) {
      case "1":
        System.out.println("Monday");
        break;
      case "2":
        System.out.println("Tuesday");
        break;
      case "3":
        System.out.println("Wednesday");
        break;
      case "4":
        System.out.println("Thursday");
        break;
      case "5":
        System.out.println("Friday");
        break;
      // Можно добавить несколько условий
      case "6":
      case "7":
        System.out.println("weekend");
        break;
      default:
        System.out.println("error");
        break;

    }
  }
}

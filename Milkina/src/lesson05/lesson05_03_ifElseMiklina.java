package Lesson05;

public class Lesson05_03_ifElseMiklina {
// введение данных через массив стринг
  public static void main(String[] args) {
    if ("1".equals(args[0])) {
      System.out.println("Monday");
    } else if ("2".equals(args[0])) {
      System.out.println("Tuesday");
    } else if ("3".equals(args[0])) {
      System.out.println("Wednesday");
    } else if ("4".equals(args[0])) {
      System.out.println("Thursday");
    } else if ("5".equals(args[0])) {
      System.out.println("Friday");
    } else if ("6".equals(args[0]) || "7".equals(args[0])) {
      System.out.println("weekend");
    } else {
      System.out.println("error");
    }
  }
}

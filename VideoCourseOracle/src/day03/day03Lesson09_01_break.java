package day03;

public class day03Lesson09_01_break {

  public static void main(String[] args) {
    int i = 0;
        // бесконечный цикл
    while (true) {
      if (i == 15) {
        break;
      }
      System.out.println(i);
      i++;
    }
  }
}

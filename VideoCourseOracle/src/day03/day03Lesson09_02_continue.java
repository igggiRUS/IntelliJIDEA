package day03;

public class day03Lesson09_02_continue {

  public static void main(String[] args) {
    for (int i = 0; i <= 15; i++) {
      if (i % 2 == 0) {
        System.out.println("Четное число: " + i);
    /*  } else {
        System.out.println("Это не четное число: " + i);
      }
      {*/
        continue;
      }
    }
  }
}
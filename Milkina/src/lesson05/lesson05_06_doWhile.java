package Lesson05;

public class Lesson05_06_doWhile {

  public static void main(String[] args) {
    int i = 100;
    int x = 1;
    do {
      x++;
      if (x % 5 == 0) {
        System.out.println(x);
      }
    }
    while (x < i);
  }
}
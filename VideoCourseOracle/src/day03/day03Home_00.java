package day03;

public class day03Home_00 {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print(j + " "); // выводим j на одной строке
        if (j == 5) {
          break;
        }
      }
      System.out.println();
    }
  }
}
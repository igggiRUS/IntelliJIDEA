package day03;

public class Milkin100_6 {

  public static void main(String[] args) {
    int i = 1;
    int count = 0;
    int sum = 0;
    int avg;

    do {
      if (i % 5 == 0) {
        System.out.println(i);
        count++;
        sum += i;
      }
      i++;
    }

    while (i <= 20);
    System.out.println(sum / count);
  }
}

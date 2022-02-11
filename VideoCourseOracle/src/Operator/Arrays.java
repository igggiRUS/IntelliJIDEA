package Operator;

public class Arrays {

  public static void main(String[] args) {
    int number = 10;
    int[] numbers = new int[5];
    System.out.println(number);
    for (int i = 0; i < numbers.length; i++) {
      ; // длинна массива numbers.length
      numbers[i] = i * 10;
    }
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}

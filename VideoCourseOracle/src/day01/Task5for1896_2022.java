package day01;

public class Task5for1896_2022 {

  static int count = 0;

  public Task5for1896_2022() {
  }

  public static void main(String[] args) {
    // первые Олимпийские игры 1896 год
    for (int i = 1896; i <= 2022; i += 4)
    {
      System.out.println("Олимпиада  " + i + " года");
      count++;
      System.out.println("Прошло: "+ count+" Олимпиады");
    }
  }
}

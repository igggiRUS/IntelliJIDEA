package day0;

public class WhileLoops {

  public static void main(String[] args) {
    int value = 0;
    // цикл while выполняется до тех пор пока условие в круглых скобках не становится истинным true
    while (value<=5){
      System.out.println("hello"+" "+value);
      value = value+1;
    }
  }
}

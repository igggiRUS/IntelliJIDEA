
package Lesson06;

class MethodOverLoadingEnd {

  void show(int l1) {
    System.out.println(l1);
  }
  void show(boolean b1){
    System.out.println(b1);
  }
  void show(String sx1){
    System.out.println(sx1);
  }
  void show(String sx1, int a){
    System.out.println("String" +" "+ sx1 +" "+ "int" +" "+ a);
  }
  void show(int a, String sx1){
      System.out.println("Последовательность записи влияет на то какой метод выберет программа");
      }
}

public class MethodOverloadingMainEnd {

  public static void main(String[] agrs) {
    MethodOverLoadingEnd mOLE;
    mOLE = new MethodOverLoadingEnd();
    int a = 500;
    mOLE.show(a);
    boolean b = true;
    mOLE.show(b);
    String sx = "Оверлоадинг при загрузке смотрит на последовательность переменных и выводит методы в соответствии с последовательностю переменных";
    mOLE.show(sx);
    mOLE.show(24, "Посмотрите на разницу в последовательности");
    mOLE.show("Посмотрите на разницу в последовательности", 24);
  }
}
//[конспектировать с 30 минуты урок N6](https://www.udemy.com/course/java-oca-oracle/learn/lecture/12456760#notes)
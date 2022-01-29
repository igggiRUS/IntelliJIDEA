
package lesson06;

class MethodOverLoadingStart {

  void showInt(int l1) {
    System.out.println(l1);
  }
  void showBoolean(boolean b1){
    System.out.println(b1);
  }
  void showString(String sx1){
    System.out.println(sx1);
  }
}

public class MethodOverloadingMainStart {

  public static void main(String[] agrs) {
    MethodOverLoadingStart mOLS;
    mOLS = new MethodOverLoadingStart();
    int a = 500;
    mOLS.showInt(a);
    boolean b = true;
    mOLS.showBoolean(b);
    String sx = "Привет!!!";
    mOLS.showString(sx);
  }
}

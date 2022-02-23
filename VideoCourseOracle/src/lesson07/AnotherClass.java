package Lesson07;

public class AnotherClass {
  // private class AnotherClass {  Если написать private то его не увидят в других классах
  // дефолтные видно только внутри пакета
  public static void main(String[] agrs) {

    Employee emp = new Employee(500);
    System.out.println(emp.salary);
    emp.doubleSalary();
  }
}

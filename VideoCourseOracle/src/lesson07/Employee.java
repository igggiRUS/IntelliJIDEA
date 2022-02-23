package Lesson07;

public class Employee {

  public double salary;
  // private double salary; PRIVATE это протектер (защита) все приватные элементы видят только дети этих элементов и те что внутри package

  public void doubleSalary() {

    // ВСЕ переменыне созданные внутри метода локальны. Они там созданны и там работают.
    System.out.println("NewSalary = :" + salary * 2);
    /* МОЖНО БЫЛО ТАК
    double result = salary * 2;
    System.out.println("NewSalary = :" + result);
  */

  }

  //  private Employee(double salary2)
  public Employee(double salary2) {
    salary = salary2;
  }

  public static void main(String[] agrs) {

    Employee emp = new Employee(500);
    System.out.println(emp.salary);
    emp.doubleSalary();
  }
}
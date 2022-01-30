package lesson06;

class Employee01 {

  // Варианты записи
  Employee01(int id2, String surname2, int age2) {
    id = id2;
    surname = surname2;
    age = age2;
  }

  Employee01(String surname2, int age2) {
    surname = surname2;
    age = age2;
  }

  Employee01(int id2, String surname2, int age2, double salary2, String department2) {
    id = id2;
    surname = surname2;
    age = age2;
    salary = salary2;
    department = department2;
  }

  int id;
  String surname;
  int age;
  double salary;
  String department;
}

class EmployeeStarter01 {

  public static void main(String[] agrs) {
    Employee01 emp1 = new Employee01(1, "Ivan", 25);
    System.out.println(emp1.surname);
    Employee01 emp2 = new Employee01("Petrov", 30);
    System.out.println(emp2.department);
    Employee01 emp3 = new Employee01(2, "Sviridov", 40, 100.35, "IT");
    System.out.println(emp3.department);
  }
}


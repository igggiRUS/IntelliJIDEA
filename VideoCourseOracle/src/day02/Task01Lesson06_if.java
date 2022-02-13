package day02;

public class Task01Lesson06_if {
  public static void main(String[] args) {
    /*
    если денег меньше то 1.... иначе если то 2 ....
    иначе если то 3... иначе (во всех остальных случайях)...
    */
    double money = 10000.0; // Количество денег до зарплаты
    System.out.println(money +" Количество денег до зарплаты");
    if (money < 3000) {
      System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
    } else if (money < 10000) {
      System.out.println("Окей, пора в Макдак!");
      // вприсал условие  AND && логический оператор сравнения
    } else if (money > 10000 && money < 30000) {
      System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
    } else {
      System.out.println("Класс! Заказывайте крабов!");
    }
  }
}
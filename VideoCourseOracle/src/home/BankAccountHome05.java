
package home;

/*
import java.util.Scanner;
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
*/
public class BankAccountHome05 {

    // instance variables Переменные экземпляра(единицы детали шаблона)
    int id;
    String name = "Misha";
    double balance = 100;
// метод 1
    void popolnenieScheta(double summaPopolnenia) {
        System.out.println("Баланс до пополнения :" + balance);
        System.out.println("пополнен на: " + summaPopolnenia);
        balance += summaPopolnenia;
        System.out.println("Баланс после :" + balance);
    }
    // метод 2
    void snatieScheta(double summaSpisania) {
        System.out.println("Баланс до снятия :" + balance);
        System.out.println("Сняли на: " + summaSpisania);
        balance -= summaSpisania;
        System.out.println("Баланс после :" + balance);
    }

    public static void main(String[] agrs) {
        BankAccountHome05 MyAccount = new BankAccountHome05();
        MyAccount.popolnenieScheta(30.5);
        MyAccount.snatieScheta(15.4);

    }
}


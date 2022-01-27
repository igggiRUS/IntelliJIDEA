
package lesson04;

// референсные ссылочные типы данных
public class BankAccount {

    // создаем банк акканут без присвоения значений
// класс BankAccount то есть шаблон
// instance variables Переменные экземпляра(единицы детали шаблона)
    int id;
    String name;
    double balance;


    public static void main (String []agrs){

        // референсные ссылочные типы данных
        // создаем объект класса BankAccount
        // референс(тип данных) переменная = значение ();
        // new означает что будет создаваться новый объект
        // все что идет после new это вызов конструктора BankAccount();
        // цель любого конструктора создать объект
        BankAccount bA = new BankAccount();
        BankAccount MyAccount = new BankAccount();
        BankAccount HerAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        // ненадо указывать тип переменных они уже указанны public class BankAccount
        // у собаки может быть несоколько поводков но у несколькоих собак не омжет быть 1 поводок
        // у объекта может быть несколько переменных но у переменной не может быть несколько объектов
        MyAccount.id = 1;
        MyAccount.name = "Misha";
        MyAccount.balance = 12.35;

        HerAccount.id = 2;
        HerAccount.name = "Oksana";
        HerAccount.balance = 18.35;


        HisAccount.id = 3;
        HisAccount.name = "Valera";
        HisAccount.balance = 25.35;


        System.out.println("Мой баланс: " + MyAccount.balance);
        System.out.println("Ее баланс: " + HisAccount.balance);

    }
}

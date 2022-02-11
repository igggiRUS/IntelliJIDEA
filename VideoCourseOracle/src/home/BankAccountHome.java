
package home;

public class BankAccountHome {

    // instance variables Переменные экземпляра(единицы детали шаблона)
    int id;
    String name;
    double balance;


    public static void main(String[] agrs) {

        BankAccountHome MyAccount = new BankAccountHome();
        BankAccountHome HerAccount = new BankAccountHome();
        BankAccountHome HisAccount = new BankAccountHome();

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


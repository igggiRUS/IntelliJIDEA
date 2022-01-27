package lesson05;

public class Human {
String name;
Car3 car;
bankAccount bA;
void info() { //метод
    System.out.println("imya: "+ name + "cvet: " + car.color + "bankovsky schet Balnce" + bA.balance);
}
}

class HumanTest{
    public static  void  main(String[]args) {
       Human h = new Human();
       h.name = "David";
       h.car= new  Car3("red", "V8");
       h.bA= new bankAccount(18, 200.5);
       h.info();
    }
}
    Class Car4 {
        Car4 (String c, String e) {
                                    color = c;
                                    engine = e;
                                    }
                String color;
                String engine;
                }
        Class bankAccount {
    bankAccount(int id2, double balance2) {
        id=id2;
        balance=balance2;
        }
                            int id;
                            double balance;
                            }
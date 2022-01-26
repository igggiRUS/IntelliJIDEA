package lesson05;
public class Car2{
        String color;
        String engine;
        int speed;
    
    // метод газ
    int gaz(int scorost){ // газ автомобиля
                // складываем затем присваиваем
                speed+=scorost;
                return speed;

                }
    int tormoz(int scorost){ // тормоз автомобиля
                // вычитаем затем присваиваем
                speed-=scorost;
                return speed;
                }
    // void пустота вывод на экран это не оутпут
    void showInfo(){ 
                System.out.println("cvet: " + color + " motor: " + engine + " scorost: " + speed);
   }
}
class Car2test{
    public static void main(String[] agrs){
        Car2 c1 = new Car2();
        c1.color = "wite";
        c1.engine = "v6";
        c1.speed = 60;
        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();
    }
}
// 5 урок начни с 36 минуты

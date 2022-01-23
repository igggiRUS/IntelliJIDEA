package YadexPractikum;
class Praktikum {
    public static void main(String[] args) {

        double rateUSD = 78.5;
        double rubles = 14356.5;
        
        if (rateUSD > 70) {
          
            System.out.println("Отличный курс доллара — рекомендую купить!");
        }  
            System.out.println("Ваши сбережения в долларах: " + rubles / rateUSD);
        }
}
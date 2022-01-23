package lesson03;
public class lesson03_03 {
     public static void main (String []agrs){
         
         int x = 5;
         int y = 10;
         
         /* используем оператор битвайс bitwise AND ( И )
         Пересчет происходит в двоичной системе
         в электрике
         0 - false (выключен)
         1 - true  (включен) 
         возвращает false если одно из условий равно false 
         0101
         AND
         1010
         -----
         0000
          */
         
         // И AND &
         System.out.println(x&y);
         /* используем оператор битвайс bitwise OR ( ИЛИ )
         Пересчет происходит в двоичной системе
         в электрике
         0 - false (выключен)
         1 - true  (включен)
         Возвращает true если одно из условий равно true         
         0101
         OR
         1010
         -----
         1111
         */
         // ИЛИ OR  |   
         System.out.println(x|y);
         
         /* используем оператор битвайс экслюзив  OR ( ИЛИ )
         Пересчет происходит в двоичной системе
         в электрике
         0 - false (выключен)
         1 - true  (включен)
         Возвращает true если даже их множества одно из условий равно true         
         0101
         OR
         1010
         -----
         1111
         */
         // ИЛИ OR  |  
         boolean b1 = false;
         boolean b2 = false;
         boolean b3 = false;
         boolean b4 = false;
         boolean b5 = false;
         boolean b6 = true;
         boolean b7 = true;
         boolean b8 = true;
         boolean b9 = true;
         System.out.println(b1^b2^b3^b4^b5^b6); // условие выполнено одно значение = true поэтому ответ true
         System.out.println(b6^b7^b8^b9); // все значение false условие не выполено
         System.out.println(b1^b2^b3^b4); // все значение true условие не выполено 50 на 50
         System.out.println(b8^b9^b7^b4); // условие выполнено одно значение = false поэтмоу ответ true
         
         
        }
}
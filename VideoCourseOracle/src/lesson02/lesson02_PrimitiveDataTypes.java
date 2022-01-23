package lesson02;
public class lesson02_PrimitiveDataTypes {
 public static void main(String [] args)  { 
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;
        short s1 = 5;
        short s2 = -10;
        short s3 = 0;        
        
        int i1 = 100;
        
        long l1 = 1000L;
        long l2 = 100000000000L;        
        long l3 = 51L; 
        
        float f1 = 3.14f;
        float f2 = 2.5f;
        float f3 = 20.0f;        
        
        double d1 = 5.5;
        double d2 = 87.65;
        // char не может содержать более 1 символа
        char c1 = 'a';
        char c2 = 'A';        
        char c3 = ' ';                
        char c4 = '7';
        // означает что берется 310 значение из unicode 10 система
        char c5 = 310; //10 система исчисления
        // Порядковый номер символа юникода (\)u является ключом
        char c6 = '\u00b6'; // 16 система исчисления ABCDEF
        
        // Логический может иметь только 2 варианта Правда Ложь
        boolean bool1 = true;
        boolean bool2 = false;
        
        //запись в разных системах исчисления 
        int twice0b = 0b1011011110111011000111011;
        // 16 система исчисления всегда начинается с 0x HEX
        int x16 = 0x3c;
        // для разделения групп разрешили использовать underscore будет виден только в программе на выходе цифры группироваться не будут
        int underscore = 10_000_000;
System.out.println(underscore);
System.out.println(x16);
System.out.println(twice0b);
System.out.println(bool2);
System.out.println(bool1);
System.out.println(c6);

 }
}

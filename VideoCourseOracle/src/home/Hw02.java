package home;

public class Hw02 {

  public static void main(String[] args) {
    byte b1 = 0xC; // HEX
    byte b2 = 12; // DEC
    byte b3 = 014; // OCT
    byte b4 = 0b1100; // BIN

    short sh1 = 0x32C8; // HEX
    short sh2 = 13000; // DEC
    short sh3 = 031310; // OCT
    short sh4 = 0b11001011001000; // BIN

    long long1 = 0x75BCD15; // HEX
    long long2 = 123456789L; // DEC
    long long3 = 0726746425; // OCT
    long long4 = 0b111010110111100110100010101; // BIN

    short zero1 = 0; // HEX
    short zero2 = 0; // DEC
    short zero3 = 0; // OCT
    short zero4 = 0; // BIN

    boolean boolTrue = true;
    boolean boolFalse = true;
    short short12 = 12;
    int int12 = 12;
    long long12 = 12L; // long
    float float12 = 12F; //float
    double double12 = 12.45;
    double double14 = 14.50D; // double

    String string1 = "Am Mike";
    String string2 = "чар для одиночного символа стринд для строки";
    String string3 = "Hello";
    String string4 = "BB";


    char char1 = 'M';
    char char2 = '\u004D'; // система unicode
    char char3 = 0x4D; // 16 код буквы
    char char4 = ' '; // пробел тоже символ


    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);

    System.out.println();
    System.out.println(sh1);
    System.out.println(sh2);
    System.out.println(sh3);
    System.out.println(sh4);

    System.out.println();
    System.out.println(long1);
    System.out.println(long2);
    System.out.println(long3);
    System.out.println(long4);

    System.out.println();
    System.out.println(zero1);
    System.out.println(zero2);
    System.out.println(zero3);
    System.out.println(zero4);

    System.out.println();
    System.out.println(boolTrue);
    System.out.println(boolFalse);
    System.out.println(short12 + " " + int12 + " " + long12 + " " + float12 + " " + double12 +" " + double14);

    System.out.println();
    System.out.println(string1);
    System.out.println(string2);
    System.out.println(string3);
    System.out.println(string4);

    System.out.println();
    System.out.println(char1);
    System.out.println(char2);
    System.out.println(char3);
    System.out.println(char4);
  }
}

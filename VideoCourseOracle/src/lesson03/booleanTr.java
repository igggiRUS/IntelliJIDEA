package Lesson03;
public class booleanTr {
    public static void main (String []agrs){
    
int a=5;
int b=3;
int c=3;
// логический оператор сравнения
boolean b1 = a>b;
boolean b2 = a<b;
boolean b3 = c==b;
boolean b4 = c!=b;

boolean x=true; 
boolean y=false;
boolean z = true;
boolean solt1 = x&&y&&z; // как только выражение нашло true AND false  оно перестает считать дальше
boolean solt2 = x&y&z; // даже если находит true AND false  выражение продолжает считать дальше  
boolean bolt1 = x||y||z; // как только выражение нашло true OR false  оно перестает считать дальше
boolean bolt2 = x|y|z;   // даже если находит true OR false  выражение продолжает считать дальше    
boolean bolt3 = x^y^z;    // true^true^true = false false^false^false =false true^false^true = false false^false^false^true = true  если только один true значение будет true
System.out.println(b1);
System.out.println(b2);
System.out.println(b3);
System.out.println(b4);
System.out.println(5==5);
System.out.println(solt1);
System.out.println(bolt1);
System.out.println(solt2);
System.out.println(bolt2);
    }
}

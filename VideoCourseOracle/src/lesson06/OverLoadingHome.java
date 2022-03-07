package Lesson06;

import java.util.Arrays;

public class Overload05 {
    Overload05(int a, int b, int c, int d, int e, int f) {
        this(a1, b1, c1, d1, e1, f1);
    }
    Overload05(int a, int b, int c, int d, int e, int f) {
        this(a2, b2, c2, d2, e2, f2);
    }

    Overload05(int a, int b, int c, int d, int e, int f) {
        this(a3, b3, c3, d3, e3, f3);
    }

    Overload05(int a, int b, int c, int d, int e, int f) {
        this(a4, b4, c4, d4, e4, f4);
    }

    Overload05(int a, int b, int c, int d, int e, int f) {
        a = a4;
        b = b4;
        c = c4;
        d = d4;
        e = e4;
        f = f4;

    }

    public Overload05(int i, int i1, int i2, int i3, int i4, int i5) {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
    }
}

class OverLoadingHomeStarter {
    public static void main(String[] args) {
        Overload05 over1 = new Overload05(1, 2, 3, 4, 5, 6);
        System.out.println(over1.a);
        Overload05 over2 = new Overload05(1, 2, 3, 4, 5, 6);
        System.out.println(over2.a);
        Overload05 over3 = new Overload05(1, 2, 3, 4, 5, 6);
        System.out.println(over3.a);
        Overload05 over4 = new Overload05(1, 2, 3, 4, 5, 6);
        System.out.println(over4.a);
    }

}

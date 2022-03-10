package Lesson06;

public class Overload05Builder {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int i;
    private int i1;
    private int i2;
    private int i3;
    private int i4;
    private int i5;

    public Overload05Builder setA(int a) {
        this.a = a;
        return this;
    }

    public Overload05Builder setB(int b) {
        this.b = b;
        return this;
    }

    public Overload05Builder setC(int c) {
        this.c = c;
        return this;
    }

    public Overload05Builder setD(int d) {
        this.d = d;
        return this;
    }

    public Overload05Builder setE(int e) {
        this.e = e;
        return this;
    }

    public Overload05Builder setF(int f) {
        this.f = f;
        return this;
    }

    public Overload05Builder setI(int i) {
        this.i = i;
        return this;
    }

    public Overload05Builder setI1(int i1) {
        this.i1 = i1;
        return this;
    }

    public Overload05Builder setI2(int i2) {
        this.i2 = i2;
        return this;
    }

    public Overload05Builder setI3(int i3) {
        this.i3 = i3;
        return this;
    }

    public Overload05Builder setI4(int i4) {
        this.i4 = i4;
        return this;
    }

    public Overload05Builder setI5(int i5) {
        this.i5 = i5;
        return this;
    }

    public Overload05 createOverload05() {
        return new Overload05(a, b, c, d, e, f);
    }
}
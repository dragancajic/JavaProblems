package org.eu5.learn_pisio;

// The keyword super → Extended classes
// https://hyperskill.org/learn/step/3039

class A {
    
    protected int field;
    
    public A(int val) {
        this.field = val + 1;
        System.out.println("field from A: " + this.field); // 2 + 1 = 3
    }
}

class B extends A {
    
    protected int field;
    
    public B(int val) {
        super(val);
        this.field = super.field * 2;
        System.out.println("field from B: " + this.field); // 3 * 2 = 6
    }
}

class C extends B {
    
    protected int field;
    
    public C(int val) {
        super(val);
        this.field = super.field + 2;
        System.out.println("field from C: " + this.field); // 6 + 2 = 8
    }
    
    public void printField() {
        System.out.println(super.field); // output: 6
    }
}

class ExtendedClasses {
    public static void main(String[] args) {
        C c = new C(2);
        c.printField(); // 6
    }
}

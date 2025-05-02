package q;

import p.A;

public class B extends A {
    public static void main(String[] args) {
        A obj = new A();
        
        obj.publicMethod(); 

        B objB = new B();
        objB.protectedMethod(); 
        obj.accessPrivateMethod();
    }
}

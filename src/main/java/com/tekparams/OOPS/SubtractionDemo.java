package com.tekparams.OOPS;

import com.tekparams.accessmodifiers.ProtectedAccessModifierDemo;

public class SubtractionDemo extends ProtectedAccessModifierDemo {
    // Example for Protected Access Modifier Demo
    public static void main(String[] args) {
        SubtractionDemo obj1 = new SubtractionDemo();
        obj1.a=788;
        obj1.b=5764;
        obj1.subtraction();
        obj1.printResult();

    }

}

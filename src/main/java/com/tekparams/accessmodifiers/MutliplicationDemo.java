package com.tekparams.accessmodifiers;

import com.tekparams.PublicAccessModifierDemo;

public class MutliplicationDemo {
    public static void main(String[] args) {
        PublicAccessModifierDemo obj1 = new PublicAccessModifierDemo();
        obj1.a=899;
        obj1.b=765;
        obj1.multiplication();
        obj1.printResult();
    }

}

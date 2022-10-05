package com.tekparams.accessmodifiers;

public class ProtectedAccessModifierDemo {
    protected int a;
    protected int b;
    protected int result;

    protected void subtraction(){
        result = a- b;
    }
    protected void printResult(){
        System.out.println("The result is :"+result);
    }
}

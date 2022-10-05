package com.tekparams.accessmodifiers;

public class PrivateAccessModifierDemo {
    // Example for private access modifier
    private int a;
    private int b;
    private int result;

    // Example for private access modifier
    private void Addition(){
        result=a+b;
//        return result;
    }
    private void printResult(){
        System.out.println("The result is : "+result);
    }

    // Example for private access modifier
    private PrivateAccessModifierDemo(){
        a=100;
        b=300;
    }

    public static void main(String[] args) {
        PrivateAccessModifierDemo privateAccessModifierDemo = new PrivateAccessModifierDemo();
        privateAccessModifierDemo.a=500;
        privateAccessModifierDemo.b=900;
        privateAccessModifierDemo.Addition();
        privateAccessModifierDemo.printResult();
    }
}

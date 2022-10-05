package com.tekparams.accessmodifiers;

public class DefaultAccessModifierDemo {
    // Example for defailt access modifier
    int a;
    int b;
    int result;

    // Example for default access modifier
    void Addition(){
        result=a+b;
//        return result;
    }
    void printResult(){
        System.out.println("The result is : "+result);
    }

    // Example for default access modifier
    DefaultAccessModifierDemo(){
        a=100;
        b=300;
    }

    public static void main(String[] args) {
        DefaultAccessModifierDemo defaultAccessModifierDemo = new DefaultAccessModifierDemo();
        defaultAccessModifierDemo.a=500;
        defaultAccessModifierDemo.b=900;
        defaultAccessModifierDemo.Addition();
        defaultAccessModifierDemo.printResult();
    }
}

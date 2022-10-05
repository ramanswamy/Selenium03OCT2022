package com.tekparams.OOPS;

public class MethodOverloadingDemo {
    int a;
    int b;
    int c;
    int d;
    int result;
    double result1;

    void addition(int a, int b){
        result=a+b;
    }
    void addition(int a, int b, int c){
        result = a+b+c;
    }
    void addition(int a, int b, int c, int d){
        result=a+b+c+d;
    }
    void addition(int a, double a1){
        result1=a+a1;
    }
    void printResult(){
        System.out.println("The result is : "+result);
    }
    void printResult1(){
        System.out.println("The result is :"+result1);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
        obj1.addition(19,38);
        obj1.printResult();
        obj1.addition(34,678.87);
        obj1.printResult1();
        obj1.addition(73,56,35);
        obj1.printResult();
        obj1.addition(76,56,33,777);
        obj1.printResult();
    }
}

package com.tekparams;

public class PublicAccessModifierDemo {
    public int a;
    public int b;
    public int result;

    public int multiplication(){
        result=a*b;
        return result;
    }
    public void printResult(){
        System.out.println("The result is :"+result);
    }
}

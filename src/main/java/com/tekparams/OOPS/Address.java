package com.tekparams.OOPS;

public class Address {

    // Data Members
    public String dNo;
    public String street;
    public String city;
    public int pin;

    public void printAddress(){
        System.out.println("Door No: "+dNo+"\n"+"Street"+street+"\n"+"City :"+city+"\n"+"PIN:"+pin);
    }

    // Default Constructor
    public Address(){
        dNo="287";
        street="ABC Street";
        city="Bangalore";
        pin=560076;
    }
    // Parameterized Constructors
    public Address(String dNo,String Street, String City, int pin){
        this.dNo=dNo;
        this.street=Street;
        this.city=city;
        this.pin=pin;
    }

//    public static void main(String[] args){
//        Address address = new Address();
//        address.printAddress();
//        System.out.println();
//        Address address1 = new Address("655","XYZ Street","Bangalore",50076);
//        address1.printAddress();
//        System.out.println();
//        address.printAddress();
//        address.dNo="670";
//        address.street="MNC Street";
//        address.city="Bangalore";
//        address.pin=44776;
//        System.out.println();
//        address.printAddress();
//    }
}

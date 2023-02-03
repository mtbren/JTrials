package com.internal;

public class TestBird {
    private static Bird staticBird = new Bird();
    private static String tString;

    private Bird instanceBird = new Bird();

    public static void main(String[] args) {
        System.out.println(staticBird.hasFeathers +" "+ staticBird.noOfLegs +" "+staticBird.weight+" "+staticBird.type);


        TestBird test = new TestBird();

        test.instanceBird.type="INSTANCEBIRD";
        test.instanceBird.weight=100;
        test.instanceBird.hasFeathers=true;
        test.instanceBird.noOfLegs=4;


        System.out.println(staticBird.hasFeathers +" "+ staticBird.noOfLegs +" "+staticBird.weight+" "+staticBird.type);

        staticBird.weight=test.instanceBird.weight;
        staticBird.type=test.instanceBird.type;
        
        System.out.println(staticBird.hasFeathers +" "+ staticBird.noOfLegs +" "+staticBird.weight+" "+staticBird.type);
    }
}

class Bird{
    public static boolean hasFeathers ;
    public static int noOfLegs;
    public float weight;
    public String type;

    public void fly(){
        System.out.println("Bird is flying");
    }
}

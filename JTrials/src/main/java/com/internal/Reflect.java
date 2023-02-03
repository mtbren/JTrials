package com.internal;

/**
 * Created by Amit on 3/20/2018.
 */
public class Reflect {
    public static void main(String[] args) {
        Reflect r = new Reflect();
        System.out.println(Reflect.class.toString());
        System.out.println(r.getClass());
        System.out.println(r.getClass().getName());

        try {
            Object obj = Class.forName("com.internal.Reflect").newInstance();
            System.out.println(obj.getClass());
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public void transpire(){

    }
    public Reflect(){

    }
}

package com.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Amit on 3/23/2018.
 */
public class ReflectTester {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.internal.Reflect");
            Method[] methArr = c.getDeclaredMethods();
            for (Method m : methArr) {
                System.out.println(Modifier.toString(m.getModifiers()));

                System.out.println(m.getName());
            }

            Constructor[] cons = c.getDeclaredConstructors();
            for(Constructor o : cons){
                System.out.println(Modifier.toString(o.getModifiers()));
                System.out.println(o.getName());
            }

        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
    }
}

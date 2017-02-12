package com.datadriver.test;

import sun.applet.Main;

/**
 * Created by weiyong on 2017/2/10.
 */
public class IdeaTest1 {
    public static void main(String[] args){
        int a=10;
        int b=10;
        method(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    private static void method(int a, int b) {
        System.out.println(a*10);
        System.out.println(b*10);
        System.exit(0);
    }
}

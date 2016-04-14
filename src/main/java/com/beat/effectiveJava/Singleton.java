package com.beat.effectiveJava;


import java.lang.reflect.Constructor;
import java.util.Collections;

/**
 * Created by beatkirito on 2016/3/21.
 */
public class Singleton {

    //static final域存放实例单例对象
    private static final Singleton INSTANCE = new Singleton();

    //私有构造，并作防止反射攻击的处理
    private Singleton() {
        if(INSTANCE != null) {
            try {
                throw new IlleagleInstanceException();
            } catch (IlleagleInstanceException e) {
                e.printStackTrace();
            }
        }
    }


    //获取单例的静态方法
    public static Singleton getInstance() { return INSTANCE; }

    static class IlleagleInstanceException extends Exception {}

    //测试方法
    public static void main(String[] args) throws Exception {

        Singleton s = Singleton.INSTANCE;

        Class<Singleton> sClass =  Singleton.class;

        Constructor[] constructors = sClass.getDeclaredConstructors();
        Constructor<Singleton> constructor = constructors[0];
        constructor.setAccessible(true);
        Singleton s2 = constructor.newInstance();



    }
}

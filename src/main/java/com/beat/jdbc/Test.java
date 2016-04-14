package com.beat.jdbc;

/**
 * Created by beatkirito on 2016/3/21.
 */
public class Test<K,V> {

    private Test() {

    }

    //泛型方法的静态工厂方法
    public static <K,V> Test<K,V> newInstance() {
        return new Test<K,V>();
    }

    public static void main(String[] args) {

        //通过类型推导得出具体类型参数，因此调用静态工厂方法时，无须指定类型参数
        Test<String,String> t = Test.newInstance();

        //普通的类型参数对象的实例化方法，需要知道类型参数
        Test<String,String> t2 = new Test<String,String>();

    }
}

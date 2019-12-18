package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {
    /*public static void main(String[] args) {
        EnumSingleton e1 = null;
        EnumSingleton e2 = EnumSingleton.getInstance();
        e2.setData(new Object());
        try {
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(e1.getData());
            System.out.println(e2.getData());
            System.out.println(e1.getData() == e2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        try {
            Class<?> clazz = EnumSingleton.class;
//            Constructor c = clazz.getDeclaredConstructor();
            Constructor c = clazz.getDeclaredConstructor(String.class, int.class);
            c.setAccessible(true);
            EnumSingleton e = (EnumSingleton) c.newInstance("Tom", 666);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                public void handler() {
                    Object obj = ContainerSingleton.getBean( "com.gupaoedu.vip.pattern.singleton.test.Pojo");
                    System.out.println(Thread.currentThread().getName() + ": " + obj);
                    /*try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("总耗时：" + (System.currentTimeMillis() - start) + "ms");
    }
}

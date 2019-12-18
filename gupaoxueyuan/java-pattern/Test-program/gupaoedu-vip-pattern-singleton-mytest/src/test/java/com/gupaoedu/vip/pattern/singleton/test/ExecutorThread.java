package com.gupaoedu.vip.pattern.singleton.test;

import com.gupaoedu.vip.pattern.singleton.lazy.LazyDoubleCheckSingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazyInnerClassSingleton;
import com.gupaoedu.vip.pattern.singleton.lazy.LazySimpleSingleton;
import com.gupaoedu.vip.pattern.singleton.threadlocal.ThreadLocalSingleton;

public class ExecutorThread implements Runnable {
    public void run() {
//        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
//        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
//        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();

        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getName() + ":" + singleton);


    }
}

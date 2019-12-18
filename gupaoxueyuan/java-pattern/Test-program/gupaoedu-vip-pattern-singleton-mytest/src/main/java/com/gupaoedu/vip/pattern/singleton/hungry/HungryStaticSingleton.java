package com.gupaoedu.vip.pattern.singleton.hungry;

/**
 * 饿汉式静态块单例
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    private static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}

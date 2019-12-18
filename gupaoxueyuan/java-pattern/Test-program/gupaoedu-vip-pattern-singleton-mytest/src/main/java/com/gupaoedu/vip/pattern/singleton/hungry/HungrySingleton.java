package com.gupaoedu.vip.pattern.singleton.hungry;

/**
 * 饿汉式单例——单例对象较少的情况下能使用
 * 优点:没有加任何的锁、执行效率比较高，在用户体验上来说，比懒汉式更好。
 * 缺点:类加载的时候就初始化，不管用与不用都占着空间，浪费了内存，有可能占着茅 坑不拉屎。
 */
public class HungrySingleton {

    /**
     * 先静态，后动态
     * 先属性，后方法
     * 先上后下
     */
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}

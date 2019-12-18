package com.gupaoedu.vip.pattern.singleton.lazy;

/**
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 */
public class LazySimpleSingleton {

    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton(){}

    /**
     * 这个方法线程不安全
     * 多个线程同时进入这个方法时，有可能出现每个线程都会创建对象
     * @return
     */
    /*public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }*/

    /**
     * 这个方法线程安全（线程同步）
     * 但在方法声明处加synchronized关键字，等于方法所在的整个类被加锁
     * 在线程数量比较多情况下，如果 CPU 分配压力上升，会导致大批 量线程出现阻塞，从而导致程序运行性能大幅下降
     * 所以再优化成双重检查锁的单例模式
     * @return
     */
    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}

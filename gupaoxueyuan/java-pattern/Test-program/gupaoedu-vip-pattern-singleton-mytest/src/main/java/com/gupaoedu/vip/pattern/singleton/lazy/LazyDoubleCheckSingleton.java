package com.gupaoedu.vip.pattern.singleton.lazy;

public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton() {}

    private volatile static LazyDoubleCheckSingleton lazy = null;

    /**
     * synchronized 用在方法内部，比生声明在方法上性能好很多
     * 但是，用到 synchronized 关键字，总归是要上锁，对程序性能还是存在一定影响的
     * 所以考虑静态内部类方式
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2。初始化对象
                    //3。设置lazy指向刚分配的内存地址
                }
            }
        }
        return lazy;
    }
}

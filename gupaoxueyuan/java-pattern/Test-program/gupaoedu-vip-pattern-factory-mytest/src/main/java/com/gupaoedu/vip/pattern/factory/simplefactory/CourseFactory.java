package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;
import com.gupaoedu.vip.pattern.factory.PythonCourse;

/**
 * 简单工厂模式不符合开闭原则
 */
public class CourseFactory {
    /*public ICourse create(String name) {
        if ("java".equals(name)) {
            return new JavaCourse();
        } else if ("python".equals(name)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }*/

    /**
     * 优化上面的代码, 使用反射，这样就不用每次新增类的时候修改代码
     */
    /*public ICourse create(String className) {
        try {
            if (!(null == className || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /**
     * 优化上面的代码
     */
    public ICourse create(Class<? extends ICourse> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

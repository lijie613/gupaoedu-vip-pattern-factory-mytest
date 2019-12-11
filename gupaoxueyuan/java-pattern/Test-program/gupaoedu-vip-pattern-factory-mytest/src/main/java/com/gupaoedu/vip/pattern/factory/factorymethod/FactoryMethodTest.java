package com.gupaoedu.vip.pattern.factory.factorymethod;

import com.gupaoedu.vip.pattern.factory.ICourse;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new PythonCourseFactory();
        course = factory.create();
        course.record();
    }
}

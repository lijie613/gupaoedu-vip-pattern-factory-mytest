package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        INote note = factory.createNote();
        note.edit();

        IVedio vedio = factory.createVedio();
        vedio.record();
    }
}

package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class JavaCourseFactory implements CourseFactory {
    public INote createNote() {
        return new JavaNote();
    }

    public IVedio createVedio() {
        return new JavaVedio();
    }
}

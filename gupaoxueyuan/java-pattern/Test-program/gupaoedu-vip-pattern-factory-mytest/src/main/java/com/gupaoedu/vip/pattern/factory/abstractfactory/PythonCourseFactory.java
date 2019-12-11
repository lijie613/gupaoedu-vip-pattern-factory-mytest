package com.gupaoedu.vip.pattern.factory.abstractfactory;

public class PythonCourseFactory implements CourseFactory {
    public INote createNote() {
        return new PythonNote();
    }

    public IVedio createVedio() {
        return new PythonVedio();
    }
}

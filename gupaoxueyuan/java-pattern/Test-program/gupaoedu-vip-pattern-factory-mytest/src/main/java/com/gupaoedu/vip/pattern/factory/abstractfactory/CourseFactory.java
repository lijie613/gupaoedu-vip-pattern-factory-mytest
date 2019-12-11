package com.gupaoedu.vip.pattern.factory.abstractfactory;

/**
 * 指定所有可能创建的产品，这些所有产品称为产品族
 */
public interface CourseFactory {
    INote createNote();

    IVedio createVedio();
}

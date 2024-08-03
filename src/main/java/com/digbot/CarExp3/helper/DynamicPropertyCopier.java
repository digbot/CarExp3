package com.digbot.CarExp3.helper;
import java.lang.reflect.Method;

public class DynamicPropertyCopier {


    public static void copyIntProperties(Object source, Object target) {
        Class<?> sourceClass = source.getClass();
        Class<?> targetClass = target.getClass();

        Method[] methods = sourceClass.getMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("get") && method.getReturnType() == int.class) {
                try {
                    String propertyName = method.getName().substring(3);
                    int value = (int) method.invoke(source);

                    Method targetSetter = targetClass.getMethod("set" + propertyName, int.class);
                    targetSetter.invoke(target, value);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

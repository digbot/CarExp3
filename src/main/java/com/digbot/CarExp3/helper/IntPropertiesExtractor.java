package com.digbot.CarExp3.helper;

import java.lang.reflect.Field;

public class IntPropertiesExtractor {

    public static int sumIntProperties(Object obj) {
        int sum = 0;

        // Get all fields of the class, including inherited fields
        Class<?> clazz = obj.getClass();
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (field.getType() == int.class) {
                    field.setAccessible(true); // Make private fields accessible
                    try {
                        int value = field.getInt(obj);
                        sum += value;
                    } catch (IllegalAccessException e) {
                        // Handle exception if we cannot access the field's value
                        e.printStackTrace();
                    }
                }
            }
            clazz = clazz.getSuperclass(); // Move to superclass
        }

        return sum;
    }

}


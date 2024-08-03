package com.digbot.CarExp3.helper;
import java.lang.reflect.Field;


public class FieldAccumulator {

    public static int accumulateIntFields(Object obj) {
        int sum = 0;
        Class<?> clazz = obj.getClass();

        // Get all fields of the class
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            // Check if the field is of type int
            if (field.getType() == int.class) {
                field.setAccessible(true); // To access private fields
                try {
                    sum += field.getInt(obj); // Get the int value and add to sum
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return sum;
    }
}

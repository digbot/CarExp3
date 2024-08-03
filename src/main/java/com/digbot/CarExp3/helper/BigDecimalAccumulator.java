package com.digbot.CarExp3.helper;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class BigDecimalAccumulator {

    public static BigDecimal accumulateBigDecimals(Object obj) {
        BigDecimal sum = BigDecimal.ZERO;
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.getType().equals(BigDecimal.class)) {
                field.setAccessible(true); // Allow access to private fields
                try {
                    BigDecimal value = (BigDecimal) field.get(obj);
                    if (value != null) {
                        sum = sum.add(value);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return sum;
    }
}
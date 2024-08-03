package com.digbot.CarExp3.http.request;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ProfileRequestDTO {

    public static final String carAgeOld  = "old";
    public static final String carAgeMiddle = "age_middle";
    public static final String carAgeNew = "new";

    public static final String SizeSmall = "small";
    public static final String SizeMiddle = "middle";
    public static final String SizeLarge = "large";

    public static final String distanceLow = "10000";
    public static final String distanceMiddle  = "15000";
    public static final String distanceLong = "20000";

    public String age;
    public String size;
    public String distance;

    public ProfileRequestDTO(String age, String size, String distance) {
        this.age = age;
        this.size = size;
        this.distance = distance;
    }

    public ProfileRequestDTO() {

    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
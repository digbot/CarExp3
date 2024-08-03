package com.digbot.CarExp3.data;

import com.digbot.CarExp3.constant.Distance;

public class DistanceProfile extends SizeProfile {

    public DistanceProfile(String age, String size, String distance) {
        super(age, size, distance);

        switch (distance)  {
            case Distance.LONG:
                this.fuel = this.fuel * 4;
                System.out.println("Distance.LONG  %d" +  this.fuel );
                break;
            case Distance.MIDDLE:
                this.fuel = this.fuel * 2;
                System.out.println("Distance.MIDDLE  %d" +  this.fuel );
                break;
            default:
                System.out.println("Distance.DEF  %d" +  this.fuel );
                break;
        }
    }
}

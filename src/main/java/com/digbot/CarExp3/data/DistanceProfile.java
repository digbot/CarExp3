package com.digbot.CarExp3.data;

import com.digbot.CarExp3.constant.Distance;

public class DistanceProfile extends SizeProfile {

    /* Done */
    public DistanceProfile(String age, String size, String distance) {
        super(age, size, distance);

        switch (distance)  {
            case Distance.LONG:
                this.fuel = this.fuel * 4;
                this.maintenance =  this.maintenance * 4;
                this.clean = 100;
                this.accessories += 100;
                System.out.println("Distance.LONG  %d" +  this.fuel );
                break;
            case Distance.MIDDLE:
                this.fuel = this.fuel * 2;
                this.maintenance = this.maintenance * 2;
                this.clean += 50;
                this.accessories += 50;
                System.out.println("Distance.MIDDLE  %d" +  this.fuel );
                break;
            default:
                System.out.println("Distance.DEF  %d" +  this.fuel );
                /*
                this.ensuranceGra = 300;
                this.ensuranceKasko = 0;
                this.vinetka = 87;
                this.fee = 150;
                this.maintenance = 290;
                this.repair = 500;
                this.fuel = 1700;
                this.clean = 400;
                this.accessories = 100;
                this.others = 0;
                 */
                break;
        }
    }
}

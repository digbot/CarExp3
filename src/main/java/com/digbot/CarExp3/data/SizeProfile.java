package com.digbot.CarExp3.data;

import com.digbot.CarExp3.constant.Size;

public class SizeProfile extends AgeProfile {

    public SizeProfile(String age, String size, String distance) {
        super(age, size, distance);

        switch (size) {
            case Size.BIG:
                this.ensuranceGra += 500;
                this.ensuranceKasko += 2500;
                this.fee += 250;
                this.maintenance = 2000;
                this.repair += 1500;
                this.fuel += 2300;
                this.clean += 600;
                this.accessories += 100;
                this.others += 500;
                break;
            case Size.MIDDLE:
                this.ensuranceGra += 50;
                this.fee += 150;
                this.maintenance += 710;
                this.repair += 200;
                this.fuel += 1700;
                this.clean += 200;
                this.accessories += 50;
                this.others += 200;
                break;
            default:
                break;
        }
    }

}

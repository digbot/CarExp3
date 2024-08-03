package com.digbot.CarExp3.data;

import com.digbot.CarExp3.constant.Age;
import com.digbot.CarExp3.constant.Size;

public class SizeProfile extends AgeProfile {

    public SizeProfile(String age, String size, String distance) {
        super(age, size, distance);

        switch (size) {
            case Size.BIG:
                this.ensuranceGra = this.ensuranceGra + 500;
                this.ensuranceKasko = this.ensuranceKasko + 2500;
                break;
            case Size.MIDDLE:
                this.ensuranceKasko += 2000;
                this.maintenance = 100;
                break;
            default:
                break;
        }
    }

}

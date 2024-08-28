package com.digbot.CarExp3.data;

import com.digbot.CarExp3.constant.Age;
import com.digbot.CarExp3.constant.Size;

public class SizeProfile extends AgeProfile {

    /*
        Гражданска отговорност	800 лева
        Каско	2500 лева
        Винетка	87 лева
        Подръжка	290 лева
        Ремонти	500 лева
        Данък Мпс	150 лева
        Гориво	1700 лева*
        Почистване	120 лева*
        Аксесоари	100 лева*
        Други	50 лева*

     */
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
                this.ensuranceKasko += 2000;
                this.fee += 150;
                this.maintenance += 710;
                this.repair += 200;
                this.fuel += 1700;
                this.clean += 200;
                this.accessories += 50;
                this.others += 200;
                break;
            default:
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

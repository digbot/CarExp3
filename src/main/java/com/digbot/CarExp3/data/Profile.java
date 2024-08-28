package com.digbot.CarExp3.data;
import java.math.BigDecimal;

/*

Разходи за автомобил:	Пример:	Сметнете вашите разходи:
Гражданска отговорност	300лв.
Каско	520лв.
Данък Мпс	130лв.
Винетка	97лв.
Годишно обслужване	290лв.
Ремонти	500лв.
Гориво	1561лв.
Почистване	120лв.
Аксесоари	100лв.
Други	0лв.
Общо за година	3618лв.	0лв.
Месечен разход

@Entity
 */
public class Profile implements InterfaceProfile {
    protected int ensuranceGra;//= new BigDecimal("19.99");
    protected int ensuranceKasko;// = new BigDecimal("19.99");
    protected int vinetka;
    protected int maintenance;
    protected int repair;
    protected int fee;
    protected int fuel;
    protected int clean;
    protected int accessories;
    protected int others;

    protected String size;
    protected String distance;
    protected String age;

    public Profile(String age, String size, String distance) {
        this.age = age;
        this.size = size;
        this.distance = distance;

        this.initDate();
    }

    private void initDate() {
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
    }

    @Override
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getEnsuranceGra() {
        return ensuranceGra;
    }

    public void setEnsuranceGra(int ensuranceGra) {
        this.ensuranceGra = ensuranceGra;
    }

    public int getVinetka() {
        return vinetka;
    }

    public void setVinetka(int vinetka) {
        this.vinetka = vinetka;
    }

    public int getEnsuranceKasko() {
        return ensuranceKasko;
    }

    public void setEnsuranceKasko(int ensuranceKasko) {
        this.ensuranceKasko = ensuranceKasko;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getClean() {
        return clean;
    }

    public void setClean(int clean) {
        this.clean = clean;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getAccessories() {
        return accessories;
    }

    public void setAccessories(int accessories) {
        this.accessories = accessories;
    }

    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }
}
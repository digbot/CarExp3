package com.digbot.CarExp3.http.response;

import java.math.BigDecimal;

public class ProfileResponseDTO {
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
    protected int total;

    public ProfileResponseDTO() {
        this.ensuranceGra = ensuranceGra;
    }

    public int getEnsuranceGra() {
        return ensuranceGra;
    }

    public void setEnsuranceGra(int ensuranceGra) {
        this.ensuranceGra = ensuranceGra;
    }

    public int getEnsuranceKasko() {
        return ensuranceKasko;
    }

    public void setEnsuranceKasko(int ensuranceKasko) {
        this.ensuranceKasko = ensuranceKasko;
    }

    public int getVinetka() {
        return vinetka;
    }

    public void setVinetka(int vinetka) {
        this.vinetka = vinetka;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getRepair() {
        return repair;
    }

    public void setRepair(int repair) {
        this.repair = repair;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}

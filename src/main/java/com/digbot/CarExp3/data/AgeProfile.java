package com.digbot.CarExp3.data;
import com.digbot.CarExp3.constant.Age;


public class AgeProfile extends Profile {

    public AgeProfile(String age, String size, String distance) {
        super(age, size, distance);

        switch (age) {
            case Age.NEW:
                this.ensuranceGra = this.ensuranceGra + 500;
                this.ensuranceKasko = this.ensuranceKasko + 2500;
                break;
            case Age.FRESH:
                this.ensuranceKasko += 2000;
                this.maintenance -= 100;
                break;
            default:
                break;
        }
    }

    @Override
    public int getEnsuranceGra() {
        return super.getEnsuranceGra();
    }

    @Override
    public void setEnsuranceGra(int ensuranceGra) {
        super.setEnsuranceGra(ensuranceGra);
    }

    @Override
    public int getVinetka() {
        return super.getVinetka();
    }

    @Override
    public void setVinetka(int vinetka) {
        super.setVinetka(vinetka);
    }

    @Override
    public int getEnsuranceKasko() {
        return super.getEnsuranceKasko();
    }

    @Override
    public void setEnsuranceKasko(int ensuranceKasko) {
        super.setEnsuranceKasko(ensuranceKasko);
    }

    @Override
    public int getMaintenance() {
        return super.getMaintenance();
    }

    @Override
    public void setMaintenance(int maintenance) {
        super.setMaintenance(maintenance);
    }

    @Override
    public int getRepair() {
        return super.getRepair();
    }

    @Override
    public void setRepair(int repair) {
        super.setRepair(repair);
    }

    @Override
    public int getFee() {
        return super.getFee();
    }

    @Override
    public void setFee(int fee) {
        super.setFee(fee);
    }

    @Override
    public int getClean() {
        return super.getClean();
    }

    @Override
    public void setClean(int clean) {
        super.setClean(clean);
    }

    @Override
    public int getFuel() {
        return super.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        super.setFuel(fuel);
    }

    @Override
    public int getAccessories() {
        return super.getAccessories();
    }

    @Override
    public void setAccessories(int accessories) {
        super.setAccessories(accessories);
    }

    @Override
    public int getOthers() {
        return super.getOthers();
    }

    @Override
    public void setOthers(int others) {
        super.setOthers(others);
    }
}

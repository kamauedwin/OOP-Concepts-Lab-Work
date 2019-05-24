package oop2_conceptslab_work_056868;

import java.util.*;

abstract class Vehicle {
    double fees;
    double rate;
    double tonnage; 
    int capacity;
    String manuf; 
    String purpose;
    String craft;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getManuf() {
        return manuf;
    }

    public void setManuf(String manuf) {
        this.manuf = manuf;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCraft() {
        return craft;
    }

    public void setCraft(String craft) {
        this.craft = craft;
    }
    
   
    public enum MEDIUM {
        LAND, AIR, WATER;
    }
    
    public enum PURPOSE {
        CARGO, PASSENGER;
    }
    public enum CRAFT {
        BUS, MACHINERY, AEROPLANE, DHOW, FERRY, SHIP, CAR;
    }
    
    abstract public String DeterminePurpose(PURPOSE purpose);
    abstract public String DetermineCraft();
    abstract public double calculateFees(); 
    
}

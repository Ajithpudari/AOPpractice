package com.example.crudspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

    @Id
    private long mobileId;
    private String mobileName;
    private double mobilePrice;

    @Override
    public String toString() {
        return "Mobile{" +
                "mobileId=" + mobileId +
                ", mobileName='" + mobileName + '\'' +
                ", mobilePrice=" + mobilePrice +
                '}';
    }

    public long getMobileId() {
        return mobileId;
    }

    public void setMobileId(long mobileId) {
        this.mobileId = mobileId;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public double getMobilePrice() {
        return mobilePrice;
    }

    public void setMobilePrice(double mobilePrice) {
        this.mobilePrice = mobilePrice;
    }

    public Mobile() {
    }

    public Mobile(long mobileId, String mobileName, double mobilePrice) {
        this.mobileId = mobileId;
        this.mobileName = mobileName;
        this.mobilePrice = mobilePrice;
    }
}

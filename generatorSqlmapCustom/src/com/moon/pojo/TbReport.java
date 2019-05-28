package com.moon.pojo;

public class TbReport {
    private Long id;

    private String number;

    private String tradeTime;

    private Float powerVal;

    private Float envirTemp;

    private Float motorAngle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime == null ? null : tradeTime.trim();
    }

    public Float getPowerVal() {
        return powerVal;
    }

    public void setPowerVal(Float powerVal) {
        this.powerVal = powerVal;
    }

    public Float getEnvirTemp() {
        return envirTemp;
    }

    public void setEnvirTemp(Float envirTemp) {
        this.envirTemp = envirTemp;
    }

    public Float getMotorAngle() {
        return motorAngle;
    }

    public void setMotorAngle(Float motorAngle) {
        this.motorAngle = motorAngle;
    }
}
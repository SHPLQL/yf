package com.yfdyf.recommend.entity.bean;

import java.util.Date;

public class AcceptCard {
    private String uuid;

    private String personId;

    private Date tima;

    private String integral;

    private String num;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public Date getTima() {
        return tima;
    }

    public void setTima(Date tima) {
        this.tima = tima;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral == null ? null : integral.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }
}
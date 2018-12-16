/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.tms.models;

import java.util.Date;

/**
 *
 * @author Nadun Shyn
 */
public class Contribute {
    private int id;
    private int targetId;
    private Date date;
    private double amount;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the targetId
     */
    public int getTargetId() {
        return targetId;
    }

    /**
     * @param targetId the targetId to set
     */
    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    
    
    
    
}

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
public class Target {
    
    private int id;
    private String name;
    private Date targetDate;
    private double amount;
    private Date createdDate;
    private boolean completed;
    private boolean cancelled;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        if(name.contains("Girl Friend")){
            name = name.replace("Girl Friend", "Friend");   //Info Hiding
        }
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    /**
     * @return the targetDate
     */
    public Date getTargetDate() {
        return targetDate;
    }

    /**
     * @param targetDate the targetDate to set
     */
    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
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
        if(amount>0) {  //Data Validations
            this.amount = amount;
        }
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * @return the cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    
    
    
}

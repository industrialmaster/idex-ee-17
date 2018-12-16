/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.factory;

/**
 *
 * @author Nadun Shyn
 */
abstract public class Bill {
    
    abstract double getRate();
    
    public double getAmount(int start , int end){
        return getRate()  * (end - start);
    }
}

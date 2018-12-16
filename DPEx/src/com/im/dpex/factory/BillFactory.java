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
public class BillFactory {
    public static Bill createBill(String type){
        switch(type){
            case "DOMESTIC": return new DomesticBill();
            case "BUSINESS": return new BusinessBill();
            case "INDUSTRY": return new IndustryBill();
            default: return null;
        }
    }
}

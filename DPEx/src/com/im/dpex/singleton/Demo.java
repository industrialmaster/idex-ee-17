/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.singleton;

/**
 *
 * @author Nadun Shyn
 */
public class Demo {
    public static void main(String[] args) {
        //Singleton Pattern
        
        Wife w1 = Wife.getInstance();   
        w1.setName("Juliot");
        
        Wife w2 = Wife.getInstance();
        w2.setName("Seetha");
        
        System.out.println("W1 = "+w1.getName());
        System.out.println("W2 = "+w2.getName());
    }
}

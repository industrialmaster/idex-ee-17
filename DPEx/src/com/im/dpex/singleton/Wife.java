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
public class Wife {
    private static Wife wife;
    private String name;
    
    private Wife(){ 
        //Cannot Instantiate an Object outside the class
        
    }
    
    public static Wife getInstance(){
        if(wife == null){
            wife = new Wife();
        }
        return wife;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}

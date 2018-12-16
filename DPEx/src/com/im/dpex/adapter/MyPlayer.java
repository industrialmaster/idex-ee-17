/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.adapter;

/**
 *
 * @author Nadun Shyn
 */
public class MyPlayer implements CommonPlayer{

    @Override
    public void play(String type, String name) {
        if(type.equals("mp3")){
            System.out.println("Playing - MyPLayer "+name);
        }else{
            new PlayerAdapter(type).play(type, name);
        }
    }
    
}

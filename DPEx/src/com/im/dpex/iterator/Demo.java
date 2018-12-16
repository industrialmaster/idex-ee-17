/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.iterator;

/**
 *
 * @author Nadun Shyn
 */
public class Demo {
    public static void main(String[] args) {
        Students students = new Students();
        Iterator it = students.getIterator();
        while(it.hasNext()){
            String name = (String)it.next();
            System.out.println("S = "+name);
        }
    }
}

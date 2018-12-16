/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.dpex.iterator;
 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nadun Shyn
 */
public class Students implements  Container{

    List<String> names = new ArrayList<String>();
    
    public Students(){
        names.add("Amila");
        names.add("Sameera");
        names.add("Avishka");
        names.add("Sudesh");
        names.add("Himawath");
    }
    
    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }
    
    private class StudentIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            if(index < names.size()){
                return true;
            }else{
                return false;
            }
        }
        @Override
        public Object next() {
            if(this.hasNext()){
                return names.get(index++);
            }else{
                return null;
            }
        }
        
    }
    
    
    
}

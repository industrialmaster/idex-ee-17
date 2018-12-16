/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.tms.controls;

import com.im.tms.db.DB;
import com.im.tms.models.Target;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadun Shyn
 */
public class TargetController {
    
    public static boolean create(Target target){
        try {
            
            String sql = "INSERT INTO target "+
                    " (name, target_date,amount, created_date, completed, cancelled) "+
                    " VALUES (?,?,?,now(),'0','0')";
            
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            ps.setString(1, target.getName());
            Date sqlDate = new Date(target.getTargetDate().getTime());
            ps.setDate(2, sqlDate);
            ps.setDouble(3, target.getAmount());
            ps.executeUpdate();
            
            return true;
           
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static List<Target> getAll(){
        List<Target> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM target";
            
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                Target target = new Target();
                target.setId(rs.getInt("id"));
                target.setName(rs.getString("name"));
                target.setTargetDate(rs.getDate("target_date"));
                target.setAmount(rs.getDouble("amount"));
                target.setCreatedDate(rs.getDate("created_date"));
                target.setCompleted(rs.getBoolean("completed"));
                target.setCancelled(rs.getBoolean("cancelled"));
                
                list.add(target);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static Target get(int id){
        Target target = new Target();
        try {
            String sql = "SELECT * FROM target WHERE id=?";
            
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                target.setId(rs.getInt("id"));
                target.setName(rs.getString("name"));
                target.setTargetDate(rs.getDate("target_date"));
                target.setAmount(rs.getDouble("amount"));
                target.setCreatedDate(rs.getDate("created_date"));
                target.setCompleted(rs.getBoolean("completed"));
                target.setCancelled(rs.getBoolean("cancelled"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return target;
    }
    
     public static boolean update(Target target){
        try {
            
            String sql = "UPDATE target SET "+
                    " name=?, target_date=?, amount=? "+
                    " WHERE id=?";
            
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            ps.setString(1, target.getName());
            Date sqlDate = new Date(target.getTargetDate().getTime());
            ps.setDate(2, sqlDate);
            ps.setDouble(3, target.getAmount());
            ps.setInt(4, target.getId());
            ps.executeUpdate();
            
            return true;
           
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
     
     public static boolean delete(Target target){
        try {
            
            String sql = "DELETE FROM target "+
                    " WHERE id=?";
            
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            
            ps.setInt(1, target.getId());
            ps.executeUpdate();
            
            return true;
           
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}

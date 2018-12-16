/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.tms.controls;

import com.im.tms.db.DB;
import com.im.tms.models.Contribute;
import com.im.tms.models.Target;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nadun Shyn
 */
public class ContributeController {
    public static boolean create(Contribute contribute){
        try {
            
            String sql = "INSERT INTO contribution "+
                    " (target_id, date, amount, cancelled) "+
                    " VALUES (?,?,?,'0')";
            
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            ps.setInt(1, contribute.getTargetId());
            Date sqlDate = new Date(contribute.getDate().getTime());
            ps.setDate(2, sqlDate);
            ps.setDouble(3, contribute.getAmount());
            ps.executeUpdate();
            
            return true;
           
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static List<Contribute> getAll(){
        List<Contribute> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM contribution";
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Contribute contribute = new Contribute();
                contribute.setId(rs.getInt("id"));
                contribute.setTargetId(rs.getInt("target_id"));
                contribute.setDate(rs.getDate("date"));
                contribute.setAmount(rs.getDouble("amount"));
                list.add(contribute);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    public static Contribute get(int id){
        Contribute contribute = new Contribute();
        try {
            String sql = "SELECT * FROM contribution WHERE id=?";
            Connection con = DB.getInstance().getCon();
            PreparedStatement ps  = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                contribute.setId(rs.getInt("id"));
                contribute.setTargetId(rs.getInt("target_id"));
                contribute.setDate(rs.getDate("date"));
                contribute.setAmount(rs.getDouble("amount"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contribute;
    }
}

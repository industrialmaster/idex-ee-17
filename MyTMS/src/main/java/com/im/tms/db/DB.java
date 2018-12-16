/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.im.tms.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nadun Shyn
 */
public class DB {
    
    static Connection con = null;
    
    private DB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "0147");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static DB db;
    
    static String url = "jdbc:mysql://localhost:3306/dbtarget";
    
    
    
    public static DB getInstance(){
        if(db == null){
            db = new DB();
        }
        return db;
    }
    
    public Connection getCon(){
        return con;
    }
    
}

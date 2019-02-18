package com.coderbd.service;

import com.coderbd.connection.DblConnection;
import com.coderbd.pojo.Students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentsService implements CommonDAO {

    static Connection con = DblConnection.getDbCon();

    @Override
    public void save(Students obj) {
        String sql = "insert into student(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.executeUpdate();
            System.out.println("Data inserted successfully");
        } catch (SQLException ex) {
            Logger.getLogger(StudentsService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Object obj) {
       String sql = "update student set name=? where id =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getById(int id) {
       String sql = "select * from students where id=?";
       Students student = null;
       
    }

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

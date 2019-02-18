
package com.coderbd.createTable;

import com.coderbd.connection.DblConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateStudentsTable {
   static Connection con=DblConnection.getDbCon();
    
    public static void createStudentsTable(){
    String sql = "create table students(id int(11) primary key auto_incremet, name varchar(50) not null)";
    
        try {
         PreparedStatement ps = con.prepareStatement(sql);
         ps.execute();
            System.out.println("Students Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(CreateStudentsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}

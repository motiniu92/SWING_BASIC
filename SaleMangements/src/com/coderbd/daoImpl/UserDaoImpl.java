package com.coderbd.daoImpl;

import com.coderbd.DatabaseTool;
import com.coderbd.conn.CustomDBConnection;
import com.coderbd.dao.RoleDao;
import com.coderbd.dao.UserDao;
import com.coderbd.pojo.Role;
import com.coderbd.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDaoImpl implements UserDao {

    Connection connection = CustomDBConnection.getDBConnection();

    @Override
    public void createTable() {
        String sql = "create table IF NOT EXISTS user(id int(11) auto_increment primary key, full_name varchar(50) unique, password varchar(30), mobile_no varchar(14), role_id int(2), FOREIGN KEY(role_id) REFERENCES role(id))";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Created!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(User user) {
        String sql = "insert into user(full_name,user_name,password, mobile_no,role_id)"
                + " values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, user.getFullName());
            pstm.setString(2, user.getUser());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getMobile());
          //  pstm.setString(5, user.getRole());
            pstm.executeUpdate();
            System.out.println("Insert success!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getUserById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getUserByUserName(String roleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /* public List<Role> getRoles() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

   // @Override
    //public void save(User user) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

   /* @Override
    public void update(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    //@Override
    //public Role getUserById(int id) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

   /* @Override
    public Role getUserByUserName(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    @Override
    public List<User> getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

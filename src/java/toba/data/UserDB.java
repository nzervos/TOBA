package toba.data;

import java.sql.*;
import toba.business.User;

public class UserDB {
    
    public static int insert(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        
        String query
                = "INSERT INTO User (firstName, lastName, phone, address, city, "
                + "state, zip, email, userName, password"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getlastName());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getAddress());
            ps.setString(5, user.getCity());
            ps.setString(6, user.getState());
            ps.setString(7, user.getZip());
            ps.setString(8, user.getEmail());
            ps.setString(9, user.getUserName());
            ps.setString(10, user.getPassword());
            return ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } 
    }
    
    public static int updatePassword(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        
        String query
                = "Update User SET "
                + "password = ? "
                + "WHERE username = ? ";
        try {
            ps = connection.prepareStatement(query);
            
            ps.setString(9, user.getPassword());
            ps.setString(10, user.getUserName());
            return ps.executeUpdate();            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
      
        public static User selectUser(String username) {
            ConnectionPool pool = ConnectionPool.getInstance();
            Connection connection = pool.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            String query = "SELECT * From User "
                    + "WHERE username = ?";
            try {
                ps = connection.prepareStatement(query);
                ps.setString(1, username);
                rs = ps.executeQuery();
                User user = null;
                if (rs.next()) {
                    user = new User();
                    user.setFirstName(rs.getString("FirstName"));
                    user.setLastName(rs.getString("LastName"));
                    user.setPhone(rs.getString("Phone"));
                    user.setAddress(rs.getString("Address"));
                    user.setCity(rs.getString("City"));
                    user.setState(rs.getString("State"));
                    user.setZip(rs.getString("Zip"));
                    user.setEmail(rs.getString("Email"));
                    user.setUserName(rs.getString("UserName"));
                    user.setPassword(rs.getString("Password"));
                }
                return user;
            } catch (SQLException e) {
                System.out.println(e);
                return null;
            }
        }

}

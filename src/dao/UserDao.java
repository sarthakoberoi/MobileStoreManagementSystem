package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

public class UserDao {

    public static void save(User user) {
        LocalDate date = LocalDate.now();

        String userTable = "insert into user ("
                + "email,password,firstname,lastname,dob,address,mobile,approved,since) "
                + "values("
                + "'" + user.getEmail() + "',"
                + "'" + user.getPassword() + "',"
                + "'" + user.getFname() + "',"
                + "'" + user.getLname() + "',"
                + "'" + user.getDob() + "',"
                + "'" + user.getAddress() + "',"
                + "'" + user.getMobile() + "',"
                + "'false',"
                + "'" + date + "');";

        DbOperations.setDateOrDelete(userTable, "Data Stored Successfully!, Wait for admin's approval");
    }

    public static User login(String email, String password) {
        User user = new User();
        try {
            ResultSet rs = DbOperations.getData(" select * from user where email= '" + email + "' ");
            while (rs.next()) {
                user.setApproved(rs.getString("approved"));
                user.setFname(rs.getString("firstname"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static void changePassword(String email, String newPassword) {
        try {
            String query = "update user set password ='" + newPassword + "' where email='" + email + "';";
            DbOperations.setDateOrDelete(query, "Password changed successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void deleteUser(String email, String password) {
        String query = "delete from user where email = '" + email + "' and password = '" + password + "'; ";
        DbOperations.setDateOrDelete(query, "User deleted successfully");
    }

    public static void updateStatus(String email, String status) {
        String query = "update user set approved = '" + status + "' where email='" + email + "';";
        DbOperations.setDateOrDelete(query, "Status updated successfully!");
    }

    public static int getId(String email) {
        int id = 0;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email like '%" + email + "%'");
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return id;
    }

    public static ArrayList<User> getAllUserRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from user where email like '%" + email + "%' and approved='true';");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFname(rs.getString("firstname"));
                user.setLname(rs.getString("lastname"));
                user.setDob(rs.getString("dob"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setApproved(rs.getString("approved"));
                user.setSince(rs.getString("since"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from user where email like '%" + email + "%';");
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFname(rs.getString("firstname"));
                user.setLname(rs.getString("lastname"));
                user.setDob(rs.getString("dob"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setMobile(rs.getString("mobile"));
                user.setApproved(rs.getString("approved"));
                user.setSince(rs.getString("since"));
                arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}

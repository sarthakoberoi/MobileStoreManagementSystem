package dao;

import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        try {

            String userTable = "create table user(id int auto_increment primary key, password varchar(200), firstname varchar(50), lastname varchar(50), dob date, address varchar(500), email varchar(100), mobile varchar(15), since date, approved varchar(5), approvedby varchar(50), unique(email));";
            DbOperations.setDateOrDelete(userTable, "User Table Created!");

            String adminDetails = "insert into user(email,password,firstname,approved) values('admin@msms.com', 'pass', 'admin', 'true' );";
            DbOperations.setDateOrDelete(adminDetails, "Admin Details Saved");

            String CategoryTable = "create table category (id int AUTO_INCREMENT primary key, name varchar(200));";
            DbOperations.setDateOrDelete(CategoryTable, "Category Table Created!");
            
            String ItemTable = "create table item (id int auto_increment primary key, category varchar(100), brand varchar(100), modelnumber varchar(100), modelname varchar(100), variant varchar(100), imei varchar(100) unique, price int(10));";
            DbOperations.setDateOrDelete(ItemTable, "Item Table Created!");
            
            String OrderHistory = "create table bills (billno int, cname varchar(200) not null, cemail varchar(200) not null, cmobile varchar(200) not null,itemid varchar(100), category varchar(100), brand varchar(100), modelnumber varchar(100), modelname varchar(100), variant varchar(100), imei varchar(100) unique, price int(10), soldby int, soldon date);";
            DbOperations.setDateOrDelete(OrderHistory, "History Table Created!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

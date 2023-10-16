package dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bills;
import model.User;

public class HistoryDao {

    public static String getBillno() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(billno) from bills");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return String.valueOf(id);
    }

    public static void save(Bills bill) {
        LocalDate date = LocalDate.now();
        String query = "insert into bills values('" + bill.getBillno() + "','" + bill.getCustomername() + "','" + bill.getCustomeremail() + "','" + bill.getCustomermobile() + "','" + bill.getItemid() + "','" + bill.getCategory() + "','" + bill.getBrand() + "','" + bill.getModelnumber() + "','" + bill.getModelname() + "','" + bill.getVariant() + "','" + bill.getImei() + "','" + bill.getPrice() + "','" + bill.getSellerid() + "','"+date+"');";
        DbOperations.setDateOrDelete(query, "Item: "+bill.getModelname()+" Sold to: "+bill.getCustomername()+" Successfully");
    }
    
    public static void getTotalSales(String id) {
        String query = "";
    }

    public static ArrayList<Bills> getAllRecords(String id) {
        ArrayList<Bills> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from bills where billno like '%" + id + "%';");
            while (rs.next()) {
                Bills orders = new Bills();
                orders.setBillno(rs.getInt("billno"));
                orders.setCustomername(rs.getString("cname"));
                orders.setCustomeremail(rs.getString("cemail"));
                orders.setCustomermobile(rs.getString("cmobile"));
                orders.setItemid(rs.getInt("itemid"));
                orders.setCategory(rs.getString("category"));
                orders.setBrand(rs.getString("brand"));
                orders.setModelnumber(rs.getString("modelnumber"));
                orders.setModelname(rs.getString("modelname"));
                orders.setVariant(rs.getString("variant"));
                orders.setImei(rs.getString("imei"));
                orders.setPrice(rs.getInt("price"));
                orders.setSellerid(rs.getInt("soldby"));
                orders.setSoldon(rs.getString("soldon"));
                arrayList.add(orders);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}

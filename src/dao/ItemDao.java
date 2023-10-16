package dao;

import com.mysql.cj.protocol.Resultset;
import java.util.*;
import javax.swing.JOptionPane;
import model.Item;
import java.sql.*;

public class ItemDao {

    public static void save(Item item) {
        String query = "insert into item (category, brand, modelnumber, modelname, variant, imei, price) values ('" + item.getCategory() + "','" + item.getBrand() + "','" + item.getModelnumber() + "','" + item.getModelname() + "','" + item.getVariant() + "','" + item.getImei() + "','" + item.getPrice() + "');";
        DbOperations.setDateOrDelete(query, "Item added to inventory!");
    }

    public static ArrayList<Item> getAllRecords() {
        ArrayList<Item> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from item;");
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setCategory(rs.getString("category"));
                item.setBrand(rs.getString("brand"));
                item.setModelname(rs.getString("modelname"));
                item.setModelnumber(rs.getString("modelnumber"));
                item.setVariant(rs.getString("variant"));
                item.setImei(rs.getString("imei"));
                item.setPrice(rs.getInt("price"));
                arrayList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Item> SearchRecord(String name) {
        ArrayList<Item> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from item where modelname like '%"+name+"%';");
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setCategory(rs.getString("category"));
                item.setBrand(rs.getString("brand"));
                item.setModelname(rs.getString("modelname"));
                item.setModelnumber(rs.getString("modelnumber"));
                item.setVariant(rs.getString("variant"));
                item.setImei(rs.getString("imei"));
                item.setPrice(rs.getInt("price"));
                arrayList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void update(Item item) {
        String query = "update item set category='" + item.getCategory() + "',brand='" + item.getBrand() + "',modelname='" + item.getModelname() + "',modelnumber='" + item.getModelnumber() + "',variant='" + item.getVariant() + "', price='" + item.getPrice() + "', imei='" + item.getImei() + "' where id='" + item.getId() + "';";
        DbOperations.setDateOrDelete(query, "Inventory updated successfully!");
    }

    public static void delete(int id) {
        String query = "delete from item where id='" + id + "'";
        DbOperations.setDateOrDelete(query, "Records Updated Successfully");
    }

    public static ArrayList<Item> getAllRecordsByCategory(String category) {
        ArrayList<Item> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from item where category='" + category + "'");
            while (rs.next()) {
                Item item = new Item();
                item.setModelname(rs.getString("modelname"));
                item.setVariant(rs.getString("variant"));
                item.setId(rs.getInt("id"));
                arrayList.add(item);
            }
        } catch (Exception e) {

        }
        return arrayList;
    }

    public static ArrayList<Item> filterItemByName(String name, String category) {
        ArrayList<Item> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from item where modelname like '%" + name + "%' and category='" + category + "'");
            while (rs.next()) {
                Item item = new Item();
                item.setModelname(rs.getString("modelname"));
                item.setVariant(rs.getString("variant"));
                item.setId(rs.getInt("id"));
                arrayList.add(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static Item getItemInfo(int id) {
        Item item = new Item();

        try {
            ResultSet rs = DbOperations.getData("select * from item where id='" + id + "';");
            while (rs.next()) {
                item.setId(rs.getInt("id"));
                item.setCategory(rs.getString("category"));
                item.setBrand(rs.getString("brand"));
                item.setModelname(rs.getString("modelname"));
                item.setModelnumber(rs.getString("modelnumber"));
                item.setVariant(rs.getString("variant"));
                item.setImei(rs.getString("imei"));
                item.setPrice(rs.getInt("price"));
            }
        } catch (Exception e) {

        }

        return item;
    }

    public static Item checkImei(String imei) {
        Item item = new Item();

        try {
            ResultSet rs = DbOperations.getData("Select * from where id='" + imei + "';");
            while (rs.next()) {
                item.setImei(rs.getString("imei"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return item;
    }

//    public static Item getItemInfo(String ItemId) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
}

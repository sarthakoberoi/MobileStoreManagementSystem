package model;

public class Bills {
    private int billno;
    private int itemid;
    private int sellerid; //soldby
    private String customername;
    private String customeremail;
    private String customermobile;
    private String category;
    private String brand;
    private String modelnumber;
    private String modelname;
    private String variant;
    private String imei;
    private int price;
    private String soldon;

    public int getBillno() {
        return billno;
    }

    public String getSoldon() {
        return soldon;
    }

    public void setSoldon(String soldon) {
        this.soldon = soldon;
    }

    public void setBillno(int billno) {
        this.billno = billno;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public String getCustomermobile() {
        return customermobile;
    }

    public void setCustomermobile(String customermodile) {
        this.customermobile = customermodile;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(String modelnumber) {
        this.modelnumber = modelnumber;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

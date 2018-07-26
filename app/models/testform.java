package models;

/**
 * Created by Admin on 25/7/2561.
 */
public class testform {
    private String Tid,Tname,Tbrand,Tdetail;
    private Double Tprice;
    private int tamount;

    public testform() {
    }

    public testform(String tid, String tname, String tbrand, String tdetail, Double tprice, int tamount) {
        Tid = tid;
        Tname = tname;
        Tbrand = tbrand;
        Tdetail = tdetail;
        Tprice = tprice;
        tamount = tamount;
    }

    public String getTid() {
        return Tid;
    }

    public void setTid(String tid) {
        Tid = tid;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public String getTbrand() {
        return Tbrand;
    }

    public void setTbrand(String tbrand) {
        Tbrand = tbrand;
    }

    public String getTdetail() {
        return Tdetail;
    }

    public void setTdetail(String tdetail) {
        Tdetail = tdetail;
    }

    public Double getTprice() {
        return Tprice;
    }

    public void setTprice(Double tprice) {
        Tprice = tprice;
    }

    public int getPamount() {
        return tamount;
    }

    public void setPamount(int pamount) {
        tamount = pamount;
    }
}


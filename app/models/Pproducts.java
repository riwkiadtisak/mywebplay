package models;

/**
 * Created by Admin on 12/7/2561.
 */
public class Pproducts {
    private String Pid,Pname,Pbrand,Pdetail;
    private Double Pprice,total;
    private int Pamount,balanc;

    public Pproducts() {
    }

    public Pproducts(String pid, String pname, String pbrand, String pdetail, Double pprice, int pamount) {
        Pid = pid;
        Pname = pname;
        Pbrand = pbrand;
        Pdetail = pdetail;
        Pprice = pprice;
        Pamount = pamount;
    }

    public String getPid() {
        return Pid;
    }

    public void setPid(String pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPbrand() {
        return Pbrand;
    }

    public void setPbrand(String pbrand) {
        Pbrand = pbrand;
    }

    public String getPdetail() {
        return Pdetail;
    }

    public void setPdetail(String pdetail) {
        Pdetail = pdetail;
    }

    public Double getPprice() {
        return Pprice;
    }

    public void setPprice(Double pprice) {
        Pprice = pprice;
    }


    public int getPamount() {
        return Pamount;
    }

    public void setPamount(int pamount) {
        Pamount = pamount;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}

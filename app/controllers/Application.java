package controllers;

import models.Pproducts;
import models.testform;
import play.*;
import play.api.data.Form;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.mvc.*;
import views.html.*;

import javax.swing.text.html.HTML;
import java.text.Normalizer;

public class Application extends Controller {
    //formnew
    public  static testform book;
    public static play.data.Form<testform> bookForm= play.data.Form.form(testform.class);
    public  static Result book_form_helper(){
        bookForm= play.data.Form.form(testform.class);
        return main(newform.render(bookForm));
    }
    public static Result book_post_helper(){
        play.data.Form<testform> newforms = bookForm.bindFromRequest();
        if (newforms.hasErrors()){
            return main(newform.render(newforms));
        }else {
            book = newforms.get();
            return main(newshowfrom.render(book));
        }
    }
    //stop
    public static Result main(Html content){
        return ok(main.render(content));
    }

    public static Result index() {

        Pproducts Pr1 = new Pproducts("P001","NARUTO","NARUTO","นารูโตะ เสื้อคลุมขาว มีกล่องสูง 17.5 ซม.",750.00,5);
        Pproducts Pr2 = new Pproducts("P002","Roronoa Zoro","Onepiece","ONE PIECE Roronoa Zoro BIG Size Figure\n" +
                "                    ขนาด 30 ซม. มีฉากหลัง",2200.00,15);
        Pproducts Pr3 = new Pproducts("P003","Dragon Ball Z","Dragon Ball Z","Grandista Resolution of Soldiers\n" +
                "                    Height    28 cm ",950.00,10);
        Pproducts Pr4 = new Pproducts("P004","BLACK PANTHER","Marvel","โมเดล black panther: crazy toys สูง 12 นิ้วตั้งโชว์",1119.00,5);
        Pproducts Pr5 = new Pproducts("P005","โมเดล ทอร์ ธอร์ เทพเจ้าสายฟ้า","Marvel","ผลิดจาก PVC ความสูง 16 cm.",899.00,12);
        Pproducts Pr6 = new Pproducts("P006","เดดพูล จูเนียร์ เนนโดรอยด์","Marvel","ผลิดจาก PVC ความสูง 4\"",799.00,5);

        return main(Products.render(Pr1,Pr2,Pr3,Pr4,Pr5,Pr6));
    }

    public static Result Onepiece(){
        Pproducts On1 = new Pproducts("O001","Aes","Onepiece","รายละเอียด",3100.00,5);
        Pproducts On2 = new Pproducts("O002","Monkey D Luffy","Onepiece","รายละเอียด",1600.00,15);
        Pproducts On3 = new Pproducts("O003","Monkey D. Luffy & Trafalgar","Onepiece","รายละเอียด",3200.00,10);
        Pproducts On4 = new Pproducts("O004","ลูฟี่เกียร์ 3 หมัดปืนช้าง","Onepiece","รายละเอียด",550.00,5);
        Pproducts On5 = new Pproducts("O005","ครบ20ปีวันพีช ชุดLimited","Onepiece","รายละเอียด",1050.00,12);
        Pproducts On6 = new Pproducts("O006","ฟี่เกียร์ 4 ","Onepiece","รายละเอียด",990.00,5);

        return main(views.html.Onepiece.render(On1,On2,On3,On4,On5,On6));
    }

    public static Result Marvel(){

        Pproducts M1 = new Pproducts("M001","BLACK PANTHER","Marvel","รายละเอียด",1119.00,5);
        Pproducts M2 = new Pproducts("M002","แอนท์ แมน (เปลี่ยนท่าได้","Marvel","รายละเอียด",1299.00,15);
        Pproducts M3 = new Pproducts("M003","Iron Man Mark 7(งาน mirror)","Marvel","ผลิดจาก PVC ความสูง 16 cm.",1300.00,10);
        Pproducts M4 = new Pproducts("M004","Captain America (งาน mirror)","Marvel","ผลิดจาก PVC ความสูง 15 cm.",899.00,5);
        Pproducts M5 = new Pproducts("M005","โมเดล ทอร์ ธอร์ เทพเจ้าสายฟ้า","Marvel","ผลิดจาก PVC ความสูง 16 cm.",899.00,12);
        Pproducts M6 = new Pproducts("M006","ฟเดดพูล จูเนียร์ เนนโดรอยด์","Marvel","ผลิดจาก PVC ความสูง 4 นิ้ว",799.00,5);

        return main(Marvel.render(M1,M2,M3,M4,M5,M6));
    }

    public static Result Fairytail(){

        Pproducts F1 = new Pproducts("F001","เอลซ่า XPLUS","Fairytail","รายละเอียด",1050.00,5);
        Pproducts F2 = new Pproducts("F002","เกร ฟูบัสเตอร์","Fairytail","รายละเอียด",1150.00,15);
        Pproducts F3 = new Pproducts("F003","นัตสึ","Fairytail","รายละเอียด",23200.00,10);
        Pproducts F4 = new Pproducts("F004","เอลซ่า","Fairytail","รายละเอียด",14000.00,5);
        Pproducts F5 = new Pproducts("F005","มิราเจน","Fairytail","รายละเอียด",13690.00,12);
        Pproducts F6 = new Pproducts("F006","กาซิล","Fairytail","รายละเอียด",17500.00,5);

        return main(Fairytail.render(F1,F2,F3,F4,F5,F6));
    }

    public static Result Dragonball(){

        Pproducts D1 = new Pproducts("M001","DB SUPER FIGURE-FINAL HOPE SLASH","Dargonball","รายละเอียด",1250.00,5);
        Pproducts D2 = new Pproducts("M002","SUPER DB HEROES ANNIVERSARY-1","Dargonball","รายละเอียด",675.00,15);
        Pproducts D3 = new Pproducts("M003","SUPER DB HEROES DXF-7TH ANNIVERSARY-VOL1","Dargonball","รายละเอียด",675.00,10);
        Pproducts D4 = new Pproducts("M004","DB SUPER SON GOKU FES!! VOL3","Dargonball","รายละเอียด",675.00,5);
        Pproducts D5 = new Pproducts("M005","DB GT SCULTURES BIG FIGURE","Dargonball","รายละเอียด",675.00,12);
        Pproducts D6 = new Pproducts("M006","DB Z SON GOKU KA-ME-HA-ME-HA","Dargonball","รายละเอียด",895.00,5);

        return main(Dragonball.render(D1,D2,D3,D4,D5,D6));
    }

    public static Result Bleach() {

        Pproducts B1 = new Pproducts("B001","BLEACH บีทเทพมรณะ","Bleach","รายละเอียด",1800.00,5);
        Pproducts B3 = new Pproducts("B002","อิจิโกะ","Bleach","รายละเอียด",1700.00,15);
        Pproducts B2 = new Pproducts("B003","ไอเซ็น","Bleach","รายละเอียด",5000.00,10);
        Pproducts B4 = new Pproducts("B004","อาบาไร เรนจิ","Bleach","รายละเอียด",7500.00,5);
        Pproducts B5 = new Pproducts("B005","เบียคุยะ","Bleach","รายละเอียด",8000.00,12);
        Pproducts B6 = new Pproducts("B006","อุราฮาระคิสิเกะ","Bleach","รายละเอียด",8000.00,5);

        return main(Bleach.render(B1,B2,B3,B4,B5,B6));
    }

    public static Result promotion() {
        return main(promotion.render());
    }

    public static Result Adm() {return main(Admins.render());}

    public static Result testform() {
        return main(views.html.testform.render());
    }

    public static Result showform(){
        DynamicForm input= play.data.Form.form().bindFromRequest();
        String Tid,Tname,Tbrand,Tdetail;
        double Tprice;
        int Tamount;
        Tid =input.get("Tid");
        Tname=input.get("Tname");
        Tbrand=input.get("Tbrand");
        Tdetail=input.get("Tdetail");
        Tprice=Double.parseDouble(input.get("Tprice"));
        Tamount= Integer.parseInt(input.get("Tamount"));
        testform output=new testform(Tid,Tname,Tbrand,Tdetail,Tprice,Tamount);
        return main(showform.render(output));
    }
    public static Result max() {return ok(sarawut.render());}
}

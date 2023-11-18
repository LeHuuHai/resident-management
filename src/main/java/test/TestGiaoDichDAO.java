
package test;

import dao.GiaoDichDAO;
import java.sql.Date;
import java.util.ArrayList;
import model.GiaoDich;
import model.HoKhau;

public class TestGiaoDichDAO {
    public static void main(String[] args){
//        Date d = Date.valueOf("2003-05-31");
//        GiaoDich t = new GiaoDich(999, 123, 32124006, 22, d );
//        GiaoDich u = new GiaoDich(888, 125, 5555, 24, d);
//        GiaoDichDAO.getInstance().insert(t);
//        GiaoDichDAO.getInstance().insert(u);

//        GiaoDich t = new GiaoDich(888);
//        GiaoDichDAO.getInstance().delete(t);

//        Date d = Date.valueOf("2023-05-31");
//        GiaoDich t = new GiaoDich(999, 123, 32124006, 22, d );
//        GiaoDichDAO.getInstance().update(t);
        
//        ArrayList<GiaoDich> li = GiaoDichDAO.getInstance().selectAll();
//        for(GiaoDich u: li){
//            System.out.println(u.toString());
//        }
    
//        GiaoDich t = new GiaoDich(888);
//        GiaoDich u = GiaoDichDAO.getInstance().selectById(t); 
//         if(u!=null){
//            System.out.println(u.toString());
//         }else{
//            System.out.println("khong ton tai");
//        }

//        Date s = Date.valueOf("2003-04-30");
//        Date e = Date.valueOf("2023-06-01");
//        ArrayList<GiaoDich> li = GiaoDichDAO.getInstance().selectByPeriod(s, e);
//        for(GiaoDich u: li){
//            System.out.println(u.toString());
//        }

        HoKhau t = new HoKhau(22);
        ArrayList<GiaoDich> li = GiaoDichDAO.getInstance().selectByFamily(t);
        for(GiaoDich u: li){
            System.out.println(u.toString());
        }
    }
}


package test;

import dao.NhanKhauDAO;
import java.sql.Date;
import java.util.ArrayList;
import model.NhanKhau;

public class TestNhanKhauDao {
    public static void main(String[] args){
//        Date dateOfBirth1 = Date.valueOf("2003-05-31");
//        Date idDate1 = Date.valueOf("2021-01-01");
//        NhanKhau t = new NhanKhau(21, "chu ho", 123, "hariii", "", "nam", dateOfBirth1,
//                "Bac Ninh", "Bac Ninh", "Kinh", "ny e", "Bac Ninh", idDate1, "Bac Ninh");
//        Date dateOfBirth2 = Date.valueOf("2003-01-31");
//        Date idDate2 = Date.valueOf("2021-01-01");
//        NhanKhau u = new NhanKhau(21, "con", 745, "yung", "", "nu", dateOfBirth2,
//                "Bac Ninh", "Bac Ninh", "Kinh", "choi", "Bac Ninh", idDate2, "Bac Ninh");
//        NhanKhauDAO.getInstance().insert(t);
//        NhanKhauDAO.getInstance().insert(u);
        
//        Date dateOfBirth1 = Date.valueOf("2003-05-31");
//        Date idDate1 = Date.valueOf("2021-01-01");
//        NhanKhau t = new NhanKhau(21, "chu ho", 123, "hariii", "", "nam", dateOfBirth1,
//                "Bac Ninh", "Berlin", "Kinh", "ny e", "Berlin", idDate1, "Bac Ninh");
//        NhanKhauDAO.getInstance().update(t);
        
//        NhanKhau t = new NhanKhau(123);
//        NhanKhauDAO.getInstance().delete(t);

//        ArrayList<NhanKhau> li = NhanKhauDAO.getInstance().selectAll();
//        for(NhanKhau t : li){
//            System.out.println(t.toString());
//        }
    
        NhanKhau t = new NhanKhau(745);
        NhanKhau u = NhanKhauDAO.getInstance().selectById(t);
        if(u!=null){
            System.out.println(u.toString());
        }else{
            System.out.println("khong ton tai");
        }
    }
}

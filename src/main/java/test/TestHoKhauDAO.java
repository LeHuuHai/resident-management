
package test;

import dao.HoKhauDAO;
import java.util.ArrayList;
import model.HoKhau;

public class TestHoKhauDAO {
    public static void main(String[] args){
//        HoKhau u = new HoKhau(21, "hariii", 123, 1, "Bac Ninh", "");
//        HoKhau t = new HoKhau(23, "yan", 135, 1, "BacNinh", "csa");
//        HoKhauDAO.getInstance().insert(t);
//        HoKhauDAO.getInstance().insert(u);

//        HoKhau t = new HoKhau(23, "yan", 135, 3, "BacNinh", "gd");
//        HoKhauDAO.getInstance().update(t);

//        HoKhau t = new HoKhau(23);
//        HoKhauDAO.getInstance().delete(t);

//        ArrayList<HoKhau> li = HoKhauDAO.getInstance().selectAll();
//        for(HoKhau t : li){
//            System.out.println(t.toString());
//        }
            
        HoKhau t = new HoKhau(221);
        HoKhau u = HoKhauDAO.getInstance().selectById(t);
        if(u!=null){
            System.out.println(u.toString());
        }else{
            System.out.println("khong ton tai");
        }

    }
}

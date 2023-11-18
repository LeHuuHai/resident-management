
package test;

import dao.KhoanPhiDAO;
import java.util.ArrayList;
import model.KhoanPhi;

public class TestKhoanPhiDAO {
    public static void main(String[] args){
//        KhoanPhi t = new KhoanPhi(123, "phi1", "bat buoc", 32124006);
//        KhoanPhi u = new KhoanPhi(125, "phi2", "tu nguyen");
//        KhoanPhiDAO.getInstance().insert(t);
//        KhoanPhiDAO.getInstance().insert(u);
        
//        KhoanPhi t = new KhoanPhi(123);
//        KhoanPhiDAO.getInstance().delete(t);

//        KhoanPhi t = new KhoanPhi(125, "phi2-fix", "tu nguyen", 4747);
//        KhoanPhiDAO.getInstance().update(t);

//        ArrayList<KhoanPhi> li = KhoanPhiDAO.getInstance().selectAll();
//        for(KhoanPhi u: li){
//            System.out.println(u.toString());
//        }
        
        KhoanPhi u = new KhoanPhi(123);
        KhoanPhi t = KhoanPhiDAO.getInstance().selectById(u);
        if(t!=null){
            System.out.println(t.toString());
         }else{
            System.out.println("khong ton tai");
        }
    }
}

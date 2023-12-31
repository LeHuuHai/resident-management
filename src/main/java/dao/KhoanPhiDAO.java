
package dao;

import model.KhoanPhi;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class KhoanPhiDAO implements DAOInterface<KhoanPhi>{
    public static KhoanPhiDAO getInstance(){
        return new KhoanPhiDAO();
    }
    
    @Override
    public boolean insert(KhoanPhi t){
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "INSERT INTO KHOANPHI (KhoanPhiID, TenKhoanPhi, LoaiKhoanPhi, SoTien)" +
                    " VALUES (" + t.getMaKhoanPhi()+ ",'" + t.getTenKhoanPhi()+ 
                    "', '" + t.getLoaiPhi()+ "', " + t.getSoTien() +  ");";
//            ans: so dong bi thay doi trong sql
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(KhoanPhi t) {
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "UPDATE KHOANPHI " + 
                    "SET TenKhoanPhi = '" + t.getTenKhoanPhi()+ 
                    "', LoaiKhoanPhi = '" + t.getLoaiPhi()+ 
                    "', SoTien = " + t.getSoTien()+  
                    " WHERE KhoanPhiID = " + t.getMaKhoanPhi()+ ";" ;
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(KhoanPhi t){
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "DELETE FROM KHOANPHI " +
                            "WHERE KhoanPhiID = " + t.getMaKhoanPhi()+ ";";
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<KhoanPhi> selectAll(){
        ArrayList<KhoanPhi> list= new ArrayList<KhoanPhi>();
        try {
            Connection connection = JDBCUtil.getConnection();
            String query = "SELECT * FROM KHOANPHI";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                int maKhoanPhi= rs.getInt("KhoanPhiID");
                String tenKhoanPhi= rs.getString("TenKhoanPhi");
                String loaiPhi=rs.getString("LoaiKhoanPhi");
                int soTien = rs.getInt("SoTien");
                KhoanPhi t = new KhoanPhi(maKhoanPhi, tenKhoanPhi, loaiPhi, soTien);
                list.add(t);
            }
            JDBCUtil.closeConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public KhoanPhi selectById(KhoanPhi t){
        KhoanPhi u = null;
        try {
            Connection connection =JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String query = "SELECT * FROM KHOANPHI"
                           + " WHERE KhoanPhiID = " + t.getMaKhoanPhi()+ ";";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            int maKhoanPhi= rs.getInt("KhoanPhiID");
            String tenKhoanPhi= rs.getString("TenKhoanPhi");
            String loaiPhi=rs.getString("LoaiKhoanPhi");
            int soTien = rs.getInt("SoTien");
            u = new KhoanPhi(maKhoanPhi,tenKhoanPhi,loaiPhi,soTien);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

}



package dao;

import model.HoKhau;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class HoKhauDAO implements DAOInterface<HoKhau>{
    public static HoKhauDAO getInstance(){
        return new HoKhauDAO();
    }
    
    @Override
    public boolean insert(HoKhau t){
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "INSERT INTO HOKHAU (HoKhauID, TenChuHo, ChuHoID, SoThanhVien, DiaChi, GhiChu)" +
                    " VALUES (" + t.getIdHoKhau() + ",'" + t.getTenChuHo() + "'," + t.getIdChuHo() + "," + t.getSoThanhVien() +
                    ",'" + t.getDiaChi() + "','" + t.getGhiChu() + "');" ;
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
    public boolean update(HoKhau t){
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "UPDATE HOKHAU " + 
                    "SET TenChuHo = '" + t.getTenChuHo() + 
                    "', ChuHoID =" + t.getIdChuHo() + 
                    ", SoThanhVien = " + t.getSoThanhVien() + 
                    ", DiaChi = '" + t.getDiaChi() + 
                    "', GhiChu = '" + t.getGhiChu() + 
                    "' WHERE HoKhauID = " + t.getIdHoKhau() + ";" ;
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean delete(HoKhau t){
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "DELETE FROM HOKHAU " +
                            "WHERE HoKhauID = '" + t.getIdHoKhau() + "';";
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    @Override 
    public ArrayList<HoKhau> selectAll(){
        ArrayList<HoKhau> li = new ArrayList<HoKhau>();
        try {
            Connection connection =JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String query = "SELECT * FROM HOKHAU";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int MaHoKhau = rs.getInt("HoKhauID");
                String HoTenChuHo = rs.getString("TenChuHo");
                int CMNDChuHo = rs.getInt("ChuHoID");
                int SoThanhVien = rs.getInt("SoThanhvien");
                String DiaChi = rs.getString("DiaChi");
                String GhiChu = rs.getString("GhiChu");
                HoKhau t = new HoKhau(MaHoKhau, HoTenChuHo, CMNDChuHo, SoThanhVien, DiaChi, GhiChu);
                li.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }
    
    @Override
    public HoKhau selectById(HoKhau t){
        HoKhau u = null;
        try {
            Connection connection =JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String query = "SELECT * FROM HOKHAU"
                           + " WHERE HoKhauID = " + t.getIdHoKhau() + ";";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int MaHoKhau = rs.getInt("HoKhauID");
                String HoTenChuHo = rs.getString("TenChuHo");
                int CMNDChuHo = rs.getInt("ChuHoID");
                int SoThanhVien = rs.getInt("SoThanhvien");
                String DiaChi = rs.getString("DiaChi");
                String GhiChu = rs.getString("GhiChu");
                u = new HoKhau(MaHoKhau, HoTenChuHo, CMNDChuHo, SoThanhVien, DiaChi, GhiChu);
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
    
        
}

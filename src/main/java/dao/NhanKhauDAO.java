
package dao;

import model.NhanKhau;

import java.util.ArrayList;
import database.JDBCUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class NhanKhauDAO implements DAOInterface<NhanKhau> {
    public static NhanKhauDAO getInstance(){
        return new NhanKhauDAO();
    }
    
    @Override
    public boolean insert(NhanKhau t) {
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "INSERT INTO NHANKHAU( HoKhauID, QuanHeVoiChuHo, "
                        + "ID, HoTen, BiDanh, GioiTinh, NgaySinh, NoiSinh, NguyenQuan, DanToc, NgheNghiep,"
                        + " NoiLamViec, NgayCapID, NoiCapID)"
                        + " VALUES(" + t.getHoKhauID()+ ", '" + t.getQhChuHo() 
                        + "', " + t.getId() + ", '" + t.getHoTen() + "', '"
                        + t.getBiDanh() + "', '" + t.getGioiTinh() + "', '"
                        + t.getNgaySinh() + "', '" + t.getNoiSinh() + "', '" 
                        + t.getNguyenQuan() +"', '" + t.getDanToc() + "', '" 
                        + t.getNgheNghiep() + "', '" + t.getNoiLamViec() + "', '" 
                        + t.getNgayCapID()+ "', '" + t.getNoiCapID()+ "');" ;
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(NhanKhau t) {
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "UPDATE NHANKHAU " +
                        "SET HoKhauID = " + t.getHoKhauID()
                        + ", QuanHeVoiChuHo = '" + t.getQhChuHo() 
                        + "', HoTen = '" + t.getHoTen()
                        + "', BiDanh = '" + t.getBiDanh()
                        + "', GioiTinh = '" + t.getGioiTinh()
                        + "', NgaySinh = '" + t.getNgaySinh()
                        + "', NoiSinh = '" + t.getNoiSinh()
                        + "', NguyenQuan = '" + t.getNguyenQuan()
                        + "', DanToc = '" + t.getDanToc()
                        + "', NgheNghiep = '" + t.getNgheNghiep()
                        + "', NoiLamViec = '" + t.getNoiLamViec()
                        + "', NgayCapID = '" + t.getNgayCapID()
                        + "', NoiCapID = '" + t.getNoiCapID()
                        + "' WHERE ID = " + t.getId() + ";" ;
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(NhanKhau t) {
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String sql = "DELETE FROM NHANKHAU " +
                            "WHERE ID = " + t.getId()+ ";";
            int ans = st.executeUpdate(sql);
            JDBCUtil.closeConnection(connection);
            return ans>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<NhanKhau> selectAll() {
        ArrayList<NhanKhau> li = new ArrayList<NhanKhau>();
        try {
            Connection connection =JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String query = "SELECT * FROM NHANKHAU";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int MaHoKhau = rs.getInt("HoKhauID");
                String QHChuHo = rs.getString("QuanHeVoiChuHo");
                int ID = rs.getInt("ID");
                String HoTen = rs.getString("HoTen");
                String BiDanh = rs.getString("BiDanh");
                String GioiTinh = rs.getString("GioiTinh");
                Date NgaySinh = rs.getDate("NgaySinh");
                String NoiSinh = rs.getString("NoiSinh");
                String NguyenQuan = rs.getString("NguyenQuan");
                String DanToc = rs.getString("DanToc");
                String NgheNghiep = rs.getString("NgheNghiep");
                String NoiLamViec = rs.getString("NoiLamViec");
                Date NgayCapID = rs.getDate("NgayCapID");
                String NoiCapID = rs.getString("NoiCapID");
                NhanKhau t = new NhanKhau(MaHoKhau, QHChuHo, ID, HoTen, BiDanh, 
                        GioiTinh, NgaySinh, NoiSinh, NguyenQuan, DanToc, 
                        NgheNghiep, NoiLamViec, NgayCapID, NoiCapID);
                li.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return li;
    }

    @Override
    public NhanKhau selectById(NhanKhau t) {
        NhanKhau u = null;
        try {
            Connection connection =JDBCUtil.getConnection();
            Statement st = connection.createStatement();
            String query = "SELECT * FROM NHANKHAU WHERE ID = " + t.getId() + ";";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            int MaHoKhau = rs.getInt("HoKhauID");
            String QHChuHo = rs.getString("QuanHeVoiChuHo");
            int ID = rs.getInt("ID");
            String HoTen = rs.getString("HoTen");
            String BiDanh = rs.getString("BiDanh");
            String GioiTinh = rs.getString("GioiTinh");
            Date NgaySinh = rs.getDate("NgaySinh");
            String NoiSinh = rs.getString("NoiSinh");
            String NguyenQuan = rs.getString("NguyenQuan");
            String DanToc = rs.getString("DanToc");
            String NgheNghiep = rs.getString("NgheNghiep");
            String NoiLamViec = rs.getString("NoiLamViec");
            Date NgayCapID = rs.getDate("NgayCapID");
            String NoiCapID = rs.getString("NoiCapID");
            u = new NhanKhau(MaHoKhau, QHChuHo, ID, HoTen, BiDanh, 
                    GioiTinh, NgaySinh, NoiSinh, NguyenQuan, DanToc, 
                    NgheNghiep, NoiLamViec, NgayCapID, NoiCapID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }  
}

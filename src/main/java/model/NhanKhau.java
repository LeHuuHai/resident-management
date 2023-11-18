
package model;

import java.sql.Date;

public class NhanKhau {
    private int hoKhauID;
    private String qhChuHo;
    private int id;
    private String hoTen;
    private String biDanh;
    private String gioiTinh;
    private Date ngaySinh;
    private String noiSinh;
    private String nguyenQuan;
    private String danToc;
    private String ngheNghiep;
    private String noiLamViec;
    private Date ngayCapID;
    private String noiCapID;

    public NhanKhau(int hoKhauID, String qhChuHo, int id, String hoTen, String biDanh,
            String gioiTinh, Date ngaySinh, String noiSinh, String nguyenQuan, 
            String danToc, String ngheNghiep, String noiLamViec, Date ngayCapID,
            String noiCapID) {
        this.hoKhauID = hoKhauID;
        this.qhChuHo = qhChuHo;
        this.id = id;
        this.hoTen = hoTen;
        this.biDanh = biDanh;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.noiSinh = noiSinh;
        this.nguyenQuan = nguyenQuan;
        this.danToc = danToc;
        this.ngheNghiep = ngheNghiep;
        this.noiLamViec = noiLamViec;
        this.ngayCapID = ngayCapID;
        this.noiCapID = noiCapID;
    }

    public NhanKhau(int id) {
        this.id = id;
    }

    public int getHoKhauID() {
        return hoKhauID;
    }

    public String getQhChuHo() {
        return qhChuHo;
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getBiDanh() {
        return biDanh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public String getNguyenQuan() {
        return nguyenQuan;
    }

    public String getDanToc() {
        return danToc;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public Date getNgayCapID() {
        return ngayCapID;
    }

    public String getNoiCapID() {
        return noiCapID;
    }

    @Override
    public String toString() {
        return "NhanKhau{" + "hoKhauID = " + hoKhauID + ", qhChuHo = " + qhChuHo 
                + ", id = " + id + ", hoTen = " + hoTen + ", biDanh = " + biDanh 
                + ", gioiTinh = " + gioiTinh + ", ngaySinh = " + ngaySinh 
                + ", noiSinh = " + noiSinh + ", nguyenQuan = " + nguyenQuan 
                + ", danToc = " + danToc + ", ngheNghiep = " + ngheNghiep 
                + ", noiLamViec = " + noiLamViec + ", ngayCapID = " + ngayCapID 
                + ", noiCapID = " + noiCapID + '}';
    }
    
    
    
}

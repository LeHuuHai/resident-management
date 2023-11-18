package model;

public class KhoanPhi {
    private int maKhoanPhi;
    private String tenKhoanPhi;
    private String loaiPhi;
    private int soTien;

    public KhoanPhi(int maKhoanPhi, String tenKhoanPhi, String loaiPhi, int soTien) {
        this.maKhoanPhi = maKhoanPhi;
        this.tenKhoanPhi = tenKhoanPhi;
        this.loaiPhi = loaiPhi;
        this.soTien = soTien;
    }
    
    public KhoanPhi(int maKhoanPhi, String tenKhoanPhi, String loaiPhi) {
        this.maKhoanPhi = maKhoanPhi;
        this.tenKhoanPhi = tenKhoanPhi;
        this.loaiPhi = loaiPhi;
    }
    
    public KhoanPhi(int maKhoanPhi){
        this.maKhoanPhi = maKhoanPhi;
    }

    public int getMaKhoanPhi() {
        return maKhoanPhi;
    }

    public String getTenKhoanPhi() {
        return tenKhoanPhi;
    }

    public String getLoaiPhi() {
        return loaiPhi;
    }

    public int getSoTien() {
        return soTien;
    }

    @Override
    public String toString() {
        return "KhoanPhi{" + "maKhoanPhi = " + maKhoanPhi + ", tenKhoanPhi = " + tenKhoanPhi + ", loaiPhi = " + loaiPhi + ", soTien = " + soTien + '}';
    }
}

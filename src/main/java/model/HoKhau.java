package model;

public class HoKhau {
    private int idHoKhau;
    private String tenChuHo;
    private int idChuHo;
    private int soThanhVien;
    private String diaChi;
    private String ghiChu;
    
    public HoKhau(int idHoKhau, String tenChuHo, int idChuHo, int soThanhVien, String diaChi, String ghiChu){
        this.idHoKhau = idHoKhau;
        this.tenChuHo = tenChuHo;
        this.idChuHo = idChuHo;
        this.soThanhVien = soThanhVien;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }
    
    public HoKhau(int idHoKhau){
        this.idHoKhau = idHoKhau;
    }
    
    public int getIdHoKhau(){
        return idHoKhau;
    }
    
    public String getTenChuHo(){
        return tenChuHo;
    }
    
    public int getIdChuHo(){
        return idChuHo;
    }
    
    public int getSoThanhVien(){
        return soThanhVien;
    }
    
    public String getDiaChi(){
        return diaChi;
    }
    
    public String getGhiChu(){
        return ghiChu;
    }

    @Override
    public String toString() {
        return "HoKhau{" + "idHoKhau = " + idHoKhau + ", tenChuHo = " + tenChuHo 
                + ", idChuHo = " + idChuHo + ", soThanhVien = " + soThanhVien 
                + ", diaChi = " + diaChi + ", ghiChu = " + ghiChu + '}';
    }
    
    
}

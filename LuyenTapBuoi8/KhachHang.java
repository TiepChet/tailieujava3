/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class KhachHang {

    private String maKH;
    private String tenKH;
    private int tuoi;
    private String bac;
    private String loai;
    private boolean gioiTinh;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int tuoi, String bac, String loai, boolean gioiTinh) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.bac = bac;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Object[] todataRow() {
        return new Object[]{maKH, tenKH, tuoi, bac, loai, gioiTinh == true ? "Nam" : "Nữ"};
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", tuoi=" + tuoi + ", bac=" + bac + ", loai=" + loai + ", gioiTinh=" + (gioiTinh == true ? "Nam" : "Nu") + '}';
    }

}

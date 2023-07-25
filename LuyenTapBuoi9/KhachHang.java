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
    private boolean gioiTinh;
    private String loai;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int tuoi, boolean gioiTinh, String loai) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.loai = loai;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", tuoi=" + tuoi + ", gioiTinh=" + (gioiTinh == true ? "Nam" : "Nữ") + ", loai=" + loai + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maKH, tenKH, tuoi, gioiTinh == true ? "Nam" : "Nữ", loai};
    }

}

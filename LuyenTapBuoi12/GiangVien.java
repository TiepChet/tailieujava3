/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class GiangVien {

    private int maGV;
    private String tenGV;
    private int tuoi;
    private int bac;
    private boolean gioiTinh;
    private Loai tenLoai;

    public GiangVien() {
    }

    public GiangVien(String tenGV, int tuoi, int bac, boolean gioiTinh, Loai tenLoai) {
        this.tenGV = tenGV;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioiTinh = gioiTinh;
        this.tenLoai = tenLoai;
    }

    public GiangVien(int maGV, String tenGV, int tuoi, int bac, boolean gioiTinh, Loai tenLoai) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioiTinh = gioiTinh;
        this.tenLoai = tenLoai;
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Loai getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(Loai tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "maGV=" + maGV + ", tenGV=" + tenGV + ", tuoi=" + tuoi + ", bac=" + bac + ", gioiTinh=" + (gioiTinh == true ? "Nam" : "Nữ") + ", tenLoai=" + tenLoai.getTenLoai() + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maGV, tenGV, tuoi, bac, (gioiTinh == true ? "Nam" : "Nữ"), tenLoai.getTenLoai()};
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class GiangVien implements Serializable {

    private String maGiangVien;
    private String tenGiangVien;
    private int tuoi;
    private String bac;
    private String loai;
    private boolean gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, String tenGiangVien, int tuoi, String bac, String loai, boolean gioiTinh) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.tuoi = tuoi;
        this.bac = bac;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
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

    public Object[] toDataRow() {
        return new Object[]{maGiangVien, tenGiangVien, tuoi, bac, loai, gioiTinh == true ? "Nam" : "Nữ"};
    }
}

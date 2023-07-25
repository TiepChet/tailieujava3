/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Sach {

    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soLuong;
    private int giaTien;
    private TheLoai tenLoai;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nhaXuatBan, int soLuong, int giaTien, TheLoai tenLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
        this.tenLoai = tenLoai;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public TheLoai getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(TheLoai tenLoai) {
        this.tenLoai = tenLoai;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", nhaXuatBan=" + nhaXuatBan + ", soLuong=" + soLuong + ", giaTien=" + giaTien + ", tenLoai=" + tenLoai + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maSach, tenSach, nhaXuatBan, soLuong, giaTien, tenLoai.getTenLoai()};
    }
}

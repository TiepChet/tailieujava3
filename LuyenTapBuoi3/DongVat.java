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
public class DongVat implements Serializable {
    
    private String ma;
    private String ten;
    private int namSinh;
    private boolean gioiTinh;
    
    public DongVat() {
    }
    
    public DongVat(String ma, String ten, int namSinh, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }
    
    public String getMa() {
        return ma;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public int getNamSinh() {
        return namSinh;
    }
    
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String trangThai(int namSinh) {
        String trangThai = "";
        if (namSinh < 2005) {
            trangThai = "Sinh Lau Roi";
        } else {
            trangThai = "Moi sinh";
        }
        return trangThai;
    }
    
    public Object[] toDataRow() {
        return new Object[]{ma, ten, namSinh, gioiTinh == true ? "Nam" : "Nu", trangThai(namSinh)};
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class DongVat {

    private String maDV;
    private String tenDV;
    private int namSinh;
    private boolean gioiTinh;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDV, int namSinh, boolean gioiTinh) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
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

    @Override
    public String toString() {
        return "DongVat{" + "maDV=" + maDV + ", tenDV=" + tenDV + ", namSinh=" + namSinh + ", gioiTinh=" + (gioiTinh == true ? "Nam" : "Nữ") + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maDV, tenDV, namSinh, gioiTinh == true ? "Nam" : "Nữ"};
    }
}

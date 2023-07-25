/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class TheLoai {

    private String maLoai;
    private String tenLoai;

    public TheLoai() {
    }

    public TheLoai(String maLoai, String tenLoai) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public TheLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

   

    @Override
    public String toString() {
        return "TheLoai{" + "maLoai=" + maLoai + ", tenLoai=" + tenLoai + '}';
    }

}

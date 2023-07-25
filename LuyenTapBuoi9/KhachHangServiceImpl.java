/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import javax.swing.JOptionPane;
import model.KhachHang;
import repository.KhachHangRepository;
import service.KhachHangService;

/**
 *
 * @author admin
 */
public class KhachHangServiceImpl implements KhachHangService {

    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> loadKhachHang = new KhachHangRepository().getAll();
        return loadKhachHang;
    }

    @Override
    public List<KhachHang> sort() {
        List<KhachHang> sortKhachHang = new KhachHangRepository().sort();
        return sortKhachHang;
    }

    @Override
    public List<KhachHang> searchMinMax(int min, int max) {
        List<KhachHang> searchMinMax = new KhachHangRepository().searchMinMax(min, max);
        return searchMinMax;
    }

    @Override
    public List<KhachHang> listKhachVip() {
        List<KhachHang> listKhachVip = new KhachHangRepository().listKhachVip();
        return listKhachVip;
    }

    @Override
    public String add(KhachHang kh) {
        if (kh.getMaKH().isEmpty()) {
            return "Trong ma";
        }
//        if (kh.getMaKH().matches("[a-zA-Z]+")) {
//            return "Sai Định Dạng Mã";
//        }
        if (kh.getTenKH().isEmpty()) {
            return "Trong ten";
        }
//        if (kh.getTenKH().matches("[a-zA-Z]+")) {
//            return "Sai Định Dạng Tên";
//        }
        if (String.valueOf(kh.getTuoi()).isEmpty()) {
            return "Trong tuoi";
        }
        boolean add = new KhachHangRepository().addKhachHang(kh);
        if (add) {
            return "Add Thanh Cong";
        } else {
            return "Add That Bai";
        }
    }

    @Override
    public String delete(String maKH) {
        boolean delete = new KhachHangRepository().delete(maKH);
        if (delete) {
            return "Xoa thanh cong";
        } else {
            return "Xoa that bai";
        }
    }

    @Override
    public String update(KhachHang kh, String maKH) {
        boolean update = new KhachHangRepository().update(kh, maKH);
        if (update) {
            return "Update thanh cong";
        } else {
            return "Update that bải";
        }
    }
}

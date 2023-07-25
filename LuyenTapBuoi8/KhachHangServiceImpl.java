/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
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
        return new KhachHangRepository().getAll();
    }

    public List<KhachHang> getKhachVIP() {
        return new KhachHangRepository().getListVIP();
    }

    @Override
    public void sortKhachHang(List<KhachHang> listKhachHang) {
        listKhachHang.sort((o1, o2) -> {
            return o1.getTenKH().compareTo(o2.getTenKH());
        });
    }

    @Override
    public List<KhachHang> searchTrongKhoang(List<KhachHang> listKhachHang, int min, int max) {
        List<KhachHang> searchTrongKhoang = new ArrayList<>();
        for (KhachHang khachHang : listKhachHang) {
            if (min <= khachHang.getTuoi() && khachHang.getTuoi() <= max) {
                searchTrongKhoang.add(khachHang);
            }
        }
        return searchTrongKhoang;
    }
}

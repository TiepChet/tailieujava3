/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
import service.KhachHangService;

/**
 *
 * @author ADMIN
 */
public class KhachHangServiceImpl implements KhachHangService {

    @Override
    public List<KhachHang> searchKhachHang(List<KhachHang> listKhachHang, int min, int max) {
        List<KhachHang> searchKhachHang = new ArrayList<>();
        for (KhachHang kh : listKhachHang) {
            if (min <= kh.getTuoi() && kh.getTuoi() <= max) {
                searchKhachHang.add(kh);
            }
        }
        return searchKhachHang;
    }

    @Override
    public List<KhachHang> searchKhachHangVip(List<KhachHang> listKhachHang, String loaiKH) {
        List<KhachHang> searchKhachHangVip = new ArrayList<>();
        for (KhachHang kh : listKhachHang) {
            if (kh.getLoaiKH().equalsIgnoreCase("VIP")) {
                searchKhachHangVip.add(kh);
            }
        }
        return searchKhachHangVip;
    }

    @Override
    public void sortKhachHang(List<KhachHang> listKhachHang) {
        listKhachHang.sort((o1, o2) -> {
            return o1.getTenKH().compareTo(o2.getTenKH());
        });
    }

}

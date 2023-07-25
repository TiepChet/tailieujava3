/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.SinhVien;
import service.SinhVienService;

/**
 *
 * @author ADMIN
 */
public class SinhVienServiceImpl implements SinhVienService {

    @Override
    public List<SinhVien> searchSinhVien(List<SinhVien> listSinhVien, String ten) {
        List<SinhVien> searchSinhVien = new ArrayList<>();
        for (SinhVien sv : listSinhVien) {
            if (sv.getTen().contains(ten)) {
                searchSinhVien.add(sv);
            }
        }
        return searchSinhVien;
    }

    @Override
    public void sortSinhVien(List<SinhVien> listSinhVien) {
        listSinhVien.sort((o1, o2) -> {
            if (o1.getTen().equals(o2.getTen())) {
                return o1.getTuoi() - o2.getTuoi();
            } else {
                return o2.getTen().compareTo(o1.getTen());
            }
        });
    }

    @Override
    public boolean removeSinhVien(List<SinhVien> listSinhVien, String ten) {
        boolean isRemove = false;
        for (int i = 0; i < listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getTen().trim().equalsIgnoreCase(ten)) {
                isRemove = true;
                listSinhVien.remove(i);
            }
        }
        return isRemove;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.GiangVien;
import service.GiangVienService;

/**
 *
 * @author ADMIN
 */
public class GiangVienServiceImpl implements GiangVienService {
    
    @Override
    public void sortGiangVien(List<GiangVien> listGiangVien) {
        listGiangVien.sort((o1, o2) -> {
            if (o1.getTenGiangVien().equals(o2.getTenGiangVien())) {
                return o2.getTuoi() - o1.getTuoi();
            } else {
                return o1.getTenGiangVien().compareTo(o2.getTenGiangVien());
            }
        });
    }
    
    @Override
    public boolean removeGiangVien(List<GiangVien> listGiangVien, String maGiangVien) {
        boolean isRemove = false;
        for (int i = 0; i < listGiangVien.size(); i++) {
            if (listGiangVien.get(i).getMaGiangVien().equalsIgnoreCase(maGiangVien)) {
                isRemove = true;
                listGiangVien.remove(i);
            }
        }
        return isRemove;
    }
    
    @Override
    public List<GiangVien> searchGiangVien(List<GiangVien> listGiangVien, String tenGiangVien) {
        List<GiangVien> searchGiangVien = new ArrayList<>();
        for (GiangVien giangVien : listGiangVien) {
            if (giangVien.getTenGiangVien().equalsIgnoreCase(tenGiangVien)) {
                searchGiangVien.add(giangVien);
            }
        }
        return searchGiangVien;
    }
}

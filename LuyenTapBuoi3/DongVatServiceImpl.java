/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.ArrayList;
import java.util.List;
import model.DongVat;
import service.DongVatService;

/**
 *
 * @author ADMIN
 */
public class DongVatServiceImpl implements DongVatService {

    @Override
    public List<DongVat> searhTheoTen(List<DongVat> listDongVat, String ten) {
        List<DongVat> searchTheoTen = new ArrayList<>();
        for (DongVat dongVat : listDongVat) {
            if (dongVat.getTen().equalsIgnoreCase(ten)) {
                searchTheoTen.add(dongVat);
            }
        }
        return searchTheoTen;
    }

    @Override
    public void sortDongVat(List<DongVat> listDongVat) {
        listDongVat.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }

    @Override
    public boolean removeDongVat(List<DongVat> listDongVat, String ma) {
        boolean isRemove = false;
        for (int i = 0; i < listDongVat.size(); i++) {
            if (listDongVat.get(i).getMa().equalsIgnoreCase(ma)) {
                isRemove = true;
                listDongVat.remove(i);
            }
        }
        return isRemove;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.DongVat;
import reposition.DongVatReposition;
import service.DongVatService;

/**
 *
 * @author admin
 */
public class DongVatServiceImpl implements DongVatService {

    @Override
    public List<DongVat> getAll() {
        List<DongVat> getAll = new DongVatReposition().getAll();
        return getAll;
    }

    @Override
    public List<DongVat> searchDongVat(String tenDV) {
        List<DongVat> searchDongVat = new DongVatReposition().searchDongVat(tenDV);
        return searchDongVat;
    }

    @Override
    public List<DongVat> sortDongVat() {
        List<DongVat> sortDongVat = new DongVatReposition().sortDongVat();
        return sortDongVat;
    }

    @Override
    public List<DongVat> listNam(boolean gioiTinh) {
        List<DongVat> listNam = new DongVatReposition().listNam(gioiTinh);
        return listNam;
    }

    @Override
    public String addDongVat(DongVat dv) {
        if (dv.getMaDV().isEmpty()) {
            return "Trống Mã";
        }
        if (dv.getTenDV().isEmpty()) {
            return "Trống Tên";
        }
        boolean addDongVat = new DongVatReposition().addDongVat(dv);
        if (addDongVat) {
            return "Add Thành Công";
        } else {
            return "Add Thất Bại";
        }
    }

    @Override
    public String deleteDongVat(String tenDV) {
        boolean deleteDongVat = new DongVatReposition().deleteDongVat(tenDV);
        if (deleteDongVat) {
            return "Delete Thành Công";
        } else {
            return "Dữ Liệu Không Tồn Tại";
        }
    }

    @Override
    public String updateDongVat(DongVat dv, String maDV) {
        boolean updateDongVat = new DongVatReposition().updateDongVat(dv, maDV);
        if (updateDongVat) {
            return "Update Thành Công";
        } else {
            return "Update Thất Bại";
        }
    }

}

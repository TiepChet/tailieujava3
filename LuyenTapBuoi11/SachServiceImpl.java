/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.Sach;
import model.TheLoai;
import reposition.SachReposition;
import service.SachService;

/**
 *
 * @author admin
 */
public class SachServiceImpl implements SachService {

    private SachReposition sr = new SachReposition();

    @Override
    public List<Sach> getAll() {
        return sr.getAll();
    }

    @Override
    public List<Sach> searchTen(String tenLoai) {
        return sr.searchTen(tenLoai);
    }

    @Override
    public List<Sach> top5() {
        return sr.top5();
    }

    @Override
    public List<Sach> sortGia() {
        return sr.sortGia();
    }

    @Override
    public String addSach(Sach s) {
        boolean addSach = sr.addSach(s);
        if (addSach) {
            return "Add Thành CÔng";
        } else {
            return "Add Thất Bại";
        }
    }

    @Override
    public String deleteSach(String maSach) {
        boolean deleteSach = sr.deleteSach(maSach);
        if (deleteSach) {
            return "Delete Thành Công";
        } else {
            return "Không Tồn Tại";
        }
    }

    @Override
    public String updateSach(Sach s, String maSach) {
        boolean updateSach = sr.updateSach(s, maSach);
        if (updateSach) {
            return "Update Thành Công";
        } else {
            return "Update Thất Bại";
        }
    }

}

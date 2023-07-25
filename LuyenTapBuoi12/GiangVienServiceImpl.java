/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.GiangVien;
import reposition.GiangVienReposition;
import service.GiangVienService;

/**
 *
 * @author admin
 */
public class GiangVienServiceImpl implements GiangVienService {

    private GiangVienReposition gvr = new GiangVienReposition();

    @Override
    public List<GiangVien> getAll() {
        return gvr.getAll();
    }

    @Override
    public List<GiangVien> sort() {
        return gvr.sort();
    }

    @Override
    public List<GiangVien> fullTime(String tenLoai) {
        return gvr.fullTime(tenLoai);

    }

    @Override
    public String delete(String tenGV) {
        boolean delete = gvr.delete(tenGV);
        if (delete) {
            return "Delete Thành Công";
        } else {
            return "Không Tồn Tại";
        }
    }

    @Override
    public String update(GiangVien gv, int maGV) {
        boolean update = gvr.update(gv, maGV);
        if (update) {
            return "Update Thành Công";
        } else {
            return "Update Thất Bại";
        }
    }

    @Override
    public String add(GiangVien gv) {
        boolean add = gvr.add(gv);
        if (add) {
            return "Add Thành Công";
        } else {
            return "Add Thất Bại";
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.Sach;
import model.TheLoai;
import reposition.TheLoaiReposition;
import service.SachService;
import service.TheLoaiService;

/**
 *
 * @author admin
 */
public class TheLoaiServiceImpl implements TheLoaiService{

    private TheLoaiReposition tlr = new TheLoaiReposition();
    @Override
    public List<TheLoai> getAll() {
    return tlr.getAll();
    }

    @Override
    public TheLoai getOne(String tenLoai) {
    return  tlr.getOne(tenLoai);
    }

   
}

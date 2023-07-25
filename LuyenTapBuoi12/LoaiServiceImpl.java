/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.Loai;
import reposition.LoaiReposition;
import service.LoaiService;

/**
 *
 * @author admin
 */
public class LoaiServiceImpl implements LoaiService {

    private LoaiReposition lr = new LoaiReposition();

    @Override
    public List<Loai> getAll() {
        return lr.getAll();
    }

    @Override
    public Loai getOne(int maLoai) {
        return lr.getOne(maLoai);
    }

}

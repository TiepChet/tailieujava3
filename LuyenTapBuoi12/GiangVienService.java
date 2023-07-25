/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.GiangVien;

/**
 *
 * @author admin
 */
public interface GiangVienService {

    List<GiangVien> getAll();

    List<GiangVien> sort();

    List<GiangVien> fullTime(String tenLoai);

    String delete(String tenGV);

    String update(GiangVien gv, int maGV);
    
    String add (GiangVien gv);
}

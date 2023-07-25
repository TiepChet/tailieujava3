/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Sach;
import model.TheLoai;

/**
 *
 * @author admin
 */
public interface SachService {

    List<Sach> getAll();

    List<Sach> searchTen(String tenLoai);
    
    List<Sach> top5();
    
    List<Sach> sortGia();
    
    String addSach(Sach s);
    
    String deleteSach(String maSach);
    
    String updateSach(Sach s, String maSach);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;

/**
 *
 * @author admin
 */
public interface KhachHangService {

      List<KhachHang> getAll();
      
      List<KhachHang> sort();
      
      List<KhachHang> searchMinMax(int min, int max);
      
      List<KhachHang> listKhachVip();
      
      String add(KhachHang kh);
      
      String delete(String maKH);
      
      String update(KhachHang kh, String maKH);
}

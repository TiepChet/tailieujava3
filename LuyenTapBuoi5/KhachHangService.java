/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;

/**
 *
 * @author ADMIN
 */
public interface KhachHangService {

    List<KhachHang> searchKhachHang(List<KhachHang> listKhachHang, int min, int max);

    List<KhachHang> searchKhachHangVip(List<KhachHang> listKhachHang, String loaiKH);

    void sortKhachHang(List<KhachHang> listKhachHang);
    
}

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

    List<KhachHang> getKhachVIP();

    List<KhachHang> searchTrongKhoang(List<KhachHang> listKhachHang, int min, int max);

    void sortKhachHang(List<KhachHang> listKhachHang);

}

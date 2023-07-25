/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SinhVien;

/**
 *
 * @author ADMIN
 */
public interface SinhVienService {

    List<SinhVien> searchSinhVien(List<SinhVien> listSinhVien, String ten);

    void sortSinhVien(List<SinhVien> listSinhVien);

    boolean removeSinhVien(List<SinhVien> listSinhVien, String ten);
}

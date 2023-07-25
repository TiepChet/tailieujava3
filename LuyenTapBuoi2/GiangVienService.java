/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.GiangVien;

/**
 *
 * @author ADMIN
 */
public interface GiangVienService {

    void sortGiangVien(List<GiangVien> listGiangVien);

    boolean removeGiangVien(List<GiangVien> listGiangVien, String maGiangVien);
    
    List<GiangVien> searchGiangVien(List<GiangVien> listGiangVien, String tenGiangVien);
}

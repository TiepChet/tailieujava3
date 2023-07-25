/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.DongVat;

/**
 *
 * @author admin
 */
public interface DongVatService {

    List<DongVat> getAll();

    List<DongVat> searchDongVat(String tenDV);

    List<DongVat> sortDongVat();

    List<DongVat> listNam(boolean gioiTinh);

    String addDongVat(DongVat dv);

    String deleteDongVat(String tenDV);

    String updateDongVat(DongVat dv, String maDV);
}

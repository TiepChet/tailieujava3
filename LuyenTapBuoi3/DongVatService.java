/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.DongVat;

/**
 *
 * @author ADMIN
 */
public interface DongVatService {

    List<DongVat> searhTheoTen(List<DongVat> listDongVat, String ten);

    boolean removeDongVat(List<DongVat> listDongVat, String ma);

    void sortDongVat(List<DongVat> listDongVat);
}

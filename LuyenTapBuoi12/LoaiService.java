/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Loai;

/**
 *
 * @author admin
 */
public interface LoaiService {

    List<Loai> getAll();

    Loai getOne(int maLoai);
}

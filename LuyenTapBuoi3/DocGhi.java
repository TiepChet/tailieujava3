/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class DocGhi {

    public String ghi(String path, List<DongVat> listDongVat) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (DongVat dongVat : listDongVat) {
                oos.writeObject(dongVat);
            }

            oos.close();
            fos.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            return "Ghi file that bai";
        }
    }

    public String doc(String path, List<DongVat> listDongVat) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                return "Trong File";
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            DongVat dongVat = new DongVat();
            while (fis.available() > 0) {
                dongVat = (DongVat) ois.readObject();
                listDongVat.add(dongVat);
            }

            ois.close();
            fis.close();
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}

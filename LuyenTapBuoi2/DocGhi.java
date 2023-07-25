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

    public String ghi(String path, List<GiangVien> listGiangVien) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (GiangVien giangVien : listGiangVien) {
                oos.writeObject(giangVien);
            }

            oos.close();
            fos.close();
            return "Ghi file thanh cong";

        } catch (Exception e) {
            return "Ghi file that bai";
        }
    }

    public String doc(String path, List<GiangVien> listGiangVien) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                return "File Trong";
            }

            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            GiangVien giangVien = new GiangVien();
            while (fis.available() > 0) {
                giangVien = (GiangVien) ois.readObject();
                listGiangVien.add(giangVien);
            }

            ois.close();
            fis.close();;
            return "Doc file thanh cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class KhachHangRepository {

    public List<KhachHang> getAll() {
        //b1.create query: 
        String query = "select * from giangvien";
        //b2 mở cnn:
        try (Connection cnn = SQLServerConnection.getConnection();
                PreparedStatement ps = cnn.prepareStatement(query);) {
            //b3 statement:
            //=> là 1 interface cho phép gửi query tới database:
            //b4:
            List<KhachHang> listKhachHang = new ArrayList<>();
            //b5:tạo resultset: đại diện cho tập hợp các bản ghi có được sau khi thực hiện truy vấn query
            ResultSet rs = ps.executeQuery();
            //b6 doc data từ rs:
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
     public List<KhachHang> getListVIP() {
        //b1.create query: 
        String query = "select * from giangvien where loai =N'VIP'";
        //b2 mở cnn:
        try (Connection cnn = SQLServerConnection.getConnection();
                PreparedStatement ps = cnn.prepareStatement(query);) {
            //b3 statement:
            //=> là 1 interface cho phép gửi query tới database:
            //b4:
            List<KhachHang> listKhachHang = new ArrayList<>();
            //b5:tạo resultset: đại diện cho tập hợp các bản ghi có được sau khi thực hiện truy vấn query
            ResultSet rs = ps.executeQuery();
            //b6 doc data từ rs:
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
     }

    public static void main(String[] args) {
        List<KhachHang> list = new KhachHangRepository().getAll();
        for (KhachHang kh : list) {
            System.out.println(kh.toString());
        }
    }

}

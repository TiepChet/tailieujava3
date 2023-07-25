/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import model.KhachHang;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class KhachHangRepository {

    public List<KhachHang> getAll() {
        String query = "select * from khach_hang";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {

            List<KhachHang> listKhachHang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getString(5));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<KhachHang> sort() {
        String query = "select * from khach_hang order by tenKH";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {

            List<KhachHang> listKhachHang = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getString(5));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<KhachHang> searchMinMax(int min, int max) {
        String query = "select * from khach_hang where tuoi between ? and ?";
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {

            List<KhachHang> listKhachHang = new ArrayList<>();
            ps.setObject(1, min);
            ps.setObject(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getBoolean(4),
                        rs.getString(5));
                listKhachHang.add(kh);
            }
            return listKhachHang;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<KhachHang> listKhachVip() {
        String query = "select * from khach_hang where loai = N'VIP' ";
        try (Connection conn = SQLServerConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(query);) {
            List<KhachHang> list = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new KhachHang(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4), rs.getString(5)));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean addKhachHang(KhachHang kh) {
        String query = "INSERT INTO [dbo].[khach_hang]\n"
                + "           ([maKH]\n"
                + "           ,[tenKH]\n"
                + "           ,[tuoi]\n"
                + "           ,[gioiTinh]\n"
                + "           ,[loai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getMaKH());
            ps.setObject(2, kh.getTenKH());
            ps.setObject(3, kh.getTuoi());
            ps.setObject(4, kh.isGioiTinh());
            ps.setObject(5, kh.getLoai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String maKH) {
        String query = "DELETE FROM [dbo].[khach_hang]\n"
                + "      WHERE maKH =?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, maKH);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(KhachHang kh, String maKH) {
        String query = "UPDATE [dbo].[khach_hang]\n"
                + "      SET tenKH = ?"
                + "      ,tuoi= ?"
                + "      ,gioiTinh =?"
                + "      ,loai =?"
                + " WHERE maKH =?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getTenKH());
            ps.setObject(2, kh.getTuoi());
            ps.setObject(3, kh.isGioiTinh());
            ps.setObject(4, kh.getLoai());
            ps.setObject(5, maKH); // ma da ton tai trong DB
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}

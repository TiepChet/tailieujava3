/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.GiangVien;
import model.Loai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jdbc.SQLServerConnection;

/**
 *
 * @author admin
 */
public class GiangVienReposition {

    public List<GiangVien> getAll() {
        String query = "SELECT dbo.GiangVien.maGV, dbo.GiangVien.tenGV, dbo.GiangVien.tuoi, dbo.GiangVien.bac, dbo.GiangVien.gioiTinh, dbo.Loai.tenLoai, dbo.Loai.maLoai\n "
                + "FROM     dbo.GiangVien INNER JOIN\n"
                + "                  dbo.Loai ON dbo.GiangVien.maLoai = dbo.Loai.maLoai";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<GiangVien> listGiangVien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Loai loai = new Loai(rs.getInt(7), rs.getString(6));
                GiangVien gv = new GiangVien(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBoolean(5), loai);
                listGiangVien.add(gv);
            }
            return listGiangVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<GiangVien> sort() {
        String query = "SELECT dbo.GiangVien.maGV, dbo.GiangVien.tenGV, dbo.GiangVien.tuoi, dbo.GiangVien.bac, dbo.GiangVien.gioiTinh, dbo.Loai.tenLoai\n"
                + "FROM     dbo.GiangVien INNER JOIN\n"
                + "                  dbo.Loai ON dbo.GiangVien.maLoai = dbo.Loai.maLoai order by tenGV ";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<GiangVien> listGiangVien = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Loai loai = new Loai(rs.getString(6));
                GiangVien gv = new GiangVien(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBoolean(5), loai);
                listGiangVien.add(gv);
            }
            return listGiangVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<GiangVien> fullTime(String tenLoai) {
        String query = "SELECT dbo.GiangVien.maGV, dbo.GiangVien.tenGV, dbo.GiangVien.tuoi, dbo.GiangVien.bac, dbo.GiangVien.gioiTinh, dbo.Loai.tenLoai\n"
                + "FROM     dbo.GiangVien INNER JOIN\n"
                + "                  dbo.Loai ON dbo.GiangVien.maLoai = dbo.Loai.maLoai where tenLoai =?";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<GiangVien> listGiangVien = new ArrayList<>();
            ps.setObject(1, tenLoai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Loai loai = new Loai(rs.getString(6));
                GiangVien gv = new GiangVien(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBoolean(5), loai);
                listGiangVien.add(gv);
            }
            return listGiangVien;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean delete(String tenGV) {
        String query = "DELETE FROM [dbo].[GiangVien]\n"
                + "      WHERE tenGV=?";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenGV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(GiangVien gv, int maGV) {
        String query = "UPDATE [dbo].[GiangVien]\n"
                + "   SET [tenGV] = ?"
                + "      ,[tuoi] = ?"
                + "      ,[bac] = ?"
                + "      ,[gioiTinh] = ?"
                + "      ,[maLoai] = ?"
                + " WHERE maGV = ?";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, gv.getTenGV());
            ps.setObject(2, gv.getTuoi());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.isGioiTinh());
            ps.setObject(5, gv.getTenLoai().getMaLoai());
            ps.setObject(6, maGV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean add(GiangVien gv) {
        String query = "INSERT INTO [dbo].[GiangVien]\n"
                + "           ([tenGV]\n"
                + "           ,[tuoi]\n"
                + "           ,[bac]\n"
                + "           ,[gioiTinh]\n"
                + "           ,[maLoai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, gv.getTenGV());
            ps.setObject(2, gv.getTuoi());
            ps.setObject(3, gv.getBac());
            ps.setObject(4, gv.isGioiTinh());
            ps.setObject(5, gv.getTenLoai().getMaLoai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    public static void main(String[] args) {
        Loai loai = new Loai("fulltime");
        GiangVien gv = new GiangVien(0, "thang", 2, 200, true,loai);
        boolean add = new GiangVienReposition().add(gv);
        System.out.println(add);
    }
}

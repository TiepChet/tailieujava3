/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.Sach;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc.SQLServerConnection;
import model.TheLoai;

/**
 *
 * @author admin
 */
public class SachReposition {

    public List<Sach> getAll() {
        String query = "SELECT dbo.Sach.maSach, dbo.Sach.tenSach, dbo.Sach.nhaXuatBan, dbo.Sach.soLuong, dbo.Sach.giaTien, dbo.Loai.tenLoai\n"
                + "FROM     dbo.Loai INNER JOIN\n"
                + "                  dbo.Sach ON dbo.Loai.maLoai = dbo.Sach.maLoai";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<Sach> listSach = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai tl = new TheLoai(rs.getString(6));
                Sach sach = new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), tl);
                listSach.add(sach);
            }
            return listSach;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<Sach> searchTen(String tenLoai) {
        String query = "SELECT dbo.Sach.maSach, dbo.Sach.tenSach, dbo.Sach.nhaXuatBan, dbo.Sach.soLuong, dbo.Sach.giaTien, dbo.Loai.tenLoai\n"
                + "FROM     dbo.Loai INNER JOIN\n"
                + "                  dbo.Sach ON dbo.Loai.maLoai = dbo.Sach.maLoai where tenLoai =?";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<Sach> listSach = new ArrayList<>();
            ps.setObject(1, tenLoai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai tl = new TheLoai(rs.getString(6));
                Sach sach = new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), tl);
                listSach.add(sach);
            }
            return listSach;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<Sach> top5() {
        String query = "SELECT top 5 dbo.Sach.maSach, dbo.Sach.tenSach, dbo.Sach.nhaXuatBan, dbo.Sach.soLuong, dbo.Sach.giaTien, dbo.Loai.tenLoai\n"
                + "FROM     dbo.Loai INNER JOIN\n"
                + "                  dbo.Sach ON dbo.Loai.maLoai = dbo.Sach.maLoai order by soLuong ";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<Sach> listSach = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai tl = new TheLoai(rs.getString(6));
                Sach sach = new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), tl);
                listSach.add(sach);
            }
            return listSach;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<Sach> sortGia() {
        String query = "SELECT dbo.Sach.maSach, dbo.Sach.tenSach, dbo.Sach.nhaXuatBan, dbo.Sach.soLuong, dbo.Sach.giaTien, dbo.Loai.tenLoai\n"
                + "FROM     dbo.Loai INNER JOIN\n"
                + "                  dbo.Sach ON dbo.Loai.maLoai = dbo.Sach.maLoai order by giaTien desc";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<Sach> listSach = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai tl = new TheLoai(rs.getString(6));
                Sach sach = new Sach(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), tl);
                listSach.add(sach);
            }
            return listSach;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean addSach(Sach s) {
        String query = "INSERT INTO [dbo].[Sach]\n"
                + "           ([maSach]\n"
                + "           ,[tenSach]\n"
                + "           ,[maLoai]\n"
                + "           ,[soLuong]\n"
                + "           ,[giaTien]\n"
                + "           ,[nhaXuatBan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, s.getMaSach());
            ps.setObject(2, s.getTenSach());
            ps.setObject(3, s.getTenLoai().getMaLoai());
            ps.setObject(4, s.getSoLuong());
            ps.setObject(5, s.getGiaTien());
            ps.setObject(6, s.getNhaXuatBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean deleteSach(String maSach) {
        String query = "DELETE FROM [dbo].[Sach]\n"
                + "      WHERE maSach=?";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maSach);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateSach(Sach s, String maSach) {
        String query = "UPDATE [dbo].[Sach]\n"
                + "      SET [tenSach] = ?"
                + "      ,[maLoai] = ?"
                + "      ,[soLuong] = ?"
                + "      ,[giaTien] = ?"
                + "      ,[nhaXuatBan] = ?"
                + " WHERE maSach=?";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, s.getTenSach());
            ps.setObject(2, s.getTenLoai().getMaLoai());
            ps.setObject(3, s.getSoLuong());
            ps.setObject(4, s.getGiaTien());
            ps.setObject(5, s.getNhaXuatBan());
            ps.setObject(6, maSach);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    
    public static void main(String[] args) {
        TheLoai tl = new TheLoai("5", "Sách Báo");
        Sach s = new Sach("103", "UI", "AN", 100, 1, tl);
        boolean update = new SachReposition().updateSach(s, "103");
        System.out.println(update);
    }

}

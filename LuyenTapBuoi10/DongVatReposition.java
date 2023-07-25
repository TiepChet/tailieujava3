/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import jdbc.SQLServerConnection;
import model.DongVat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author admin
 */
public class DongVatReposition {

    public List<DongVat> getAll() {
        String query = "select * from dong_vat";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            List<DongVat> listDongVat = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongVat dv = new DongVat(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4));
                listDongVat.add(dv);
            }
            return listDongVat;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<DongVat> searchDongVat(String tenDV) {
        String query = "select * from dong_vat where tenDV =?";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<DongVat> listDongVat = new ArrayList<>();
            ps.setObject(1, tenDV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongVat dv = new DongVat(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4));
                listDongVat.add(dv);
            }
            return listDongVat;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<DongVat> sortDongVat() {
        String query = "select * from dong_vat order by tenDV";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<DongVat> listDongVat = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongVat dv = new DongVat(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4));
                listDongVat.add(dv);
            }
            return listDongVat;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<DongVat> listNam(boolean gioiTinh) {
        String query = "select *from dong_vat where gioiTinh=?";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<DongVat> listDongVat = new ArrayList<>();
            ps.setObject(1, gioiTinh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongVat dv = new DongVat(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getBoolean(4));
                listDongVat.add(dv);
            }
            return listDongVat;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean addDongVat(DongVat dv) {
        String query = "INSERT INTO [dbo].[dong_vat]\n"
                + "           ([maDV]\n"
                + "           ,[tenDV]\n"
                + "           ,[namSinh]\n"
                + "           ,[gioiTinh])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, dv.getMaDV());
            ps.setObject(2, dv.getTenDV());
            ps.setObject(3, dv.getNamSinh());
            ps.setObject(4, dv.isGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    public boolean deleteDongVat(String tenDV) {
        String query = "DELETE FROM [dbo].[dong_vat]\n"
                + "      WHERE tenDV=?";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenDV);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateDongVat(DongVat dv, String maDV) {
        String query = "UPDATE [dbo].[dong_vat]\n"
                + "      SET [tenDV] = ?"
                + "      ,[namSinh] = ?"
                + "      ,[gioiTinh] =?"
                + " WHERE maDV =?";
        int check = 0;
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, dv.getTenDV());
            ps.setObject(2, dv.getNamSinh());
            ps.setObject(3, dv.isGioiTinh());
            ps.setObject(4, maDV);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}

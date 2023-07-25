/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
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
public class LoaiReposition {

    public List<Loai> getAll() {
        String query = "SELECT [maLoai]\n"
                + "      ,[tenLoai]\n"
                + "  FROM [dbo].[Loai]";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<Loai> listLoai = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Loai loai = new Loai(rs.getInt(1), rs.getString(2));
                listLoai.add(loai);
            }
            return listLoai;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Loai getOne(int maLoai) {
        String query = "SELECT [maLoai]\n"
                + "      ,[tenLoai]\n"
                + "  FROM [dbo].[Loai]\n"
                + "  WHERE maLoai =?";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, maLoai);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Loai loai = new Loai(rs.getInt(1), rs.getString(2));
                return loai;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
        Loai l = new LoaiReposition().getOne(1);
        System.out.println(l);
    }
}

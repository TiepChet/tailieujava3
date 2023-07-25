/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.util.List;
import model.TheLoai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jdbc.SQLServerConnection;

/**
 *
 * @author admin
 */
public class TheLoaiReposition {

    public List<TheLoai> getAll() {
        String query = "SELECT [maLoai]\n"
                + "      ,[tenLoai]\n"
                + "  FROM [dbo].[Loai]";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            List<TheLoai> listTheLoai = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TheLoai theLoai = new TheLoai(rs.getString(1), rs.getString(2));
                listTheLoai.add(theLoai);
            }
            return listTheLoai;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public TheLoai getOne(String tenLoai) {
        String query = "SELECT [maLoai]\n"
                + "      ,[tenLoai]\n"
                + "  FROM [dbo].[Loai]\n"
                + "  where tenLoai =?";
        try (Connection conn = SQLServerConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);) {
            ps.setObject(1, tenLoai);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                TheLoai theLoai = new TheLoai(rs.getString(1), rs.getString(2));
                return theLoai;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.List;
import db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import jenis_member.JenisMember;

/**
 *
 * @author Yusup
 */
public class JenisMemberDao {
    // untuk menyisipkan data JenisMember ke dalam database
    public int insert(JenisMember jenisMember) {
        int result = -1;
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO jenis_member (id, nama) VALUES (?, ?)");
            statement.setString(1, jenisMember.getId());
            statement.setString(2, jenisMember.getNama());

            // mengeksekusi pernyataan SQL dan mendapatkan jumlah baris yang terpengaruh
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // menangkap dan mencetak kesalahan SQL
            e.printStackTrace();
        }
        return result;
    }

    // untuk memperbarui data JenisMember dalam database
    public int update(JenisMember jenisMember) {
        int result = -1;
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE jenis_member SET nama = ? WHERE id = ?");
            statement.setString(1, jenisMember.getNama());
            statement.setString(2, jenisMember.getId());

            // mengeksekusi pernyataan SQL dan mendapatkan jumlah baris yang terpengaruh
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // menangkap dan mencetak kesalahan SQL
            e.printStackTrace();
        }
        return result;
    }

    // untuk menghapus data JenisMember dari database
    public int delete(JenisMember jenisMember) {
        int result = -1;
        try (Connection connection = MySqlConnection.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM jenis_member WHERE id = ?");
            statement.setString(1, jenisMember.getId());

            // mengeksekusi pernyataan SQL dan mendapatkan jumlah baris yang terpengaruh
            result = statement.executeUpdate();
        } catch (SQLException e) {
            // mencetak kesalahan SQL
            e.printStackTrace();
        }
        return result;
    }

    // untuk mengambil semua data JenisMember dari database
    public List<JenisMember> findAll() {
        List<JenisMember> list = new ArrayList<>();
        try (Connection connection = MySqlConnection.getInstance().getConnection();
             Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM jenis_member")) {
                // membaca hasil set dan membuat objek JenisMember untuk setiap baris
                while (resultSet.next()) {
                    JenisMember jenisMember = new JenisMember();
                    jenisMember.setId(resultSet.getString("id"));
                    jenisMember.setNama(resultSet.getString("nama"));
                    list.add(jenisMember);
                }
            } catch (SQLException e) {
                // menangkap dan mencetak kesalahan SQL
                e.printStackTrace();
            }
        } catch (SQLException e) {
            // menangkap dan mencetak kesalahan SQL
            e.printStackTrace();
        }
        return list;
    }
}
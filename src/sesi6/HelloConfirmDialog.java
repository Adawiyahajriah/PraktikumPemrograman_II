/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Adawiyahajr
 */
public class HelloConfirmDialog extends JFrame {
    
    public HelloConfirmDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur tindakan close window
        this.setLayout(new FlowLayout()); // Mengatur layout jendela menggunakan FlowLayout
        
        JButton button = new JButton("Exit"); // Membuat tombol dengan teks "Exit"
        // Mengatur batas (boundaries) tombol, yang tidak efektif dalam layout Flow
        button.setBounds(130,100,100,40);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan kotak dialog konfirmasi
                int confirmation = JOptionPane.showConfirmDialog(HelloConfirmDialog.this, "Apakah anda yakin ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirmation == JOptionPane.YES_OPTION)
                {
                    // Jika pengguna memilih "Yes", keluar dari aplikasi
                    System.exit(0);
                } else
                {
                    // Jika pengguna memilih "No", tampilkan pesan dialog lain
                    JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda menekan tombol NO");
                }
            }
        });
        
        this.add(button); // Menambahkan tombol ke jendela
        
        this.setSize(200,200); // Mengatur ukuran jendela
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Membuat objek HelloConfirmDialog
                HelloConfirmDialog h = new HelloConfirmDialog();
                h.setVisible(true);
            }
        });
    }
}

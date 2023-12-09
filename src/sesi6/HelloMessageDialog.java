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
public class HelloMessageDialog extends JFrame {
    
    public HelloMessageDialog() {
        // Mengatur operasi tombol close pada jendela
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // Mengatur layout jendela menggunakan FlowLayout
        this.setLayout(new FlowLayout());
        
        // Membuat tombol dengan teks 'Klik'
        JButton button = new JButton("Klik");
        // Mengatur batas (boundaries) tombol
        button.setBounds(130,100,100,40);
        
        // Menambahkan ActionListener ke tombol untuk menangani klik tombol
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 // Menampilkan dialog pesan "Halo selamat datang di praktikum pemrograman II"
                JOptionPane.showMessageDialog(HelloMessageDialog.this, "Halo selamat datang di praktikum pemrograman II");
            }
        });
        
        this.add(button); // Menambahkan tombol ke jendela
        
        this.setSize(200, 200); // Mengatur ukuran jendela
    }
    
    // Metode utama (main) untuk menjalankan aplikasi
public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            HelloMessageDialog h = new HelloMessageDialog(); // Membuat objek HelloMessageDialog
            h.setVisible(true); // Menjadikan jendela terlihat (visible)
        }
    });
}
}

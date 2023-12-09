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
public class HelloInputDialog extends JFrame {
    
    public HelloInputDialog() {
        // Mengatur tindakan close window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); // Mengatur layout jendela menggunakan FlowLayout
        
        // Membuat tombol dengan teks "Input"
        JButton button = new JButton("Input");
        // Mengatur batas (boundaries) tombol, yang tidak efektif dalam layout Flow
        button.setBounds(130,100,100,40);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Menampilkan kotak dialog input
                String nama = JOptionPane.showInputDialog(HelloInputDialog.this, "Inputkan nama anda");
                // Menampilkan pesan dialog dengan menyapa nama yang dimasukkan
                JOptionPane.showMessageDialog(HelloInputDialog.this, "Hello, "+nama);
            }
        });
        
        this.add(button); // Menambahkan tombol ke jendela
        
        this.setSize(200,200); // Mengatur ukuran jendela
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloInputDialog h = new HelloInputDialog();
                h.setVisible(true);
            }
        });
    }
    
}

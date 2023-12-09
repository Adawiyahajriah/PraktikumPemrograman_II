/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Adawiyahajr
 */
public class Latihan2 extends JFrame {
    
    public Latihan2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat label untuk judul form biodata
        JLabel headerlabel = new JLabel("From Biodata", JLabel.CENTER);
        
        // Membuat panel untuk mengelompokkan elemen-elemen form
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        // Membuat panel untuk form biodata utama
        JPanel panel = new JPanel();
        panel.setSize(300, 300);
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nama: "), gbc); // Label untuk Nama
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JTextField(""), gbc); // Kotak teks untuk Nama
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Nomor HP :"), gbc); // Label untuk Nomor HP
        
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JTextField(""), gbc); // Kotak teks untuk Nomor HP
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JLabel("Jenis kelamin :"), gbc); // Label untuk Jenis Kelamin
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JRadioButton ("Laki-laki"), gbc); // Radio button untuk Laki-laki
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JRadioButton ("Perempuan"), gbc); // Radio button untuk Perempuan
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(new JCheckBox ("Warga negara asing"), gbc); // Checkbox untuk Warga negara asing
        
        gbc.gridx = 0;
        gbc.gridy = 25;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 4;
        panel.add(new JButton("Simpan"), gbc); // Tombol "Simpan" untuk menyimpan data
        
        controlPanel.add(panel);
        
        this.setLayout(new GridLayout(2, 1));
        this.add(headerlabel);
        this.add(controlPanel);
        this.setSize(400, 400);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan2 h = new Latihan2();
                h.setVisible(true);
            }
        });
    }
}
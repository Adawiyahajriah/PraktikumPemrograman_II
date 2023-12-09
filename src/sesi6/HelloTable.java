/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

/**
 *
 * @author Yusup
 */
public class HelloTable extends JFrame{
    
    public HelloTable() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInput = new JLabel("Nama:"); // Membuat label dengan teks "Nama:"
        labelInput.setBounds(15,40,350,10); // Mengatur batas (boundaries) label
        
        JTextField textField = new JTextField(); // Membuat komponen input teks (TextField)
        textField.setBounds(15,60,350,30); // Mengatur batas TextField
        
        JLabel labelRadio = new JLabel("Jenis Member:"); // Membuat label dengan teks "Jenis Member:"
        labelRadio.setBounds(15,100,350,10); // Mengatur batas label
        
        // Membuat tombol radio Silver (dipilih sebagai default)
        JRadioButton radioButton1 = new JRadioButton("Silver", true); 
        radioButton1.setBounds(15,115,350,30); 
        
        JRadioButton radioButton2 = new JRadioButton("Gold"); // Membuat tombol radio Gold
        radioButton2.setBounds(15,145,350,30);
        
        JRadioButton radioButton3 = new JRadioButton("Platinum");
        radioButton3.setBounds(15, 175, 350, 30);

        
        // Membuat grup tombol radio untuk memastikan hanya satu yang dipilih
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);
        
        JButton button = new JButton("Simpan");
        button.setBounds(15,205,100,40);
        
        javax.swing.JTable table = new JTable(); // Membuat tabel
        JScrollPane scrollableTable = new JScrollPane(table); // Membungkus tabel dalam JScrollPane
        scrollableTable.setBounds(15,250,350,200); // Mengatur batas JScrollPane
        
        MyTableModel tableModel = new MyTableModel(); // Membuat model tabel kustom
        table.setModel(tableModel); // Mengatur model tabel yang akan digunakan
        
        button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String nama = textField.getText();
        String jenisMember = "";

        if (radioButton1.isSelected()) {
            jenisMember = radioButton1.getText();
        } else if (radioButton2.isSelected()) {
            jenisMember = radioButton2.getText();
        } else if (radioButton3.isSelected()) {
            jenisMember = radioButton3.getText();
        }

        // Memastikan bahwa nama dan jenis member tidak kosong sebelum ditambahkan ke tabel
        if (!nama.isEmpty() && !jenisMember.isEmpty()) {
            tableModel.add(new ArrayList<>(Arrays.asList(nama, jenisMember)));
        } else {
            // Tampilkan pesan kesalahan jika nama atau jenis member kosong
            JOptionPane.showMessageDialog(HelloTable.this, "Nama dan jenis member harus diisi.");
        }
    }
});

        
        this.add(button);
        this.add(textField);
        this.add(labelRadio); // Menambahkan label "Jenis Member" ke jendela
        this.add(radioButton1); // Menambahkan tombol radio Silver ke jendela
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(labelInput); // Menambahkan label "Nama" ke jendela
        this.add(scrollableTable); // Menambahkan JScrollPane dengan tabel ke jendela
        
        this.setSize(400,500);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloTable h = new HelloTable();
                h.setVisible(true);
            }
        }); 
    }  
}

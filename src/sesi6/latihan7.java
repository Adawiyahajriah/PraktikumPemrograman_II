/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Yusup
 */
public class latihan7 extends JFrame {
    
    private DefaultTableModel tableModel;
    
    public latihan7() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(15, 40, 350, 10);
        
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 60, 350, 30);
        
        JLabel labelNomorHP = new JLabel("Nomor HP:");
        labelNomorHP.setBounds(15, 100, 350, 10);
        
        JTextField textFieldNomorHP = new JTextField();
        textFieldNomorHP.setBounds(15, 120, 350, 30);
        
        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin:");
        labelJenisKelamin.setBounds(15, 160, 350, 10);
        
        JRadioButton radioButtonLakiLaki = new JRadioButton("Laki-Laki", true);
        radioButtonLakiLaki.setBounds(15, 180, 150, 30);
        
        JRadioButton radioButtonPerempuan = new JRadioButton("Perempuan");
        radioButtonPerempuan.setBounds(180, 180, 150, 30);
        
        JCheckBox checkBoxWNA = new JCheckBox("Warga Negara Asing");
        checkBoxWNA.setBounds(15, 220, 350, 30);
        
        ButtonGroup bgJenisKelamin = new ButtonGroup();
        bgJenisKelamin.add(radioButtonLakiLaki);
        bgJenisKelamin.add(radioButtonPerempuan);
        
        JButton button = new JButton("Simpan");
        button.setBounds(15, 260, 100, 40);
        
        JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15, 310, 350, 200);
        
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nama");
        tableModel.addColumn("Nomor HP");
        tableModel.addColumn("Jenis Kelamin");
        tableModel.addColumn("Warga Negara Asing");
        table.setModel(tableModel);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String nomorHP = textFieldNomorHP.getText();
                String jenisKelamin = radioButtonLakiLaki.isSelected() ? "Laki-Laki" : "Perempuan";
                String wna = checkBoxWNA.isSelected() ? "Ya" : "Tidak";
                
                if (!nama.isEmpty()) {
                    tableModel.addRow(new Object[] { nama, nomorHP, jenisKelamin, wna });
                    textFieldNama.setText("");
                    textFieldNomorHP.setText("");
                    bgJenisKelamin.clearSelection();
                    checkBoxWNA.setSelected(false);
                } else {
                    JOptionPane.showMessageDialog(HelloTable.this, "Nama harus diisi.");
                }
            }
        });

        this.add(button);
        this.add(textFieldNama);
        this.add(labelNama);
        this.add(textFieldNomorHP);
        this.add(labelNomorHP);
        this.add(labelJenisKelamin);
        this.add(radioButtonLakiLaki);
        this.add(radioButtonPerempuan);
        this.add(checkBoxWNA);
        this.add(scrollableTable);

        this.setSize(400, 600);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                latihan7 h = new latihan7();
                h.setVisible(true);
            }
        });
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi5;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Yusup
 */
public class Latihan extends JFrame { 
    
    public Latihan() { 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel headerlabel = new JLabel("Form Biodata", JLabel.CENTER);
        
        JLabel labelInput = new JLabel("Nama:"); 
        labelInput.setBounds(15, 40, 350, 10);

        JTextField textFieldNama = new JTextField(); 
        textFieldNama.setBounds(15, 60, 350, 30); 

        JLabel labelNoHP = new JLabel("Nomor HP:");
        labelNoHP.setBounds(15, 100, 350, 10); 

        JTextField textFieldNoHP = new JTextField(); 
        textFieldNoHP.setBounds(15, 120, 350, 30); 

        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin:"); 
        labelJenisKelamin.setBounds(15, 160, 350, 10); 

        JRadioButton radioButtonLakiLaki = new JRadioButton("Laki-Laki"); 
        radioButtonLakiLaki.setBounds(15, 180, 350, 30); 

        JRadioButton radioButtonPerempuan = new JRadioButton("Perempuan"); 
        radioButtonPerempuan.setBounds(15, 210, 350, 30);
        
        JCheckBox checkBoxWNA = new JCheckBox("Warga negara asing"); 
        checkBoxWNA.setBounds(15, 240, 350, 30);
        
        ButtonGroup bgJenisKelamin = new ButtonGroup(); 
        bgJenisKelamin.add(radioButtonLakiLaki); 
        bgJenisKelamin.add(radioButtonPerempuan); 

        JButton button = new JButton("Simpan"); 
        button.setBounds(15, 340, 100, 40); 

        JTextArea txtOutput = new JTextArea(""); 
        txtOutput.setBounds(15, 390, 350, 100); 

        button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                String jenisMember = ""; 
                if (radioButtonLakiLaki.isSelected()) { 
                    jenisMember = radioButtonLakiLaki.getText(); 
                }
                if (radioButtonPerempuan.isSelected()) { 
                    jenisMember = radioButtonPerempuan.getText(); 
                }
                if (checkBoxWNA.isSelected()) { 
                    jenisMember = checkBoxWNA.getText();
                }

                String nama = textFieldNama.getText();
                String noHP = textFieldNoHP.getText();
                String jenisKelamin = radioButtonLakiLaki.isSelected() ? "Laki-Laki" : "Perempuan"; 
                String wargaNegaraAsing = checkBoxWNA.isSelected() ? "Ya" : "Tidak"; 
                txtOutput.append("Hello " + nama + "\n"); 
                txtOutput.append("Nomor HP: " + noHP + "\n"); 
                txtOutput.append("Jenis Kelamin: " + jenisKelamin + "\n"); 
                textFieldNama.setText(""); 
                textFieldNoHP.setText(""); 
                checkBoxWNA.setSelected(false); 
            }
        });

        this.add(button); 
        this.add(textFieldNama);
        this.add(labelInput); 
        this.add(textFieldNoHP); 
        this.add(labelNoHP); 
        this.add(labelJenisKelamin); 
        this.add(radioButtonLakiLaki); 
        this.add(radioButtonPerempuan); 
        this.add(checkBoxWNA); 
        this.add(txtOutput); 

        this.setSize(400, 550); 
        this.setLayout(null); 
    }

     public static void main(String[] args) { 
        javax.swing.SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                Latihan L = new Latihan(); 
                L.setVisible(true);
            }
        });
    }
}

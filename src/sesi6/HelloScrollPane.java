/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi6;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Yusup
 */
public class HelloScrollPane extends JFrame {
    
    public HelloScrollPane() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Mengatur tindakan close window
        
        JLabel labelInput = new JLabel("Input Nama:"); // Membuat label dengan teks "Input Nama:"
        labelInput.setBounds(130,40,100,10); // Mengatur batas (boundaries) label
        
        JTextField textField = new JTextField(); // Membuat kotak teks
        textField.setBounds(130,100,100,40); // Mengatur batas (boundaries) kotak teks
        
        JButton button = new JButton("Klik"); // Membuat tombol dengan teks "Klik"
        button.setBounds(130,100,100,40); // Mengatur batas (boundaries) tombol
        
        JTextArea txtOutput = new JTextArea("");
        // Membuat area teks yang dapat di-scroll dengan JScrollPane
        JScrollPane scrollableTextArea = new JScrollPane(txtOutput);
        // Mengatur batas (boundaries) area teks yang dapat di-scroll
        scrollableTextArea.setBounds(130,150,100,100);
        // Mengatur kebijakan scroll horizontal
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         // Mengatur kebijakan scroll vertikal
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText(); // Mengambil teks dari kotak teks
                // Menambahkan teks ke area teks dengan pemformatan tertentu
                txtOutput.append("Hello "+nama+"\n");
            }
        });
        
        this.add(button); // Menambahkan tombol ke jendela
        this.add(textField); // Menambahkan kotak teks ke jendela
        this.add(labelInput); // Menambahkan label ke jendela
        this.add(scrollableTextArea); // Menambahkan area teks yang dapat di-scroll ke jendela
        
        this.setSize(400,500); // Mengatur ukuran jendela
        // Mengatur layout jendela menjadi null (tanpa layout manager)
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloScrollPane h = new HelloScrollPane();
                h.setVisible(true);
            }
        });
    }
    
}

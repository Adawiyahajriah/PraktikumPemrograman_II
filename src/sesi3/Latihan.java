/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi3;
import javax.swing.*; // untuk mengimpor semua kelas
import java.awt.event.ActionEvent; // untuk mengimpor semua kelas
import java.awt.event.ActionListener; // untuk mengimpor semua kelas

/**
 *
 * @author Yusup
 */
public class Latihan extends JFrame { // deklarasi kelas dan turunan dari kelas JFrame
    
    public Latihan() { // kelas latihan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // mengatur perilaku untuk menutup aplikasi

        JLabel labelInput = new JLabel("Nama:"); // membuat label teks nama
        labelInput.setBounds(15, 40, 350, 10); // untuk menentukan posisi ukuran

        JTextField textFieldNama = new JTextField(); // membuat input teks untuk memasukkan nama
        textFieldNama.setBounds(15, 60, 350, 30); // untuk menentukan posisi ukuran

        JLabel labelNoHP = new JLabel("Nomor HP:"); // membuat label dengan teks nomor hp
        labelNoHP.setBounds(15, 100, 350, 10); // untuk menentukan posisi ukuran

        JTextField textFieldNoHP = new JTextField(); // membuat input teks untuk memasukkan no hp
        textFieldNoHP.setBounds(15, 120, 350, 30); // untuk menentukan posisi ukuran

        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin:"); // membuat label dengan teks jenis kelamin
        labelJenisKelamin.setBounds(15, 160, 350, 10); // untuk menentukan posisi ukuran

        JRadioButton radioButtonLakiLaki = new JRadioButton("Laki-Laki"); // membuat tombol yang bisa diklik
        radioButtonLakiLaki.setBounds(15, 180, 350, 30); // untuk menentukan posisi ukuran

        JRadioButton radioButtonPerempuan = new JRadioButton("Perempuan"); // membuat tombol yang bisa diklik
        radioButtonPerempuan.setBounds(15, 210, 350, 30); // untuk menentukan posisi ukuran
        
        JCheckBox checkBoxWNA = new JCheckBox("Warga negara asing"); // membuat tombol yang bisa di centang
        checkBoxWNA.setBounds(15, 240, 350, 30); // untuk menentukan posisi ukuran
        
        ButtonGroup bgJenisKelamin = new ButtonGroup(); // utk membuat grup tombol radio
        bgJenisKelamin.add(radioButtonLakiLaki); // utk tombol yg bisa dipilih dalam satu waktu
        bgJenisKelamin.add(radioButtonPerempuan); // utk tombol yg bisa dipilih dalam satu waktu

        JButton button = new JButton("Simpan"); // untuk menyimpan teks
        button.setBounds(15, 340, 100, 40); // untuk menentukan posisi ukuran

        JTextArea txtOutput = new JTextArea(""); // untuk menampilkan teks yang disimpan
        txtOutput.setBounds(15, 390, 350, 100); // untuk menentukan posisi ukuran

        button.addActionListener(new ActionListener() { // menambahkan sebuah objek dan tombol dengan variabel button
            public void actionPerformed(ActionEvent e) { // untuk menentukan tindakan yg akan diambil
                String jenisMember = ""; // menginisialisasi pada nilai awal
                if (radioButtonLakiLaki.isSelected()) { // untuk memeriksa apakah tombol telah dipilih
                    jenisMember = radioButtonLakiLaki.getText(); // mengambil teks dari tombol radio dan disimpan
                }
                if (radioButtonPerempuan.isSelected()) { // untuk memeriksa apakah tombol telah dipilih
                    jenisMember = radioButtonPerempuan.getText(); // mengambil teks dari tombol radio dan disimpan
                }
                if (checkBoxWNA.isSelected()) { // untuk memeriksa apakah tombol telah dipilih
                    jenisMember = checkBoxWNA.getText(); // mengambil teks dari tombol radio dan disimpan
                }

                String nama = textFieldNama.getText(); // untuk teks yg dimasukkan pengguna
                String noHP = textFieldNoHP.getText(); // memasukkan nohp
                String jenisKelamin = radioButtonLakiLaki.isSelected() ? "Laki-Laki" : "Perempuan"; // untuk menentukan jenis kelamin yang dipilih
                String wargaNegaraAsing = checkBoxWNA.isSelected() ? "Ya" : "Tidak"; // menentukan status warga negara asing yg akan ditampilkan

                txtOutput.append("Hello " + nama + "\n"); // menampilkan teks yg sudah di input
                txtOutput.append("Nomor HP: " + noHP + "\n"); //menampikan ho np yg sudah di input
                txtOutput.append("Jenis Kelamin: " + jenisKelamin + "\n"); // menampilkan jenis kelamin yang dipilih
                textFieldNama.setText(""); // utk mengatur teks dalam input teks field nama
                textFieldNoHP.setText(""); // utk mengatur teks dalam input teks field nohp
                checkBoxWNA.setSelected(false); // Untuk mereset pilihan setelah simpan
            }
        });

        this.add(button); // untuk menambahkan tombol button
        this.add(textFieldNama); // untuk memasukkan nama pengguna
        this.add(labelInput); // untuk memberi petunjuk 
        this.add(textFieldNoHP); // untuk memasukkan no hp penggina
        this.add(labelNoHP); // untuk memberi petunjuk dengan memasukkan teks
        this.add(labelJenisKelamin); // untuk memberi petunjuk dengan pemilihan jenis kelamin
        this.add(radioButtonLakiLaki); // tombol utk memilik jenis kelamin laki-laki
        this.add(radioButtonPerempuan); // tombol utk memilik jenis kelamin perempuan
        this.add(checkBoxWNA); // untuk memilih status wna
        this.add(txtOutput); // hasil output program yg akan ditampilkan

        this.setSize(400, 550); // mengatur ukuran frame
        this.setLayout(null); // pengaturan tata letak frame menjadi null
    }

     public static void main(String[] args) { // titik awal eksekusi program java
        javax.swing.SwingUtilities.invokeLater(new Runnable() { // utk memastikan pembuatan swing terjadi di dalam utas yg benar
            public void run() { // untuk menginisialisasi dan menampilkan antarmuka pengguna
                Latihan L = new Latihan(); // kelas utama dari aplikasi
                L.setVisible(true); // frame yg akan ditampilkan
            }
        });
    }
}
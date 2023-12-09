/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenis_member;
import java.awt.event.*;
import java.util.UUID;
import dao.JenisMemberDao;

/**
 *
 * @author adawiyahajr
 */
public class JenisMemberButtonSimpanActionListener implements ActionListener {
    // variabel instance untuk menyimpan referensi ke JenisMemberFrame
    private JenisMemberFrame jenisMemberFrame;
    // variabel instance untuk menyimpan referensi ke JenisMemberDao
    private JenisMemberDao jenisMemberDao;

    // constructor untuk JenisMemberButtonSimpanActionListener
    public JenisMemberButtonSimpanActionListener(JenisMemberFrame jenisMemberFrame, JenisMemberDao jenisMemberDao) {
        this.jenisMemberFrame = jenisMemberFrame;
        this.jenisMemberDao = jenisMemberDao;
    }

    // metode yang diimplementasikan dari antarmuka ActionListener
    public void actionPerformed(ActionEvent e) {
        // mendapatkan nama jenis member dari JenisMemberFrame
        String nama = this.jenisMemberFrame.getNama();
        JenisMember jenisMember = new JenisMember();
        jenisMember.setId(UUID.randomUUID().toString());
        jenisMember.setNama(nama);

        // menambahkan jenis member ke JenisMemberFrame
        this.jenisMemberFrame.addJenisMember(jenisMember);
        // menyisipkan jenis member ke dalam database menggunakan JenisMemberDao
        this.jenisMemberDao.insert(jenisMember);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package member;
import jenis_member.JenisMember;
import java.awt.event.*;
import java.util.UUID;
import dao.MemberDao;

/**
 *
 * @author adawiyahajr
 */
public class MemberButtonSimpanActionListener implements ActionListener {
    // variabel instance untuk menyimpan referensi ke MemberFrame
    private MemberFrame memberFrame;
    // variabel instance untuk menyimpan referensi ke MemberDao
    private MemberDao memberDao;

    // constructor untuk MemberButtonSimpanActionListener
    public MemberButtonSimpanActionListener(MemberFrame memberFrame, MemberDao memberDao) {
        this.memberFrame = memberFrame;
        this.memberDao = memberDao;
    }

    // metode yang diimplementasikan dari antarmuka ActionListener
    public void actionPerformed(ActionEvent e) {
        // mendapatkan nama member dari MemberFrame
        String nama = this.memberFrame.getNama();
        // memeriksa apakah nama member kosong
        if (nama.isEmpty()) {
            this.memberFrame.showAlert("Nama tidak boleh kosong");
        } else {
            // jika nama tidak kosong, mendapatkan jenis member dari MemberFrame
            JenisMember jenisMember = this.memberFrame.getJenisMember();
            
            // membuat objek Member dengan ID unik, nama, dan jenis member yang diberikan
            Member member = new Member();
            member.setId(UUID.randomUUID().toString());
            member.setNama(nama);
            member.setJenisMember(jenisMember);

            // menambahkan member ke MemberFrame
            this.memberFrame.addMember(member);
            // menyisipkan member ke dalam database menggunakan MemberDao
            this.memberDao.insert(member);
        }
    }
}

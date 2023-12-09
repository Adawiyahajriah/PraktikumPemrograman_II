/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package member;
import jenis_member.JenisMember;

/**
 *
 * @author adawiyahajr
 */
public class Member {
    public String id; // variabel instance untuk menyimpan ID member
    public String nama; // variabel instance untuk menyimpan nama member
    // variabel instance untuk menyimpan jenis member dari kelas JenisMember
    public JenisMember jenisMember; 
    
    //  untuk mengatur nilai ID member
    public void setId(String id) {
        this.id = id;
    }
    
    // untuk mendapatkan nilai ID member
    public String getId() {
        return id;
    }
    
    // untuk mengatur nilai nama member
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // untuk mendapatkan nilai nama member
    public String getNama() {
        return nama;
    }
    
    // untuk mengatur nilai jenis member
    public void setJenisMember(JenisMember jenisMember) {
        this.jenisMember = jenisMember;
    }
    
    // untuk mendapatkan nilai jenis member
    public JenisMember getJenisMember() {
        return jenisMember;
    }
}

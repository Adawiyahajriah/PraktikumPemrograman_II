/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenis_member;

/**
 *
 * @author adawiyahajr
 */
public class JenisMember {
    private String id; // variabel instance untuk menyimpan ID jenis member
    private String nama; // variabel instance untuk menyimpan nama jenis member
    
    // untuk mengatur nilai ID jenis member
    public void setId(String id) {
        this.id = id;
    }
    
    // untuk mendapatkan nilai ID jenis member
    public String getId() {
        return id;
    }
    
    // untuk mengatur nilai nama jenis member
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // untuk mendapatkan nilai nama jenis member
    public String getNama() {
        return nama;
    }
    
}

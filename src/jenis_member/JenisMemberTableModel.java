/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jenis_member;
import javax.swing.table.*;
import java.util.List;

/**
 *
 * @author adawiyahajr
 */
class JenisMemberTableModel extends AbstractTableModel {

    // nama-nama kolom pada tabel
    private String[] columnNames = {"nama"};
    // data yang akan ditampilkan di tabel
    private List<JenisMember> data;

    // constructor kelas JenisMemberTableModel
    public JenisMemberTableModel(List<JenisMember> data) {
        this.data = data;
    }

    // mendapatkan jumlah kolom pada tabel
    public int getColumnCount() {
        return columnNames.length;
    }

    // mendapatkan jumlah baris pada tabel.
    public int getRowCount() {
        return data.size();
    }

    // mendapatkan nama kolom pada indeks tertentu
    public String getColumnName(int col) {
        return columnNames[col];
    }

    // mendapatkan nilai pada sel tabel yang diidentifikasi oleh baris dan kolom
    public Object getValueAt(int row, int col) {
        JenisMember rowItem = data.get(row);
        String value = "";

        // mengambil nilai sesuai dengan indeks kolom
        switch (col) {
            case 0:
                value = rowItem.getNama();
                break;
        }
        return value;
    }

    public boolean isCellEditable(int row, int col) {
        return false;
    }

    // menambahkan data baru ke tabel dan memberi tahu tabel untuk mengupdate tampilan
    public void add(JenisMember value) {
        data.add(value);
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}

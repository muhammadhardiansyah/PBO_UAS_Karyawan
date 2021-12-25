/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olahdata;

/**
 *
 * @author asus
 */
import gaji.*;
import java.util.ArrayList;
public class OlahData {
  
    // atribut untuk menyimpan data karyawan
    ArrayList<Karyawan> dataKaryawan = new ArrayList<Karyawan>();
    
    //tambah data karyawan
    public void tambahKaryawan(Karyawan data){
        this.dataKaryawan.add(data);
    }
    
    //garis
    void garis(){
        System.out.println("--------------------------------------------------------------------------------------------");
    }
    
    //cek ketersediaan Kode Karyawan
    public boolean findKode(String kode){
        boolean founded = false;
        int index = -1;
        for (int i=0; i<this.dataKaryawan.size();i++){
            if (this.dataKaryawan.get(i).kode.equals(kode)){
                index = i;
                founded = true;
            }
        }
        return founded;
    }
    
    //hapus data
    public void hapusKaryawan(String kode){
        this.dataKaryawan.removeIf(item -> item.kode.equals(kode));
    }
      
    //cari data
    public void cariKaryawan(String kode){
        boolean ketemu = false;
        int index = -1;
        for (int i = 0; i < this.dataKaryawan.size(); i++){
            if(this.dataKaryawan.get(i).kode.equals(kode)){
                index = i;
                ketemu = true;
            }
        }
        if (ketemu == true){
            this.garis();
            this.dataKaryawan.get(index).print();
            //perhitungan gaji
            char gol = this.dataKaryawan.get(index).golongan;
            String status = this.dataKaryawan.get(index).status;
            int usia = this.dataKaryawan.get(index).usia;
            int anak = this.dataKaryawan.get(index).anak;
            switch (gol) {
                case 'A':
                    A a = new A(status, usia, anak);
                    a.printGaji();
                    break;
                case 'B':
                    B b = new B(status, usia, anak);
                    b.printGaji();
                    break;
                case 'C':
                    C c = new C(status, usia, anak);
                    c.printGaji();
                    break;
                case 'D':
                    D d = new D(status, usia, anak);
                    d.printGaji();
                    break;
            }
        }
    }
    
    //tampilkan hasil
    public void lihatData(){
        this.garis();
        System.out.format("%12s%20s%8s%8s%16s%16s","KODE KARY", "NAMA KARY", "GOL", "USIA", "STATUS NIKAH", "JUMLAH ANAK");
        System.out.println("");
        this.garis();
        for(Karyawan item: this.dataKaryawan){
            item.printTable();
        }
        this.garis();
        System.out.println("Jumlah Data: "+this.dataKaryawan.size());
        this.garis();
        
    }
}

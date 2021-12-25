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
import java.time.*;
public class Karyawan {
    String kode, nama, alamat, status;
    LocalDate tglLahir;
    char golongan;
    int anak, usia;
    
    //konstruktor
    public Karyawan (String kode, String nama, char golongan, int usia ,String status, int anak){
        this.kode = kode;
        this.nama = nama;
        this.golongan = golongan;
        this.usia = usia;
        this.status = status;
        this.anak = anak;
    }    
    
    public void print(){
        System.out.println("Kode Karyawan           : "+this.kode);
        System.out.println("Nama Karyawan           : "+this.nama);
        System.out.println("Golongan                : "+this.golongan);
        System.out.println("Usia                    : "+this.usia);
        System.out.println("Status Menikah          : "+this.status);
        if (this.status.equals("Menikah")){
            System.out.println("Jumlah Anak             : "+this.anak);
        }
    }
    
    public void printTable(){
        System.out.format("%12s%20s%8s%8s%16s%16s", this.kode, this.nama, this.golongan, this.usia, this.status, this.anak);
        System.out.println("");
    }
}

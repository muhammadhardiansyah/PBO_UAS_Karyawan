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
import java.util.Scanner;
import java.time.*;
public class Setter {
    //instansiasi input
    Scanner input = new Scanner(System.in);
    //instansiasi OlahData
    OlahData data = new OlahData();
    
    //atribut
    String kode, nama, alamat, status;
    LocalDate tglLahir;
    char golongan;
    int anak, usia;
    
    //method set
    private String setKode(){
        String kode;
        while (true){
            System.out.print("Masukan Kode Karyawan         : ");
            String masukan = input.nextLine();
            if (masukan.equals("")){
                System.out.println("Masukan lagi.");
            } else{
                kode = masukan;
                break;
            }
        }
        return kode;
    }
    
    private String setNama(){
        String nama;
        while (true){
            System.out.print("Masukan Nama Karyawan         : ");
            String masukan = input.nextLine();
            if(masukan.equals("")){
                System.out.println("Masukan lagi");
            } else {
                nama = masukan;
                break;
            }
        }
        return nama;
    }
    
    private String setAlamat(){
        String alamat;
        while (true){
            System.out.print("Masukan Alamat                : ");
            String masukan = input.nextLine();
            if(masukan.equals("")){
                System.out.println("Masukan lagi");
            } else {
                alamat = masukan;
                break;
            }
        }
        return alamat;
    }
    
    private LocalDate setTglLhr(){
        LocalDate TglLhr;
        System.out.println("Masukan Tanggal Lahir");
        int tgl,bln,thn;
        while (true){
            System.out.print("Tanggal                       : ");
            int masukan = input.nextInt();
            if (masukan > 31 || masukan < 1){
                System.out.println("Masukan Kembali");
            } else {
                tgl = masukan;
                break;
            }
        }
        while (true){
            System.out.print("Bulan                         : ");
            int masukan = input.nextInt();
            if (masukan > 12 || masukan < 1){
                System.out.println("Masukan Kembali");
            } else {
                bln = masukan;
                break;
            }
        }
        while (true){
            System.out.print("Tahun                         : ");
            int masukan = input.nextInt();
            LocalDate today = LocalDate.now();
            if(masukan > today.getYear()){
                System.out.println("Masukan lagi. Tahun melebihi tahun ini.");
            } else {
                thn = masukan;
                break;
            }
        }
        TglLhr = LocalDate.of(thn, bln, tgl);
        return TglLhr;
    }
    
    private char setGolongan(){
        char Golongan;
        while (true){
            System.out.print("Masukan Golongan              : ");
            char masukan = input.next().charAt(0);
            if (masukan == 'A' || masukan == 'B' || masukan == 'C' || masukan == 'D'){
                Golongan = masukan;
                break;
            } else {
                System.out.println("Masukan Kembali. Pilih antara A, B, C, D");
            }
        }
        return Golongan;
    }
    
    private String setStatus(){
        int status;
        while (true){
            System.out.print("Masukan Status Menikah (0/1)  : ");
            int masukan = input.nextInt();
            if (masukan > 1){
                System.out.println("Masukan kembali.");
            } else {
                status = masukan;
                break;
            }
        }
        String output;
        if (status == 1){
            output = "Menikah";
        }else {
            output = "Belum Menikah";
        }
        return output;
    }
    
    private int setAnak(){
        int anak;
        while (true){
            System.out.print("Masukan Jumlah Anak           : ");
            int masukan = input.nextInt();
            if (masukan < 0){
                System.out.println("Masukan Kembali.");
            } else {
                anak = masukan;
                break;
            }
        }
        return anak;
    }
    
    //method set All
    public void settambahData(){
        data.garis();
        this.kode       = this.setKode();
        this.nama       = this.setNama();
        this.alamat     = this.setAlamat();
        this.tglLahir   = this.setTglLhr();
        this.golongan   = this.setGolongan();
        this.status     = this.setStatus();
        if (this.status.equals("Menikah")){
            this.anak   = this.setAnak();
        } else {
            this.anak   = 0;
        }
    }

    private int hitungUsia(){
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(this.tglLahir, today);
        this.usia = selisih.getYears();
        return usia;
    }
    
    //method get
    public String getKode(){
        return this.kode;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public LocalDate getTglLhr(){
        return this.tglLahir;
    }
    public char getGolongan(){
        return this.golongan;
    }
    public String getStatus(){
        return this.status;
    }
    public int getAnak(){
        return this.anak;
    }
    public int getUsia(){
        return this.hitungUsia();
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendataankaryawan;

/**
 *
 * @author asus
 */
import olahdata.*;
import java.util.Scanner;
public class Controller {
     //instansiasi setter
     Setter setter = new Setter();
     //instansiasi olahdata
     OlahData data = new OlahData();
     //instansiasi scanner
     Scanner input = new Scanner(System.in);
     
     //Tambah Data
     public void tambahData(){
         while (true){
             setter.settambahData();
             data.tambahKaryawan(new Karyawan(setter.getKode(), setter.getNama(), setter.getGolongan(), setter.getUsia(), setter.getStatus(), setter.getAnak()));
             System.out.println("-------------");
             System.out.println("1. Kembali ke menu utama");
             System.out.println("2. Tambah data kembali");
             System.out.print("Menu Pilihan    : ");
             int masukan = input.nextInt();
             input.nextLine();
             if (masukan == 1){
                 System.out.println("");
                 break;
             } else {
                 System.out.println("");
             }
         }
     }
     
     //Hapus Data
     public void hapusData(){
         while (true){
            String kode;
            while (true){
                System.out.print("Masukan kode karyawan           : ");
                String masukan = input.nextLine();
                boolean cek = data.findKode(masukan);
                if (cek == true){
                    kode = masukan;
                    break;
                } else {
                    System.out.println("Kode karyawan tidak ditemukan!");
                }
            }
            data.hapusKaryawan(kode);
            System.out.println("-------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Hapus data kembali");
            System.out.print("Menu Pilihan    : ");
            int masukan = input.nextInt();
            input.nextLine();
            if (masukan == 1){
                System.out.println("");
                break;
            } else {
                System.out.println("");
            }
         }
     }
     
     //Cari Data
     public void cariData(){
         while (true){
            String kode;
            while (true){
                System.out.print("Masukan kode karyawan           : ");
                String masukan = input.nextLine();
                boolean cek = data.findKode(masukan);
                if (cek == true){
                    kode = masukan;
                    break;
                } else {
                    System.out.println("Kode karyawan tidak ditemukan!");
                }
            }
            data.cariKaryawan(kode);
            System.out.println("-------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Cari data lagi");
            System.out.print("Menu Pilihan    : ");
            int masukan = input.nextInt();
            input.nextLine();
            if (masukan == 1){
                System.out.println("");
                break;
            } else {
                System.out.println("");
            }
         }
     }
     
     //Lihar Data
     public void lihatData(){
         while (true){
            data.lihatData();
            System.out.println("-------------");
            System.out.println("1. Kembali ke menu utama");
            System.out.print("Menu Pilihan    : ");
            int masukan = input.nextInt();
            input.nextLine();
            if (masukan == 1){
                System.out.println("");
                break;
            } else {
                System.out.println("");
                break;
            }
         }
     }
}

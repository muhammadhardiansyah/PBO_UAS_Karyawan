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
import java.util.Scanner;
public class PendataanKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instansiasi scanner
        Scanner input = new Scanner(System.in);
        //instansiasi controller
        Controller control = new Controller();
        
        //Jalankan aplikasi
        while (true){
            System.out.println("-------------------------------");
            System.out.println("---------MENU UTAMA------------");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.println("-------------------------------");
            System.out.print("Menu Plilihan   : ");
            int pilih = input.nextInt();
            input.nextLine();
            System.out.println("");
            
            if(pilih == 1){
                System.out.println("---------------------------");
                System.out.println("------TAMBAH DATA----------");
                System.out.println("---------------------------");
                control.tambahData();
                
            } else if (pilih == 2){
                System.out.println("---------------------------");
                System.out.println("-------HAPUS DATA----------");
                System.out.println("---------------------------");
                control.hapusData();
                
            } else if (pilih == 3){
                System.out.println("---------------------------");
                System.out.println("--------CARI DATA----------");
                System.out.println("---------------------------");
                control.cariData();
                
            } else if (pilih == 4){
                System.out.println("---------------------------");
                System.out.println("-------LIHAT DATA----------");
                System.out.println("---------------------------");
                control.lihatData();
                
            } else if (pilih == 5){
                System.out.println("TERIMAKASIH");
                System.exit(0);
                
            } else {
                System.out.println("Masukan dengan benar!");
            }
        }
    }
    
}

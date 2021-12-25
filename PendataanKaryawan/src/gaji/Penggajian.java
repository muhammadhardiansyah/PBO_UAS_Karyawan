/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;

/**
 *
 * @author asus
 */
import olahdata.*;
public abstract class Penggajian {
    double gjPokok, tjPasutri, tjPegawai, tjAnak, gjKotor, potongan, gjBersih;
    String status;
    int usia, anak;
    
    public Penggajian(String status, int usia, int anak){
        this.status = status;
        this.usia = usia;
        this.anak = anak;
    }
    
    protected abstract double gjPokok();
    
    protected double tjPasutri(){
        return this.tjPasutri = (10./100.) * this.gjPokok;
    }
    
    protected double tjPegawai(){
        return this.tjPegawai = (15./100.) * this.gjPokok;
    }
    
    protected double tjAnak(){
        return this.tjAnak = (5./100.) * this.gjPokok * this.anak;
    }
    
    protected double gjKotor(){
        return this.gjKotor = this.gjPokok + this.tjPasutri + this.tjPegawai + this.tjAnak;
    }
    
    protected double potongan(){
        return this.potongan = (2.5/100.) * this.gjKotor;
    }
    
    protected double gjBersih(){
        return this.gjBersih = this.gjKotor - this.potongan;
    }
    
    public void printGaji(){
        System.out.println("Gaji Pokok              : Rp "+this.gjPokok());
        if(this.status.equals("Menikah")){
            System.out.println("Tunjangan Istr/Suami    : Rp "+this.tjPasutri());
        } else {
            this.tjPasutri = 0;
        }
        if(this.usia > 30){
            System.out.println("Tunjangan Pegawai       : Rp "+this.tjPegawai());
        }else {
            this.tjPegawai = 0;
        }
        if (this.status.equals("Menikah") && this.anak > 0){
            System.out.println("Tunjangan Anak          : Rp "+this.tjAnak());
        } else {
            this.tjAnak = 0;
        }
        System.out.println("----------------------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp "+this.gjKotor());
        System.out.println("Potongan                : Rp "+this.potongan());
        System.out.println("----------------------------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp "+this.gjBersih());
        
    }
    
}

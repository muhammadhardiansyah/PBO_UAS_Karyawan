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
public class B extends Penggajian{
    public B(String status, int usia, int anak) {
        super(status, usia, anak);
    }
    @Override
    protected double gjPokok(){
        return this.gjPokok = 6000000.;
    }
}

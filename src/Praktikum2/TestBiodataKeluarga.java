/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import Latihan3.EncapSiswa;

/**
 *
 * @author Windows 10
 */
public class TestBiodataKeluarga {
    public static void main(String[] args){
        BiodataKeluarga keluarga = new BiodataKeluarga();
        keluarga.setnamaAyah("J");
        keluarga.setnamaIbu("S");
        keluarga.setnamaSendiri("B");
        keluarga.setUmur(18);
        keluarga.setnamaSaudara("F");
        keluarga.setAlamat("Kediri");
        keluarga.setHobi("Makan");
        keluarga.setCitacita("Naik Haji");
       
        
        
        
        System.out.println(" Umur : " + keluarga.getUmur());
        System.out.println (" Nama Ayah : " + keluarga.getnamaAyah());
        System.out.println(" Nama Ibu : " + keluarga.getnamaIbu());
        System.out.println(" Nama Sendiri : " + keluarga.getnamaSendiri());
        System.out.println(" Nama Saudara : " + keluarga.getnamaSaudara());
        System.out.println(" Alamat : " + keluarga.getAlamat()); 
        System.out.println(" Hobi : " + keluarga.getHobi());
        System.out.println(" Cita cita : " + keluarga.getCitacita());
    }
}

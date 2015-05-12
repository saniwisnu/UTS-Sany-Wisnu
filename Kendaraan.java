package com.company;

import javax.swing.*;

/**
 * Created by VAIO on 5/12/2015.
 */
class Kendaraan{
    public int kecepatanmaks;
    public int berat;
    public int kapasitas;


    public Kendaraan() {
        kecepatanmaks = 20;
        System.out.println("Kecepatan Maks Kendaraan : " + kecepatanmaks);

    }
}

class Mobil extends Kendaraan{
 public int JumlahRoda ;
    public Mobil(int K, int B, int KS, int J)
    {
        kecepatanmaks = K;
        berat = B;
        kapasitas = KS;
        JumlahRoda = J;

    }
 public void CetakSpesifikasi(){
     System.out.println("Kecepatan Maks Mobil : " + kecepatanmaks);
     System.out.println("Berat Mobil : "+ berat);
     System.out.println("Kapasitas Mobil : "+kapasitas);
     System.out.println("Jumlah Roda Mobil : " + JumlahRoda);
 }
    public void KecepatanMaks (int v){
        kecepatanmaks = v;
        System.out.println("Mobil dijalankan dengan kecepatan : "+ kecepatanmaks);
    }
}
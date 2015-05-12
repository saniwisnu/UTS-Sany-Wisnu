package com.company;

/**
 * Created by VAIO on 5/12/2015.
 */
public class Test {
    public static void main(String[] args)
    {
        Mobil porsche = new Mobil(200, 5000, 2, 4);
        porsche.CetakSpesifikasi();
        porsche.KecepatanMaks(100);
        porsche.KecepatanMaks(180);
    }
}



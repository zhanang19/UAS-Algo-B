/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasalgo1;

import java.util.Scanner;

/**
 *
 * @author zha
 */
public class UASAlgo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        boolean ulang = false, salah = false;
        int metode;
        double total = 0;

        System.out.println("Selamat datang di Big Castle");
        do {
            System.out.println("Harga paket website dan jasa tambahan");
            System.out.println("1. Web Profil Perusahaan Rp. 1.500.000");
            System.out.println("2. Sistem Informasi Akuntansi Rp. 5.000.000");
            System.out.println("3. Web Point of Sale Rp. 7.500.000");
            System.out.println("4. Layanan Server Rp. 1.000.000");
            System.out.println("5. Maintenance Rp. 7.000.000");
            do {                
                System.out.print("Masukkan pilihan paket : ");
                int jawab = input.nextInt();
                switch(jawab){
                    case 1:
                        total += 1500000;
                        salah = false;
                        break;
                    case 2:
                        total += 5000000;
                        salah = false;
                        break;
                    case 3:
                        total += 7500000;
                        salah = false;
                        break;
                    case 4:
                        total += 1000000;
                        salah = false;
                        break;
                    case 5:
                        total += 7000000;
                        salah = false;
                        break;
                    default:
                        System.out.println("Input salah!");
                        salah = true;
                }
            } while (salah);
            System.out.println("Total pembelian saat ini adalah Rp. " + total);
            do {
                System.out.println("Ingin menambah item?(y/n)");
                System.out.print("Masukkan pilihan : ");
                String jawab = scan.next();
                if (jawab.equalsIgnoreCase("y")) {
                    ulang = true;
                    salah = false;
                }else if (jawab.equalsIgnoreCase("n")) {
                    ulang = false;
                    salah = false;
                } else {
                    System.out.println("Input salah!");
                    salah = false;
                }
            } while (salah);
        } while (ulang);
        System.out.println("Setiap pembelian melebihi 8 juta dan menggunakan metode tunai akan mendapatkan diskon sebesar 10%");
        do {            
            System.out.println("Pilih metode pembayaran!");
            System.out.println("1. Tunai");
            System.out.println("2. Kredit");
            metode = input.nextInt();
            if (metode == 1 || metode == 2) {
                salah = false;
            } else {
                System.out.println("Input salah!");
                salah = true;
            }
        } while (salah);
        if (total >= 8000000 && metode == 1) {
            System.out.println("Selamat, anda mendapatkan diskon sebesar 10%");
            total = total * 0.9;
        }
        if (metode == 1) {
            System.out.println("Total pembelian anda sebesar Rp. " + total);
        } else {
            System.out.println("Besar angsuran anda sebesar Rp. " + (total/12) + " per bulan");
            System.out.println("Angsuran dicicil sebanyak 12 kali");
        }
        
    }
    
}

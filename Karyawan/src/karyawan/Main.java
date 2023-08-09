/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan;


/**
 *
 * @author This PC
 */
    class Karyawan {
    private String nama;
    private double gaji;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    //untuk menghitung bonus gaji (10%)
    public double hitungBonus() {
        double bonus = 0.1 * gaji; // 10% dari gaji
        return bonus;
    }
    
    //untuk menampilkan nama karyawan, gaji utama, dan bonus gaji
    public void infogaji() {
        System.out.println("Nama Karyawan: " + getNama());
        System.out.println("Gaji Utama: Rp. " + formatAngka(getGaji()));
        System.out.println("Bonus Gaji: Rp. " + formatAngka(hitungBonus()));
    }
    
    //berfungsi sebagai pemberi dua desima setelah koma agar angka atau nominal mudah dibaca
    private static String formatAngka(double angka) {
        return String.format("%.2f", angka);
    }
}

//mengatur dan menampilkan info dari code karyawan.infogaji
public class Main {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.setNama("Andi");
        karyawan.setGaji(10000000); //10.000.000

        karyawan.infogaji();
    }
}

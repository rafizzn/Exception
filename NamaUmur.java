package meetsevendemo;

import java.util.Scanner;

public class NamaUmur {
    public static void main(String[] args) {
        try{
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan umur dan nama anda: ");

        //memasukkan data umur dan nama
        int umur = scn.nextInt();
        String nama = scn.nextLine();
        if (nama.matches(".*\\d.*")){ //untuk memeriksa apakah String mengandung digit
            throw new RuntimeException("Nama tidak boleh mengandung angka");
        }
    
        if (umur < 0){ //memeriksa apakah umur mengandung angka negatif
            throw new Exception("Umur tidak dapat negatif");
        }   
        System.out.println("Umur anda: " +umur);
        System.out.println("Nama anda: "+nama);
        } catch (Exception e){
            System.out.println("Data yang dimasukkan tidak valid.");
        }
    }
}

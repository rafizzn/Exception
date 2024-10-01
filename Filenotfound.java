package IO_Exception;

import java.io.File;
import java.io.FileReader;

public class Filenotfound {
    public static void main(String[] args) {
        try { //Blok Try, mengandung kode yang mungkin akan di-throw exception
            File file = new File ("C://file.txt"); //Membuat file baru dengan path yang spesifik
            FileReader fr = new FileReader(file); //Membuat filereader untuk membaca file yang dipilih
        } catch (Exception e) { //Blok Catch, untuk menangkap throw dari exception
            System.out.println("Ada kesalahan"); //Menampilkan pesan error jika ada exception
        }
    }
}

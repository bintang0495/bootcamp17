/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author BINTANG
 */
public class Coba {

    /**
     * Coba aja merupakan sebuah method untuk mencoba dokumentasi
     */
    public void cobaAja() {
        System.out.println("Coba Aja");
    }

    /**
     * Coba lagi adalah fungsi mencoba kembali dengan nilai kembalian
     *
     * @return String "SAYA"
     */
    public String cobaLagi() {
        return "Saya";
    }

    /**
     * Menghitung perkalian dua angka
     *
     * @param a bertipe integer
     * @param b bertipe integer
     * @return nilai berkoma
     */
    public double perkalian(int a, int b) {
        return 0.0;
    }

    /**
     * fungsi untuk membuat seggitiga dengan menggunakan bintang
     *
     * @param tinggi integer
     * @return pola bintang segitiga
     */
    public String bintangSegitiga(int tinggi) {
        String hasil = "";
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                hasil += "*";
            }
            hasil += "\n";
        }
        return hasil;
    }

    /**
     * Menampilkan pecahan nominal dari parameter yang diinputkan
     *
     * @param parameter integer
     * @return pecahan perhitungan
     */
    public String pecahan(int parameter) {
        int nominal[] = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        int hasil[] = new int[nominal.length];
        String output = "";
        int i = 0;
        while (i < hasil.length) {
            hasil[i] = parameter / nominal[i];
            output += "Rp " + nominal[i] + " - " + hasil[i] + "\n";
            parameter = parameter - nominal[i] * hasil[i];
            i++;
        }
        return output;
    }

    /**
     * Menampilkan kartu yang berbeda-beda yang diampilkan sesuai banyak
     * parameter pemainnya
     *
     * @param pemain parameter pembagian
     * @return kartu yang didapatkan oleh masing-masing pemain
     */
    public String randomCards(int pemain) {
        String jenis[] = {"Hati", "Sekop", "Wajik", "Kriting"};
        String nilai[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        ArrayList<String> dekk = new ArrayList<String>();
        String result = "";
        int idx = 0;
        for (int i = 0; i < jenis.length; i++) {
            for (int j = 0; j < nilai.length; j++) {
                dekk.add(new String(nilai[j] + " " + jenis[i]));
            }
        }
        Collections.shuffle(dekk);
        for (int i = 1; i <= pemain; i++) {
            result += "Pemain " + i + " mendapat kartu : ";
            for (int j = 1; j < 52 / pemain; j++) {
                result += dekk.get(idx);
                if (j == (52 / pemain) - 1) {
                    result += ".\n";
                } else {
                    result += ", ";
                }
                idx++;
            }
        }
        return result;
    }
}

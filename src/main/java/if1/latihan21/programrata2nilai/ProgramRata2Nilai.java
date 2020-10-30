package if1.latihan21.programrata2nilai;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan rata-rata nilai mhs
 * 
 */

import java.util.Scanner; // import kelas Scanner

public class ProgramRata2Nilai {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int i, banyakMhs;
        double jum, x, rata;
        System.out.print("Banyaknya Mahasiswa : ");
        banyakMhs = masuk.nextInt();
        jum = 0;
        i = 1;
        while(i<=banyakMhs) {
            System.out.print("Nilai Mahasiswa Ke-"+i+" : ");
            x = masuk.nextFloat();
            jum += x;
            i++;
        }
        rata = jum / banyakMhs;
        System.out.println("Maka, Rata-rata dari nilainya adalah " + rata);
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}
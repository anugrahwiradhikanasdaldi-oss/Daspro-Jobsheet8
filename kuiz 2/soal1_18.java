//Nasdaldi Anugrah Wiradhika, 254107060017, SIB 1A
import java.util.Scanner;
public class soal1_18 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        //input jumlah mahasiwa 
        System.out.println("Masukkan jumlah mahasiswa:");
        int jumlah_mahasiswa = sc.nextInt();
        int[] nilai = new int[jumlah_mahasiswa];
        // input nilai
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }
        double total = 0;
        int lulus = 0, tidak_lulus = 0;
        // menghitung total, lulus, dan tidak lulus
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            total += nilai[i];
            if (nilai[i] >= 60) {
                lulus++;
            } else {
                tidak_lulus++;
            }
        }
        double rata_rata = total / jumlah_mahasiswa;
        // hasil dari program 
        System.out.print("\nNilai yang diinput: ");
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nRata-rata nilai: " + rata_rata);
        System.out.println("Jumlah lulus: " + lulus);
        System.out.println("Jumlah tidak lulus: " + tidak_lulus);
    }
}
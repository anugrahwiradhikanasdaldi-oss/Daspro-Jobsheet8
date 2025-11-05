package joobsheet9;
import java.util.Scanner;
public class PengelolaNilai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput: ");
        int banyak_mahasiswa = sc.nextInt();
        int[] nilai_Mahasiswa = new int[banyak_mahasiswa];
        for (int i = 0; i < nilai_Mahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai_Mahasiswa[i] = sc.nextInt();
        }        System.out.println();
        System.out.println("=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai_Mahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai_Mahasiswa[i]);
        }
        int nilai_tertinggi = nilai_Mahasiswa[0];
        int nilai_terrendah = nilai_Mahasiswa[0];
        int indeks_tertinggi = 0;
        int indeks_terrendah = 0;
        int total = 0;
        for (int i = 0; i < banyak_mahasiswa; i++) {
            if (nilai_Mahasiswa[i] > nilai_tertinggi) {
                nilai_tertinggi = nilai_Mahasiswa[i];
                indeks_tertinggi = i;
            }
            if (nilai_Mahasiswa[i] < nilai_terrendah) {
                nilai_terrendah = nilai_Mahasiswa[i];
                indeks_terrendah = i;
            }
            total += nilai_Mahasiswa[i];
        }
        double rata_rata = (double) total / banyak_mahasiswa;
        System.out.println();
        System.out.println("Nilai tertinggi  : " + nilai_tertinggi + " (mahasiswa ke-" + (indeks_tertinggi + 1) + ")");
        System.out.println("Nilai terendah   : " + nilai_terrendah + " (mahasiswa ke-" + (indeks_terrendah + 1) + ")");
        System.out.println("Rata-rata nilai  : " + rata_rata);
        sc.close();
    }
}
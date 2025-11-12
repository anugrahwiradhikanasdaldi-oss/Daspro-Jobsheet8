import java.util.Scanner;
public class SIAKAD18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            double rataRataSiswa = totalPerSiswa / jumlahMataKuliah;
            System.out.println("Rata-rata mahasiswa ke-" + (i + 1) + ": " + rataRataSiswa);
        }
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            double rataRataMatkul = totalPerMatkul / jumlahMahasiswa;
            System.out.println("Mata Kuliah " + (j + 1) + ": " + rataRataMatkul);
        }
        sc.close();
    }
}
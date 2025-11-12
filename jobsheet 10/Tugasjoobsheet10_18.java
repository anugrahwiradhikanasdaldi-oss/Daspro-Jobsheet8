import java.util.Scanner;

public class Tugasjoobsheet10_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;
        int[][] survei = new int[jumlahResponden][jumlahPertanyaan];
        System.out.println("=== INPUT HASIL SURVEI KEPUASAN PELANGGAN ===");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                survei[i][j] = sc.nextInt();
                while (survei[i][j] < 1 || survei[i][j] > 5) {
                    System.out.print("Nilai tidak valid, masukkan antara 1-5: ");
                    survei[i][j] = sc.nextInt();
                }
            }
        }
        System.out.println("\n=== Rata-rata per Responden ===");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survei[i][j];
            }
            double rataResponden = total / jumlahPertanyaan;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
        }
        System.out.println("\n=== Rata-rata per Pertanyaan ===");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survei[i][j];
            }
            double rataPertanyaan = total / jumlahResponden;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }
        double totalKeseluruhan = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / (jumlahResponden * jumlahPertanyaan);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Nilai rata-rata keseluruhan: " + rataKeseluruhan);

        sc.close();
    }
}

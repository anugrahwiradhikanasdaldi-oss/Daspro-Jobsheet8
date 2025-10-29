import java.util.*;

public class NilaiKelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 6) {
            System.out.println("Masukkan nama kelompok ke-" + (i + 1) + ": ");
            String kelompok = sc.nextLine();
            double total_nilai = 0, rata_nilai;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai dari kelompok penilai " + j + ": ");
                int nilai = sc.nextInt();
                total_nilai += nilai;
            }
            rata_nilai = total_nilai / 5;
            System.out.println("Rata-rata nilai dari " + kelompok + " adalah: " + rata_nilai);
            System.out.println("---------------------------------");
            i++;
        }
    }
}
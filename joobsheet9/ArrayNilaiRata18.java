package joobsheet9;
import java.util.Scanner; 
public class ArrayNilaiRata18 { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa :");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double TOTAL = 0;
        double total_lulus = 0;
        double total_tidaklulus = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ":");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                System.out.println("mahasiswa ke-" + (i + 1) + "lulus");
                total_lulus += nilaiMhs[i];
                lulus++;

            } else {
                System.out.println("mahasiswa ke-" + (i + 1) + "yang tidak lulus");
                total_tidaklulus += nilaiMhs[i];
                tidakLulus++;
            }

        }
        double rataSemua = TOTAL / nilaiMhs.length;
        double rataLulus = (lulus > 0) ? total_lulus / lulus : 0;
        double rataTidakLulus = (tidakLulus > 0) ? total_tidaklulus / tidakLulus : 0;

        System.out.println("Rata-rata nilai yang lulus :" + rataLulus);
        System.out.println("Rata-rata nilai yang tidak lulus :" + rataTidakLulus);

    }

}
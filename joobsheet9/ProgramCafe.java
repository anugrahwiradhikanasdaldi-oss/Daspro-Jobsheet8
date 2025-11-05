package joobsheet9;
import java.util.Scanner;
public class ProgramCafe {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jumlah_pesanan;
    System.out.println("masukan jumlah pesanan");
    jumlah_pesanan = sc.nextInt();
    sc.nextLine();
    String[] namaPesanan = new String[jumlah_pesanan];
        double[] hargaPesanan = new double[jumlah_pesanan];
        for (int i = 0; i < jumlah_pesanan; i++) {
            System.out.println();
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga " + namaPesanan[i] + ": Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        double totalBiaya = 0;
        for (int i = 0; i < jumlah_pesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }
        System.out.println();
        System.out.println("Daftar Pesanan");
        for (int i = 0; i < jumlah_pesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp " + totalBiaya);
        System.out.println("Terima kasih telah memesan di Kafe Kami!");
    }
}
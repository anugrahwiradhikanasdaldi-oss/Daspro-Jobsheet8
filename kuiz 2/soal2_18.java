//Nasdaldi Anugrah Wiradhika, 254107060017, SIB 1A
import java.util.Scanner;
public class soal2_18 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String[] nama_barang = {"Pensil", "Pulpen", "Buku", "Penghapus", "Penggaris"};
        int[] harga_barang = {2000, 3000, 5000, 1500, 2500};
        System.out.println("Daftar barang yang ada:");
        // hasil barang yang ada
        for (int i = 0; i < nama_barang.length; i++) {
            System.out.println((i+1) + ". " + nama_barang[i] + " - Rp " + harga_barang[i]);
        }
        // masukan barang yang ingin dicari
        System.out.print("\nBarang yang ingin dicari: ");
        String cari = sc.nextLine();

        int hasil = -1;
        // masukan barang yang ingin di cari ke 2
        for (int j = 0; j < nama_barang.length; j++) {
            if (cari.equalsIgnoreCase(nama_barang[j])) {
                hasil = j;
                break;
            }
        }
        // hasil barang yang ingin di cari
        if (hasil != -1) {
            System.out.println("Barang ditemukan!");
            System.out.println(nama_barang[hasil] + " harga: Rp " + harga_barang[hasil]);
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }
}

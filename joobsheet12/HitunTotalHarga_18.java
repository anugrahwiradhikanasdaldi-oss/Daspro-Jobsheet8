package joobsheet12;
import java.util.Scanner;
public class HitunTotalHarga_18 {
  public static int HitungTotalHarga(int pilihan_menu, int banyak_item, String kodePromo) {

    int[] harga_item = {15000, 20000, 22000, 12000, 10000, 18000};
    int totalHarga = harga_item[pilihan_menu - 1] * banyak_item;

    if (kodePromo.equals("DISKON50")) {
        System.out.println("Kode promo valid! Diskon 50%");
        totalHarga = totalHarga - (totalHarga / 2);
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Kode promo valid! Diskon 30%");
        totalHarga = totalHarga - (totalHarga * 30 / 100);
    } else {
        System.out.println("Kode promo invalid! Tidak ada diskon.");
    }
    return totalHarga;
}
}
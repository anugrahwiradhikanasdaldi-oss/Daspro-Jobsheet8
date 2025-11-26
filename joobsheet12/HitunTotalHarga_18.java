package joobsheet12;
import java.util.Scanner;
public class HitunTotalHarga_18 {
    public static void Menu() {
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("============================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int HitungTotalHarga (int pilihan_menu, int banyak_item){
        int [] harga_item = {15000, 20000, 22000, 12000, 10000, 18000};
        int harga_total = harga_item[pilihan_menu - 1] * banyak_item;
        return harga_total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        System.out.print("Masukkan pilihan menu, gunakan angka 1-6: ");
        int pilihan_menu = sc.nextInt();
        System.out.print("Masukkan jumlah item: ");
        int banyak_item = sc.nextInt();
        int total_harga = HitungTotalHarga(pilihan_menu, banyak_item);
        System.out.println("Total harga: Rp " + total_harga);
        sc.close();
    }
}
import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu;

        do {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    inputDataPenonton(sc, penonton);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 3);
    }
    static void inputDataPenonton(Scanner sc, String[][] penonton) {
        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            int baris, kolom;
            while (true) {
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();
                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println(" Nomor kursi tidak tersedia! Coba lagi.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("⚠️ Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Pilih kursi lain!");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    break; 
                }
            }
            System.out.print("Input penonton lainnya? (y/n): ");
            String next = sc.nextLine();
            if (next.equalsIgnoreCase("n")) {
            }
        }
    }
    static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("\nDaftar penonton");
        for (int i = 0; i < penonton.length; i++) {
            System.out.print("Baris " + (i + 1) + ": ");
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] == null) {
                    System.out.print("***\t");
                } else {
                    System.out.print(penonton[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

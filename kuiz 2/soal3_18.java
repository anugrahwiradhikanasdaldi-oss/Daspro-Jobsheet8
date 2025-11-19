// Nasdaldi Anugrah Wiradhika, 254107060017, SIB 1A
import java.util.Scanner;
public class soal3_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        char[][] kursi = new char[5][6];
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[0].length; j++) {
                kursi[i][j] = 'O';
            }
        }
        // menampilkan menu yang ada 
        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Pesan kursi");
            System.out.println("3. Batalkan pemesanan kursi");
            System.out.println("4. Hitung jumlah kursi kosong & terisi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                // menampilkan denah kursi
                case 1:
                    System.out.println("Denah Kursi (O = kosong, X = terisi)");
                    for (int i = 0; i < kursi.length; i++) {
                        for (int j = 0; j < kursi[0].length; j++) {
                            System.out.print(kursi[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                // memesan kursi pesan kursi
                case 2:
                    System.out.print("Masukkan baris (0-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (0-5): ");
                    int kolom = sc.nextInt();

                    if (kursi[baris][kolom] == 'O') {
                        kursi[baris][kolom] = 'X';
                        System.out.println("Kursi berhasil dipesan!");
                    } else {
                        System.out.println("Kursi sudah terisi!");
                    }
                    break;

                // membatalkan pemesanan
                case 3:
                    System.out.print("Masukkan baris (0-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (0-5): ");
                    kolom = sc.nextInt();

                    if (kursi[baris][kolom] == 'X') {
                        kursi[baris][kolom] = 'O';
                        System.out.println("Pemesanan berhasil dibatalkan!");
                    } else {
                        System.out.println("Kursi memang kosong!");
                    }
                    break;

                //perhitung jumlah kursi
                case 4:
                    int kosong = 0, terisi = 0;

                    for (int i = 0; i < kursi.length; i++) {
                        for (int j = 0; j < kursi[0].length; j++) {
                            if (kursi[i][j] == 'O')
                                kosong++;
                            else
                                terisi++;
                        }
                    }
                    System.out.println("Jumlah kursi kosong : " + kosong);
                    System.out.println("Jumlah kursi terisi : " + terisi);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 5);

        sc.close();
    }
}
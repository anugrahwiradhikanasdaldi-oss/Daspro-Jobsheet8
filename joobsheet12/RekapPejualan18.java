package joobsheet12;
import java.util.Scanner;
public class RekapPejualan18 {
    static Scanner sc = new Scanner(System.in);
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static void inputData(int[][] data) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input banyak penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }
    static void tampilData(int[][] data) {
        System.out.println("===== Rekap Penjualan Kafe Selama 7 Hari =====");
        System.out.printf("%-18s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("Hari %d ", h);
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-18s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%7d", data[i][j]);
            }
        }
        System.out.println();
    }
    static void menuTertinggi(int[][] data) {
        int maxTotal = 0;
        int indexMenuMax = 0;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMenuMax = i;
            }
        }
        System.out.println("Menu dengan total penjualan tertinggi:");
        System.out.println(menu[indexMenuMax] + " dengan total " + maxTotal);
        System.out.println();
    }
    static void rataRataMenu(int[][] data) {
        System.out.println("Rata-rata penjualan setiap menu selama 7 hari:");
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + " : " + rata);
        }
    }   
        public static void main(String[] args) {

        int[][] penjualan = new int[5][7];
        inputData(penjualan);
        tampilData(penjualan);
        menuTertinggi(penjualan);
        rataRataMenu(penjualan);
    }
}
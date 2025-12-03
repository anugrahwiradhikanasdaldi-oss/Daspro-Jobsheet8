import java.util.Scanner;

public class tugas1 {
    static int totalRekursif(int[] data, int index) {
        if (index == 0) {  
            return data[0];
        }
        return data[index] + totalRekursif(data, index - 1);  
    }
    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();
        int[] angka = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        int totalR = totalRekursif(angka, N - 1);
        int totalI = totalIteratif(angka);
        System.out.println("Total (rekursif)  : " + totalR);
        System.out.println("Total (iteratif)  : " + totalI);
    }
}

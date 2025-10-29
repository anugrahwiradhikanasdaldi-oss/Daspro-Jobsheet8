import java.util.Scanner;

public class KuadratBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int jumlah = 0;
        for (int k = 1; k <= n; k++) {
            jumlah = 0;
            System.out.print("n = " + k + " jumlah kuadrat = ");
            for (int i = 1; i <= k; i++) {
                jumlah += i * i;
                System.out.print(i * i);
                if (i < k) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
    }
}

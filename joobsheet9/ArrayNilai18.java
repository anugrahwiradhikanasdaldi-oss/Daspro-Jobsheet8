package joobsheet9;
import java.util.Scanner;
public class ArrayNilai18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai_ahir = new int [10];
        for (int i=0 ; i< nilai_ahir.length ; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai_ahir[i] = input.nextInt();
        }
        for (int i=0 ; i< nilai_ahir.length ; i++){
            if (nilai_ahir[i] < 70) {
                System.out.println("Nilai ke-" + (i+1) + " lulus" );
            } else {
                System.out.println("Nilai ke-" + (i+1) + " tidak lulus" );
            }
      }
    }
}
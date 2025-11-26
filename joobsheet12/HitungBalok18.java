package joobsheet12;
import java.util.Scanner;
public class HitungBalok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;        
        System.out.print("Masukkan panjang balok: ");
         p = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
         l = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
         t = sc.nextInt();

         vol = p * l * t;
         L = 2 * (p * l + p * t + l * t);

        System.out.println("Volume balok: " + vol);
        System.out.println("Luas permukaan balok: " + L);
    }
    static int hitungLuas (int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
    static int hitungVolume (int a, int b, int tinggi) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}

package joobsheet12;
import java.util.Scanner;
public class kubus18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi, volume, luarPermukaan;
         System.out.print("Masukkan nilai sisi: ");
         sisi = sc.nextInt();
        volume = sisi * sisi * sisi;
        luarPermukaan = 6 * sisi * sisi;
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luarPermukaan);
    }
    static int hitungLuas(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }
    static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
}
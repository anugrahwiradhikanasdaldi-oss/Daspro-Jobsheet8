package joobsheet12;

public class pengunjungkafe18 {
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Pengunjung Kafe:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println((i + 1) + ". " + namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

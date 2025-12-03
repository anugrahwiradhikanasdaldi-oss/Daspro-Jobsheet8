package joobsheet12;

public class pengunjungkafe18 {
static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Pengunjung Kafe:");
    int nomor = 1;
    for (String nama : namaPengunjung) {
        System.out.println(nomor + ". " + nama);
        nomor++;
    }
}
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

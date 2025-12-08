package CM;
import java.util.ArrayList;
import java.util.Scanner;
public class CM2Magang18 {
    static Scanner sc = new Scanner(System.in);
    static class Magang {
        String nama, nim, prodi, perusahaan, status;
        int semester;
    }
    static ArrayList<Magang> daftarMagang = new ArrayList<>();
    // menu utama
    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("===== MAGANG MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Semua");
            System.out.println("3. Cari berdasarkan Prodi");
            System.out.println("4. Hitung pendaftar berdasarkan status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> tampilSemua();
                case 3 -> cariProdi();
                case 4 -> hitung_pendaftar_berdasarkan_status();
                case 5 -> System.out.println("Keluar dari menu, Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    // input data
    static void tambahData() {
        Magang m = new Magang();
        System.out.print("Nama Mahasiswa : ");
        m.nama = sc.nextLine();
        System.out.print("NIM            : ");
        m.nim = sc.nextLine();
        // validasi prodi SIB / TI
        while (true) {
            System.out.print("Program Studi (SIB/TI): ");
            m.prodi = sc.nextLine();

            if (m.prodi.equalsIgnoreCase("SIB") ||
                m.prodi.equalsIgnoreCase("TI"))
                break;
            System.out.println("Prodi hanya boleh SIB atau TI!");
        }

        System.out.print("Perusahaan     : ");
        m.perusahaan = sc.nextLine();

        while (true) {
            System.out.print("Semester (6 atau 7): ");
            m.semester = sc.nextInt();
            sc.nextLine();
            if (m.semester == 6 || m.semester == 7) break;
            System.out.println("Semester hanya boleh 6 atau 7!");
        }

        while (true) {
            System.out.print("Status (Diterima/Menunggu/Ditolak): ");
            m.status = sc.nextLine();
            if (m.status.equalsIgnoreCase("Diterima") ||
                m.status.equalsIgnoreCase("Menunggu") ||
                m.status.equalsIgnoreCase("Ditolak"))
                break;

            System.out.println("Status tidak valid!");
        }

        daftarMagang.add(m);
        System.out.println("Data berhasil ditambahkan.");
    }

    // menampilkan semua data
    static void tampilSemua() {
        if (daftarMagang.isEmpty()) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("\nNo\tNama\tNIM\tProdi\tPerusahaan\tSemester\tStatus");
        int no = 1;
        for (Magang m : daftarMagang) {
            System.out.println(no++ + "\t" + m.nama + "\t" + m.nim + "\t" + m.prodi +"\t" + m.perusahaan + "\t" + m.semester + "\t\t" + m.status);
        }
    }
    // mencari prodi
    static void cariProdi() {
        System.out.print("Masukkan Program Studi (SIB/TI): ");
        String cari = sc.nextLine();
        boolean data_mahasiswa = false;

        System.out.println("\nNama Mahasiswa\tNIM\tStatus");

        for (Magang m : daftarMagang) {
            if (m.prodi.equalsIgnoreCase(cari)) {
                System.out.println(m.nama + "\t" + m.nim + "\t" + m.status);
                data_mahasiswa = true;
            }
        }
        if (!data_mahasiswa) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    // hitung pendaftar berdasarkan status
    static void hitung_pendaftar_berdasarkan_status() {
    int diterima = 0, menunggu = 0, ditolak = 0;

    for (Magang m : daftarMagang) {
        switch (m.status.toLowerCase()) {
            case "diterima" -> diterima++;
            case "menunggu" -> menunggu++;
            case "ditolak" -> ditolak++;
        }
    }
    int total = diterima + menunggu + ditolak;
    System.out.println("Diterima : " + diterima);
    System.out.println("Menunggu : " + menunggu);
    System.out.println("Ditolak  : " + ditolak);
    System.out.println("Total pendaftar: " + total);
}
}
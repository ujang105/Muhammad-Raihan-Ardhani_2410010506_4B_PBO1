package rentaloutdoorcamping;

import java.util.ArrayList;
import java.util.Scanner;

public class Rental {

    private ArrayList<Peralatan> daftarPeralatan = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahPeralatan(Peralatan p) {
        daftarPeralatan.add(p);
        System.out.println("Data berhasil ditambahkan.");
    }

    public void tampilPeralatan() {

        if (daftarPeralatan.isEmpty()) {
            System.out.println("Data masih kosong.");
            return;
        }

        System.out.println("\n===== DAFTAR PERALATAN =====");

        for (Peralatan p : daftarPeralatan) {
            p.tampilData();
        }

    }

    public void cariPeralatan() {

        System.out.print("Masukkan ID Peralatan : ");
        String id = input.nextLine();

        boolean ketemu = false;

        for (Peralatan p : daftarPeralatan) {

            if (p.getId().equalsIgnoreCase(id)) {

                p.tampilData();
                ketemu = true;
                break;

            }

        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan.");
        }

    }

    public void editPeralatan() {

        System.out.print("Masukkan ID yang akan diedit : ");
        String id = input.nextLine();

        for (Peralatan p : daftarPeralatan) {

            if (p.getId().equalsIgnoreCase(id)) {

                System.out.print("Nama Baru : ");
                p.setNama(input.nextLine());

                System.out.print("Kategori Baru : ");
                p.setKategori(input.nextLine());

                System.out.print("Harga Baru : ");
                p.setHargaSewa(input.nextDouble());

                System.out.print("Stok Baru : ");
                p.setStok(input.nextInt());
                input.nextLine();

                System.out.print("Kondisi Baru : ");
                p.setKondisi(input.nextLine());

                System.out.println("Data berhasil diubah.");

                return;

            }

        }

        System.out.println("ID tidak ditemukan.");

    }

    public void hapusPeralatan() {

        System.out.print("Masukkan ID yang akan dihapus : ");
        String id = input.nextLine();

        for (Peralatan p : daftarPeralatan) {

            if (!p.getId().equalsIgnoreCase(id)) {
            } else {
                daftarPeralatan.remove(p);

                System.out.println("Data berhasil dihapus.");

                return;
            }

        }

        System.out.println("Data tidak ditemukan.");

    }

    public void sewaPeralatan() {

        System.out.print("Masukkan ID Peralatan : ");
        String id = input.nextLine();

        for (Peralatan p : daftarPeralatan) {

            if (p.getId().equalsIgnoreCase(id)) {

                if (p.getStok() > 0) {

                    System.out.print("Nama Penyewa : ");
                    String nama = input.nextLine();

                    System.out.print("Lama Sewa (Hari): ");
                    int hari = input.nextInt();
                    input.nextLine();

                    p.setStok(p.getStok() - 1);

                    if (p.getStok() == 0) {
                        p.setStatus("Disewa");
                    }

                    Transaksi t = new Transaksi(nama, p, hari);

                    t.tampilTransaksi();

                    return;

                } else {

                    System.out.println("Stok habis.");

                    return;

                }

            }

        }

        System.out.println("Peralatan tidak ditemukan.");

    }

    public void kembalikanPeralatan() {

        System.out.print("Masukkan ID Peralatan : ");
        String id = input.nextLine();

        for (Peralatan p : daftarPeralatan) {

            if (p.getId().equalsIgnoreCase(id)) {

                p.setStok(p.getStok() + 1);

                p.setStatus("Tersedia");

                System.out.println("Peralatan berhasil dikembalikan.");

                return;

            }

        }

        System.out.println("Peralatan tidak ditemukan.");

    }

    public void dataAwal() {

        daftarPeralatan.add(new Tenda(
                "TD001",
                "Tenda Dome",
                "Tenda",
                80000,
                5,
                "Baik",
                "Tersedia",
                4));

        daftarPeralatan.add(new Carrier(
                "CR001",
                "Carrier Eiger",
                "Tas",
                50000,
                3,
                "Baik",
                "Tersedia",
                60));

        daftarPeralatan.add(new SleepingBag(
                "SB001",
                "Sleeping Bag Polar",
                "Sleeping Bag",
                30000,
                8,
                "Baik",
                "Tersedia",
                "L"));

        daftarPeralatan.add(new Kompor(
                "KP001",
                "Kompor Portable",
                "Kompor",
                25000,
                4,
                "Baik",
                "Tersedia",
                "Gas"));

        daftarPeralatan.add(new LampuCamping(
                "LP001",
                "Lampu LED",
                "Lampu",
                15000,
                10,
                "Baik",
                "Tersedia",
                12));

    }

}
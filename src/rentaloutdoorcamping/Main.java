package rentaloutdoorcamping;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rental rental = new Rental();

        rental.dataAwal();

        int pilihan;

        do {

            System.out.println("\n==========================================");
            System.out.println(" SISTEM MANAJEMEN RENTAL OUTDOOR CAMPING");
            System.out.println("==========================================");
            System.out.println("1. Tambah Peralatan");
            System.out.println("2. Tampilkan Peralatan");
            System.out.println("3. Cari Peralatan");
            System.out.println("4. Edit Peralatan");
            System.out.println("5. Hapus Peralatan");
            System.out.println("6. Sewa Peralatan");
            System.out.println("7. Kembalikan Peralatan");
            System.out.println("8. Keluar");
            System.out.println("==========================================");
            System.out.print("Pilih Menu : ");

            try {

                pilihan = input.nextInt();
                input.nextLine();

                switch (pilihan) {

                    case 1 -> {
                        System.out.println("\n=== Tambah Peralatan ===");

                        System.out.print("ID             : ");
                        String id = input.nextLine();

                        System.out.print("Nama           : ");
                        String nama = input.nextLine();

                        System.out.print("Kategori       : ");
                        String kategori = input.nextLine();

                        System.out.print("Harga Sewa     : ");
                        double harga = input.nextDouble();

                        System.out.print("Stok           : ");
                        int stok = input.nextInt();
                        input.nextLine();

                        System.out.print("Kondisi        : ");
                        String kondisi = input.nextLine();

                        Peralatan p = new Peralatan(
                                id,
                                nama,
                                kategori,
                                harga,
                                stok,
                                kondisi,
                                "Tersedia");

                        rental.tambahPeralatan(p);
                    }

                    case 2 -> rental.tampilPeralatan();

                    case 3 -> rental.cariPeralatan();

                    case 4 -> rental.editPeralatan();

                    case 5 -> rental.hapusPeralatan();

                    case 6 -> rental.sewaPeralatan();

                    case 7 -> rental.kembalikanPeralatan();

                    case 8 -> System.out.println("\nTerima kasih telah menggunakan program.");

                    default -> System.out.println("Menu tidak tersedia.");

                }

            } catch (Exception e) {

                System.out.println("Input harus berupa angka.");

                input.nextLine();

                pilihan = 0;

            }

        } while (pilihan != 8);

    }

}
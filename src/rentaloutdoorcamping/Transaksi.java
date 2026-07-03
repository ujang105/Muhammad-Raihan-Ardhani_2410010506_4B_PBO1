package rentaloutdoorcamping;

public class Transaksi {

    private String namaPenyewa;
    private Peralatan peralatan;
    private int lamaSewa;
    private double totalBayar;

    public Transaksi(String namaPenyewa, Peralatan peralatan, int lamaSewa) {

        this.namaPenyewa = namaPenyewa;
        this.peralatan = peralatan;
        this.lamaSewa = lamaSewa;

        totalBayar = peralatan.getHargaSewa() * lamaSewa;
    }

    public void tampilTransaksi() {

        System.out.println("\n========== STRUK SEWA ==========");
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Peralatan    : " + peralatan.getNama());
        System.out.println("Lama Sewa    : " + lamaSewa + " Hari");
        System.out.println("Total Bayar  : Rp." + totalBayar);
        System.out.println("===============================");
    }
}
package rentaloutdoorcamping;

public class SleepingBag extends Peralatan {

    private String ukuran;

    public SleepingBag(String id, String nama, String kategori,
            double hargaSewa, int stok,
            String kondisi, String status,
            String ukuran) {

        super(id, nama, kategori, hargaSewa, stok, kondisi, status);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Ukuran         : " + ukuran);
    }
}
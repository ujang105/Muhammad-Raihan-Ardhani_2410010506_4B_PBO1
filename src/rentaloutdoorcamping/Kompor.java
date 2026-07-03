package rentaloutdoorcamping;

public class Kompor extends Peralatan {

    private String jenisBahanBakar;

    public Kompor(String id, String nama, String kategori,
            double hargaSewa, int stok,
            String kondisi, String status,
            String jenisBahanBakar) {

        super(id, nama, kategori, hargaSewa, stok, kondisi, status);
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bahan Bakar    : " + jenisBahanBakar);
    }
}
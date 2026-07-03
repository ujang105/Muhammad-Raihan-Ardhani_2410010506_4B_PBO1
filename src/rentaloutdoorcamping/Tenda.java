package rentaloutdoorcamping;

public class Tenda extends Peralatan {

    private int kapasitas;

    public Tenda(String id, String nama, String kategori,
            double hargaSewa, int stok,
            String kondisi, String status,
            int kapasitas) {

        super(id, nama, kategori, hargaSewa, stok, kondisi, status);
        this.kapasitas = kapasitas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Kapasitas      : " + kapasitas + " Orang");
    }

}

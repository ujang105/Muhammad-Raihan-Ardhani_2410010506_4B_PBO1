package rentaloutdoorcamping;

public class LampuCamping extends Peralatan {

    private int daya;

    public LampuCamping(String id, String nama, String kategori,
            double hargaSewa, int stok,
            String kondisi, String status,
            int daya) {

        super(id, nama, kategori, hargaSewa, stok, kondisi, status);
        this.daya = daya;
    }

    public int getDaya() {
        return daya;
    }

    public void setDaya(int daya) {
        this.daya = daya;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Daya           : " + daya + " Watt");
    }
}
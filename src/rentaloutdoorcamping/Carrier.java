package rentaloutdoorcamping;

public class Carrier extends Peralatan {

    private int volume;

    public Carrier(String id, String nama, String kategori,
            double hargaSewa, int stok,
            String kondisi, String status,
            int volume) {

        super(id, nama, kategori, hargaSewa, stok, kondisi, status);
        this.volume = volume;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Volume         : " + volume + " Liter");
    }

}
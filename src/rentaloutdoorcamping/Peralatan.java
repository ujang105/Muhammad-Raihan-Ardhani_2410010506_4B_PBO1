
package rentaloutdoorcamping;


public class Peralatan {
    
    private String id;
    private String nama;
    private String kategori;
    private double hargaSewa;
    private  int stok;
    private String kondisi;
    private String status;

public Peralatan (){
    
}

public Peralatan(String id,String nama,String kategori,double hargaSewa,int stok, String kondisi, String status){
    
    this.id =id;
    this.nama = nama;
    this.kategori = kategori;
    this.hargaSewa = hargaSewa;
    this.stok = stok;
    this.kondisi= kondisi;
    this.status = status;
    
}

public String getid(){
    return id;
}

public void setld(String id){
    this.id =id;
}

public String getNama(){
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public String getKatagori(){
    return kategori;
}

public void setKatagori(String kategori) {
    this.kategori = kategori;
}

public double getHargaSewa(){
    return hargaSewa;
}

public void setHargaSewa(double hargaSewa){
    this.hargaSewa = hargaSewa;
}

public int getstok(){
    return stok;
}

public void setStok(int stok){
    this.stok = stok;
}

public String getKondisi(){
    return kondisi;
}

public void setKondisi(String kondisi) {
    this.kondisi = kondisi;
}

public String getStatus(){
    return status;
}

public void setStatus(String status){
    this.status = status;
}

public void tampilanData(){
    
    
    System.out.println("==========================================");
    System.out.println("ID                     : " +id);
    System.out.println("Nama                   : " +nama);
    System.out.println("Kategori               : " +kategori);
    System.out.println("Harga Sewa             : Rp." +hargaSewa);
    System.out.println("Stok                   : " + stok);
    System.out.println("Kondisi                : " + kondisi);
    System.out.println("Status                 : " + status);
    System.out.println("==========================================");
    
    
}

    void tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}

# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini merupakan aplikasi sederhana **Sistem Manajemen Rental Outdoor Camping** yang dibuat menggunakan bahasa pemrograman Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk mengelola data peralatan outdoor camping yang disewakan. Pengguna dapat menambahkan, menampilkan, mencari, mengubah, dan menghapus data peralatan. Selain itu, aplikasi juga dapat digunakan untuk melakukan proses penyewaan, pengembalian peralatan, serta menghitung total biaya sewa berdasarkan lama penyewaan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam Pemrograman Berorientasi Objek (Object Oriented Programming/OOP), seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, Input Output Sederhana, ArrayList, dan Error Handling.

---

# Penjelasan Kode

Berikut merupakan bagian kode yang berkaitan dengan konsep-konsep OOP yang diterapkan pada program.

## 1. Class

Class merupakan blueprint atau rancangan dasar untuk membuat objek. Pada program ini terdapat beberapa class, yaitu `Peralatan`, `Tenda`, `Carrier`, `SleepingBag`, `Kompor`, `LampuCamping`, `Rental`, `Transaksi`, dan `Main`.

```java
public class Peralatan {
    ...
}

public class Tenda extends Peralatan {
    ...
}

public class Main {
    ...
}
```

---

## 2. Object

Object merupakan hasil dari pembuatan class. Pada program ini object dibuat untuk menyimpan data peralatan.

```java
Rental rental = new Rental();

Peralatan p = new Tenda(
    "TD001",
    "Tenda Dome",
    "Tenda",
    80000,
    5,
    "Baik",
    "Tersedia",
    4
);
```

---

## 3. Atribut

Atribut digunakan untuk menyimpan data setiap peralatan.
Atribut yang digunakan antara lain:

- id
- nama
- kategori
- hargaSewa
- stok
- kondisi
- status

```java
private String id;
private String nama;
private String kategori;
private double hargaSewa;
private int stok;
private String kondisi;
private String status;
```

---

## 4. Constructor

Constructor digunakan untuk menginisialisasi data objek ketika objek dibuat.

```java
public Peralatan(String id, String nama,
String kategori,
double hargaSewa,
int stok,
String kondisi,
String status){

    this.id = id;
    this.nama = nama;
    this.kategori = kategori;
    this.hargaSewa = hargaSewa;
    this.stok = stok;
    this.kondisi = kondisi;
    this.status = status;
}
```

---

## 5. Mutator (Setter)

Setter digunakan untuk mengubah nilai atribut. Method ini digunakan ketika pengguna melakukan proses edit data peralatan.


```java
public void setNama(String nama){
    this.nama = nama;
}

public void setHargaSewa(double hargaSewa){
    this.hargaSewa = hargaSewa;
}
```

---

## 6. Accessor (Getter)

Getter digunakan untuk mengambil nilai atribut. Method ini dipanggil saat program menampilkan data, mencari data, maupun menghitung biaya penyewaan.

```java
public String getId(){
    return id;
}

public String getNama(){
    return nama;
}
```

---

## 7. Encapsulation

Encapsulation diterapkan dengan membuat seluruh atribut menjadi `private` sehingga data tidak dapat diakses secara langsung dari luar class , Data hanya dapat diakses melalui method getter dan setter.

```java
private String id;
private String nama;
private double hargaSewa;
```

---

## 8. Inheritance

Inheritance digunakan agar class turunan dapat mewarisi atribut dan method dari class `Peralatan`. Dengan konsep ini, penulisan kode menjadi lebih efisien karena atribut yang sama tidak perlu ditulis berulang kali.

```java
public class Tenda extends Peralatan{

}

public class Carrier extends Peralatan{

}
```

---

## 9. Polymorphism

Polymorphism diterapkan melalui method `tampilData()` yang dioverride pada setiap class turunan.Meskipun menggunakan nama method yang sama, setiap class turunan dapat menampilkan informasi tambahan yang berbeda sesuai jenis peralatan.

```java

```java
@Override
public void tampilData(){
    super.tampilData();
    System.out.println("Kapasitas : "
            + kapasitas + " Orang");
}
```

---

## 10. Seleksi

Seleksi digunakan menggunakan `if-else` dan `switch-case`. if-else digunakan untuk mencari data berdasarkan ID dan melakukan validasi data.
- switch-case digunakan untuk menjalankan menu yang dipilih pengguna

```java
if(p.getId().equals(id)){
    System.out.println("Data ditemukan");
}else{
    System.out.println("Data tidak ditemukan");
}
```

```java
switch(pilihan){
    case 1:
        tambahPeralatan();
        break;
}
```

---

## 11. Perulangan

Perulangan digunakan untuk menampilkan seluruh data peralatan.

```java
for(Peralatan p : daftarPeralatan){
    p.tampilData();
}
```

---

## 12. Input Output Sederhana

Program menggunakan `Scanner` sebagai input dan `System.out.println()` sebagai output.

```java
Scanner input = new Scanner(System.in);

System.out.print("Masukkan ID : ");
String id = input.nextLine();
```

---

## 13. Array

Program menggunakan `ArrayList` untuk menyimpan data peralatan.

```java
ArrayList<Peralatan> daftarPeralatan =
new ArrayList<>();
```

---

## 14. Error Handling

Program menggunakan `try-catch` untuk menangani kesalahan input.

```java
try{
    pilihan = input.nextInt();
}catch(Exception e){
    System.out.println("Input harus berupa angka.");
}
```


## Usulan nilai
| No  | Materi             | Nilai |
| :-: | ------------------ | :---: |
|  1  | Class              |   5   |
|  2  | Object             |   5   |
|  3  | Atribut            |   5   |
|  4  | Constructor        |   5   |
|  5  | Mutator            |   5   |
|  6  | Accessor           |   5   |
|  7  | Encapsulation      |   5   |
|  8  | Inheritance        |   5   |
|  9  | Polymorphism       |  10   |
| 10  | Seleksi            |   5   |
| 11  | Perulangan         |   5   |
| 12  | IO Sederhana       |  10   |
| 13  | Array              |  15   |
| 14  | Error Handling     |  15   |
|     | **TOTAL**          | **100** |



# Pembuat
Nama : Muhammad Raihan Ardhani
NPM : 2410010506


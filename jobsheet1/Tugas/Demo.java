package jobsheet1.Tugas;

public class Demo {
    public static void main(String[] args) {

        // Membuat objek
        Perabotan perabotan = new Perabotan();
        Piring piring = new Piring();
        Sendok sendok = new Sendok();
        Meja meja = new Meja();
        Gelas gelas = new Gelas();

        // Mengisi atribut Perabotan
        perabotan.bahan = "Kayu";
        perabotan.warna = "Cokelat";

        // Mengisi atribut Piring
        piring.bahan = "Keramik";
        piring.warna = "Putih";
        piring.bentuk = "Bulat";
        piring.ukuran = 25;

        // Mengisi atribut Sendok
        sendok.bahan = "Stainless Steel";
        sendok.warna = "Silver";
        sendok.jenis = "Oval";
        sendok.ukuran = "Sedang";

        // Mengisi atribut Meja
        meja.bahan = "Kayu";
        meja.warna = "Cokelat";
        meja.bentuk = "Persegi";
        meja.jumlahKaki = 4;

        // Mengisi atribut Gelas
        gelas.bahan = "Kaca";
        gelas.warna = "Bening";
        gelas.bentuk = "Silinder";
        gelas.kapasitas = 250;

        // Menjalankan method Perabotan
        perabotan.digunakan();
        perabotan.dibersihkan();
        perabotan.cetakInfo();

        System.out.println();

        // Menjalankan method Piring
        piring.digunakan();
        piring.dibersihkan();
        piring.tempatMakan();
        piring.dicuci();
        piring.cetakInfoPiring();

        System.out.println();

        // Menjalankan method Sendok
        sendok.digunakan();
        sendok.dibersihkan();
        sendok.mengambilMakanan();
        sendok.mengaduk();
        sendok.cetakInfoSendok();

        System.out.println();

        // Menjalankan method Meja
        meja.digunakan();
        meja.dibersihkan();
        meja.untukBelajar();
        meja.meletakkanBarang();
        meja.cetakInfoMeja();

        System.out.println();

        // Menjalankan method Gelas
        gelas.digunakan();
        gelas.dibersihkan();
        gelas.minum();
        gelas.diisi();
        gelas.cetakInfoGelas();
    }
}

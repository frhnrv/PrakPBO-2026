package jobsheet1.Tugas;

public class Sendok extends Perabotan{
    String ukuran;
    String jenis;

    public void mengambilMakanan() {
        System.out.println("Digunakan untuk mengambil makanan");
    }

    public void mengaduk() {
        System.out.println("Digunakan untuk mengaduk minuman");
    }

    public void cetakInfoSendok() {
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Jenis : " + jenis);
    }
}

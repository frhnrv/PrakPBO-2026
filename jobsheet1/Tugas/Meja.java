package jobsheet1.Tugas;

public class Meja extends Perabotan{
    String bentuk;
    int jumlahKaki;

    public void meletakkanBarang() {
        System.out.println("Untuk meletakkan barang");
    }

    public void untukBelajar() {
        System.out.println("Digunakan untuk belajar");
    }

    public void cetakInfoMeja() {
        System.out.println("bentuk : " + bentuk);
        System.out.println("Jumlah Kaki : " + jumlahKaki);
    }
}

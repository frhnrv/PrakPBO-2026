package jobsheet1.Tugas;

public class Piring extends Perabotan{
    String bentuk;
    int ukuran;

    public void dicuci() {
        System.out.println("Piring sedang dicuci");
    }

    public void tempatMakan() {
        System.out.println("Piring digunakan untuk makan");
    }

    public void cetakInfoPiring() {
        System.out.println("bentuk : " + bentuk);
        System.out.println("ukuran : " + ukuran);
    }
}
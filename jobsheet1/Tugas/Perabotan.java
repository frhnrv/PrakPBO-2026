package jobsheet1.Tugas;

public class Perabotan {
    String bahan, warna;

    public void digunakan() {
        System.out.println("Perabotan sedang digunakan");
    }

    public void dibersihkan() {
        System.out.println("Perabotan sedang dibersihkan");
    }

    public void cetakInfo() {
        System.out.println("Bahan : " + bahan);
        System.out.println("Warna : " + warna);
    }
}

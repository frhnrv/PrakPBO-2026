package jobsheet1.Tugas;

public class Gelas extends Perabotan{
    String bentuk;
    int kapasitas;

    public void minum() {
        System.out.println("Gelas digunakan untuk minum");
    }

    public void diisi() {
        System.out.println("Gelas diisi minuman");
    }

    public void cetakInfoGelas() {
        System.out.println("Bentuk : " + bentuk);
        System.out.println("Kapasitas : " + kapasitas    );
    }
}

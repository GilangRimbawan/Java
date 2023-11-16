// File: Sepatu.java
public class Sepatu {
    final String merek;
    final int ukuran;

    public Sepatu(String merek, int ukuran) {
        this.merek = merek;
        this.ukuran = ukuran;
    }

    public void deskripsi() {
        System.out.println("Ini adalah sepatu merek " + merek + " dengan ukuran " + ukuran);
    }
}

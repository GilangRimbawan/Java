// File: SepatuLari.java
public class SepatuLari extends Sepatu {
    final String tipe;

    public SepatuLari(String merek, int ukuran, String tipe) {
        super(merek, ukuran);
        this.tipe = tipe;
    }

    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sepatu lari merek " + merek + " dengan ukuran " + ukuran + " dan tipe " + tipe);
    }

    public void deskripsi(String kondisi) {
        System.out.println("Ini adalah sepatu lari merek " + merek + " dengan ukuran " + ukuran + " dan tipe " + tipe + " dalam kondisi " + kondisi);
    }
}

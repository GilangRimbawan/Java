// File: SepatuFormal.java
public class SepatuFormal extends Sepatu {
    final String warna;

    public SepatuFormal(String merek, int ukuran, String warna) {
        super(merek, ukuran);
        this.warna = warna;
    }

    @Override
    public void deskripsi() {
        System.out.println("Ini adalah sepatu formal merek " + merek + " dengan ukuran " + ukuran + " dan warna " + warna);
    }
}
